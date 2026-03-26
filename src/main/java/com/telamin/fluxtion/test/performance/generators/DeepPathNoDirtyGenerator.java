package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.Fluxtion;
import com.telamin.fluxtion.test.performance.nodes.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

/**
 * Generates DeepPath and NoOp processors using the Fluxtion.compile API with dirty filtering DISABLED.
 */
public class DeepPathNoDirtyGenerator {

    private static final String SRC_ROOT = "src/main/java/";
    private static final Pattern LINE_NUM_PATTERN = Pattern.compile("^\\s*\\d+:\\s(.*)$");

    public static void main(String[] args) throws Exception {
        generate("com.telamin.fluxtion.test.performance.generated.deep", "DeepPath", false);
        generate("com.telamin.fluxtion.test.performance.generated.noop", "NoopDispatch", true);
    }

    private static void generate(String pkg, String prefix, boolean noOp) throws Exception {
        int[] sizes = {5, 10, 20, 50, 100};
        System.clearProperty(SOURCE_GENERATOR_ID_PROPERTY);

        for (int size : sizes) {
            String className = prefix + size + "Processor";
            System.out.println("Generating " + className + " in " + pkg + "...");

            PrintStream originalOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream captureStream = new PrintStream(baos);

            System.setOut(captureStream);
            try {
                ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
                Thread.currentThread().setContextClassLoader(DeepPathNoDirtyGenerator.class.getClassLoader());
                try {
                    Fluxtion.compile(
                            procCfg -> {
                                if (noOp) {
                                    MarketDataRootNode root = new MarketDataRootNode();
                                    root.setNodeId("root");
                                    NoOpNode lastNode = null;
                                    for (int i = 1; i <= size; i++) {
                                        NoOpNode newNode = new NoOpNode();
                                        newNode.setNodeId("node_" + i);
                                        newNode.setUpstream1(i == 1 ? (NoOpPathNode)root : lastNode);
                                        lastNode = newNode;
                                    }
                                    NoOpPublisherNode sink = new NoOpPublisherNode();
                                    sink.setNodeId("sink");
                                    sink.setUpstream1(lastNode);
                                    procCfg.addNode(sink, "sink");
                                } else {
                                    RootLinearNode root = new RootLinearNode();
                                    root.setNodeId("root");
                                    LinearNode lastNode = root;
                                    for (int i = 1; i <= size; i++) {
                                        LinearNode newNode = new LinearNode();
                                        newNode.setNodeId("node_" + i);
                                        newNode.setUpstream1(lastNode);
                                        lastNode = newNode;
                                    }
                                    LinearNodePublisher sink = new LinearNodePublisher();
                                    sink.setNodeId("sink");
                                    sink.setUpstream1(lastNode);
                                    procCfg.addNode(sink, "sink");
                                }
                                procCfg.setSupportDirtyFiltering(false);
                            },
                            compilerCfg -> {
                                compilerCfg.className(className);
                                compilerCfg.packageName(pkg);
                            }
                    );
                } catch (Throwable e) {
                    e.printStackTrace();
                } finally {
                    Thread.currentThread().setContextClassLoader(originalClassLoader);
                }
            } finally {
                System.setOut(originalOut);
            }

            String captured = baos.toString(StandardCharsets.UTF_8);
            String cleanSource = stripLineNumbers(captured);
            if (!cleanSource.isEmpty()) {
                Path targetPath = Paths.get(SRC_ROOT, pkg.replace('.', '/'), className + ".java");
                Files.createDirectories(targetPath.getParent());
                Files.writeString(targetPath, cleanSource);
                System.out.println("  OK: " + targetPath);
            }
        }
    }

    private static String stripLineNumbers(String captured) {
        StringBuilder sb = new StringBuilder();
        boolean inSource = false;
        try (BufferedReader reader = new BufferedReader(new StringReader(captured))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("=== GENERATED SOURCE START ===")) {
                    inSource = true;
                    continue;
                }
                if (line.contains("=== GENERATED SOURCE END ===")) {
                    inSource = false;
                    continue;
                }
                if (inSource) {
                    Matcher m = LINE_NUM_PATTERN.matcher(line);
                    if (m.find()) {
                        sb.append(m.group(1)).append("\n");
                    } else {
                        sb.append(line).append("\n");
                    }
                }
            }
        } catch (IOException e) { }
        return sb.toString();
    }
}