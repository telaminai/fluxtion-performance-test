package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.Fluxtion;
import com.telamin.fluxtion.test.performance.events.*;
import com.telamin.fluxtion.test.performance.nodes.*;
import com.telamin.fluxtion.test.performance.service.*;
import com.telamin.fluxtion.test.performance.validation.events.*;
import com.telamin.fluxtion.test.performance.validation.nodes.*;
import com.telamin.fluxtion.builder.generation.config.EventProcessorConfig;
import com.telamin.fluxtion.runtime.partition.LambdaReflection.SerializableConsumer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

public class GenerateAllProcessors {

    private static final String SRC_ROOT = "src/main/java/";

    public static void main(String[] args) throws Exception {
        System.clearProperty(SOURCE_GENERATOR_ID_PROPERTY);

        deleteGeneratedProcessors();

        runSafe(() -> generateDeepPath());
        runSafe(() -> generateNoOpDispatch());
        runSafe(() -> generateDiamondMesh());
        runSafe(() -> generateHotPath());
        runSafe(() -> generatePolymorphic());
        runSafe(() -> generateDirtyFilter());
        runSafe(() -> generateIntermediateHandlers());
        runSafe(() -> generateMultiEventPath());
        runSafe(() -> generateValidationDiamond());
        runSafe(() -> generateShortChain());

        System.out.println("\n=== Generation process completed (check logs for errors) ===");
    }

    private static void runSafe(Runnable r) {
        try {
            r.run();
        } catch (Throwable t) {
            System.err.println("Dimension failed: " + t.getMessage());
        }
    }

    private static void deleteGeneratedProcessors() throws IOException {
        System.out.println("=== Deleting previously generated processors ===");
        String[] packages = {
            "com.telamin.fluxtion.test.performance.generated.deep",
            "com.telamin.fluxtion.test.performance.generated.noop",
            "com.telamin.fluxtion.test.performance.generated.diamond",
            "com.telamin.fluxtion.test.performance.generated.hotpath",
            "com.telamin.fluxtion.test.performance.generated.polymorphic",
            "com.telamin.fluxtion.test.performance.generated.dirtyfilter",
            "com.telamin.fluxtion.test.performance.generated.intermediate",
            "com.telamin.fluxtion.test.performance.generated.multievent",
            "com.telamin.fluxtion.test.performance.validation.generated",
            "com.telamin.fluxtion.test.performance.generated.service"
        };
        for (String pkg : packages) {
            Path dir = Paths.get(SRC_ROOT, pkg.replace('.', '/'));
            if (Files.exists(dir)) {
                try (var stream = Files.walk(dir)) {
                    stream.filter(p -> p.toString().endsWith(".java"))
                            .forEach(p -> {
                                try { Files.delete(p); } catch (IOException ignored) {}
                            });
                }
            }
        }
    }

    private static void generateDeepPath() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.deep";
        int[] sizes = {5, 10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "DeepPath" + size + "Processor", procCfg -> {
                RootLinearNode root = new RootLinearNode();
                LinearNode last = root;
                for (int i = 1; i <= size; i++) {
                    LinearNode n = new LinearNode();
                    n.setUpstream1(last);
                    last = n;
                }
                LinearNodePublisher sink = new LinearNodePublisher();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
                procCfg.setSupportDirtyFiltering(false);
            });
        }
    }

    private static void generateNoOpDispatch() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.noop";
        int[] sizes = {5, 10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "NoopDispatch" + size + "Processor", procCfg -> {
                RootNoOpNode root = new RootNoOpNode();
                NoOpNode last = root;
                for (int i = 1; i <= size; i++) {
                    NoOpNode n = new NoOpNode();
                    n.setUpstream1(last);
                    last = n;
                }
                NoOpPublisherNode sink = new NoOpPublisherNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
                procCfg.setSupportDirtyFiltering(false);
            });
        }
    }

    private static void generateDiamondMesh() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.diamond";
        int size = 101;
        compileAotSafe(pkg, "DiamondMesh101Processor", procCfg -> {
            DiamondMeshRootNode root = new DiamondMeshRootNode();
            DiamondMeshNode last = root;
            for (int i = 1; i < size; i++) {
                DiamondMeshNode n = new DiamondMeshNode();
                n.setUpstream1(last);
                n.setUpstream2(root);
                last = n;
            }
            DiamondMeshPublisherNode sink = new DiamondMeshPublisherNode();
            sink.setUpstream1(last);
            procCfg.addNode(sink, "sink");
        });
    }

    private static void generateHotPath() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.hotpath";
        int[] sizes = {2, 4, 8, 16, 32};
        for (int size : sizes) {
            compileAotSafe(pkg, "HotPath" + size + "Processor", procCfg -> {
                HotPathRootNode root = new HotPathRootNode();
                for (int i = 0; i < size; i++) {
                    HotPathFilteringNode f = new HotPathFilteringNode();
                    f.setUpstream1(root);
                    HotPathAccumulatorNode a = new HotPathAccumulatorNode();
                    a.setUpstream1(f);
                    if (i == 0) {
                        HotPathPublisherNode sink = new HotPathPublisherNode();
                        sink.setUpstream1(a);
                        procCfg.addNode(sink, "sink");
                    } else {
                        procCfg.addNode(a);
                    }
                }
            });
        }
    }

    private static void generatePolymorphic() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.polymorphic";
        int[] sizes = {5, 10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "Polymorphic" + size + "Processor", procCfg -> {
                PolymorphicRootNode root = new PolymorphicRootNode();
                PolymorphicNode last = root;
                for (int i = 1; i <= size; i++) {
                    PolymorphicNode n;
                    int type = i % 3;
                    if (type == 0) n = new PolymorphicBaseNode();
                    else if (type == 1) n = new PolymorphicAccumulatorNode();
                    else n = new PolymorphicTransformNode();
                    
                    n.setUpstream1(last);
                    last = n;
                }
                PolymorphicPublisherNode sink = new PolymorphicPublisherNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
            });
        }
    }

    private static void generateDirtyFilter() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.dirtyfilter";
        int[] sizes = {10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "DirtyFilter" + size + "Processor", procCfg -> {
                DirtyFilterControlRootNode root = new DirtyFilterControlRootNode();
                DirtyFilterNode last = root;
                for (int i = 1; i <= size; i++) {
                    DirtyFilterNode n;
                    if (i % 3 == 0) n = new DirtyFilterFilteringNode();
                    else n = new DirtyFilterBaseNode();
                    
                    n.setUpstream1(last);
                    last = n;
                }
                DirtyFilterPublisherNode sink = new DirtyFilterPublisherNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
            });
        }
    }

    private static void generateIntermediateHandlers() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.intermediate";
        int[] sizes = {5, 10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "IntermediateHandlers" + size + "Processor", procCfg -> {
                IntermediateHandlersRootNode root = new IntermediateHandlersRootNode();
                IntermediateHandlersNode last = root;
                for (int i = 1; i <= size; i++) {
                    IntermediateHandlersNode n = new IntermediateHandlersNode();
                    n.setUpstream1(last);
                    last = n;
                }
                IntermediateHandlersPublisherNode sink = new IntermediateHandlersPublisherNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
            });
        }
    }

    private static void generateMultiEventPath() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.multievent";
        int[] sizes = {5, 10, 20, 50, 100};
        for (int size : sizes) {
            compileAotSafe(pkg, "MultiEventPath" + size + "Processor", procCfg -> {
                MultiEventPathRootNode root = new MultiEventPathRootNode();
                MultiEventPathNode last = root;
                for (int i = 1; i <= size; i++) {
                    MultiEventPathNode n = new MultiEventPathNode();
                    n.setUpstream1(last);
                    last = n;
                }
                MultiEventPathPublisherNode sink = new MultiEventPathPublisherNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
            });
        }
    }

    private static void generateValidationDiamond() {
        String pkg = "com.telamin.fluxtion.test.performance.validation.generated";
        int[] sizes = {3, 5, 10};
        for (int size : sizes) {
            compileAotSafe(pkg, "ValidationDiamond" + size + "Processor", procCfg -> {
                DataCollector collector = new DataCollector();
                EventContext context = new EventContext();

                // MD Chain
                ValidationMarketRootNode mdRoot = new ValidationMarketRootNode();
                mdRoot.setNodeId("md_root");
                mdRoot.setDataCollector(collector);
                mdRoot.setEventContext(context);
                procCfg.addNode(mdRoot, "md_root");
                
                List<ValidationNode> prevMdLayer = List.of(mdRoot);
                for (int l = 1; l <= size; l++) {
                    List<ValidationNode> currentLayer = new ArrayList<>();
                    for (int n = 0; n < size; n++) {
                        ValidationBaseNode nm = new ValidationBaseNode();
                        String id = "md_l" + l + "_n" + n;
                        nm.setNodeId(id);
                        nm.setDataCollector(collector);
                        nm.setEventContext(context);
                        nm.setUpstream1(prevMdLayer.get(n % prevMdLayer.size()));
                        if (prevMdLayer.size() > 1) {
                            nm.setUpstream2(prevMdLayer.get((n + 1) % prevMdLayer.size()));
                        }
                        procCfg.addNode(nm, id);
                        currentLayer.add(nm);
                    }
                    prevMdLayer = currentLayer;
                }
                ValidationSinkNode mdSink = new ValidationSinkNode();
                mdSink.setNodeId("md_sink");
                mdSink.setDataCollector(collector);
                mdSink.setEventContext(context);
                if (prevMdLayer.size() >= 1) mdSink.setUpstream1(prevMdLayer.get(0));
                if (prevMdLayer.size() >= 2) mdSink.setUpstream2(prevMdLayer.get(1));
                if (prevMdLayer.size() >= 3) mdSink.setUpstream3(prevMdLayer.get(2));
                if (prevMdLayer.size() >= 4) mdSink.setUpstream4(prevMdLayer.get(3));
                if (prevMdLayer.size() >= 5) mdSink.setUpstream5(prevMdLayer.get(4));
                procCfg.addNode(mdSink, "md_sink");

                // TS Chain
                ValidationTradeRootNode tsRoot = new ValidationTradeRootNode();
                tsRoot.setNodeId("ts_root");
                tsRoot.setDataCollector(collector);
                tsRoot.setEventContext(context);
                procCfg.addNode(tsRoot, "ts_root");
                
                List<ValidationNode> prevTsLayer = List.of(tsRoot);
                for (int l = 1; l <= size; l++) {
                    List<ValidationNode> currentLayer = new ArrayList<>();
                    for (int n = 0; n < size; n++) {
                        ValidationAccumulatorNode nt = new ValidationAccumulatorNode();
                        String id = "ts_l" + l + "_n" + n;
                        nt.setNodeId(id);
                        nt.setDataCollector(collector);
                        nt.setEventContext(context);
                        nt.setUpstream1(prevTsLayer.get(n % prevTsLayer.size()));
                        if (prevTsLayer.size() > 1) {
                            nt.setUpstream2(prevTsLayer.get((n + 1) % prevTsLayer.size()));
                        }
                        procCfg.addNode(nt, id);
                        currentLayer.add(nt);
                    }
                    prevTsLayer = currentLayer;
                }
                ValidationSinkNode tsSink = new ValidationSinkNode();
                tsSink.setNodeId("ts_sink");
                tsSink.setDataCollector(collector);
                tsSink.setEventContext(context);
                if (prevTsLayer.size() >= 1) tsSink.setUpstream1(prevTsLayer.get(0));
                if (prevTsLayer.size() >= 2) tsSink.setUpstream2(prevTsLayer.get(1));
                if (prevTsLayer.size() >= 3) tsSink.setUpstream3(prevTsLayer.get(2));
                if (prevTsLayer.size() >= 4) tsSink.setUpstream4(prevTsLayer.get(3));
                if (prevTsLayer.size() >= 5) tsSink.setUpstream5(prevTsLayer.get(4));
                procCfg.addNode(tsSink, "ts_sink");

                // Control Chain
                ValidationControlRootNode ctrlRoot = new ValidationControlRootNode();
                ctrlRoot.setNodeId("ctrl_root");
                ctrlRoot.setDataCollector(collector);
                ctrlRoot.setEventContext(context);
                procCfg.addNode(ctrlRoot, "ctrl_root");
                
                List<ValidationNode> prevCtrlLayer = List.of(ctrlRoot);
                int ctrlSize = Math.max(1, size / 4);
                for (int l = 1; l <= ctrlSize; l++) {
                    List<ValidationNode> currentLayer = new ArrayList<>();
                    for (int n = 0; n < ctrlSize; n++) {
                        ValidationBaseNode nc = new ValidationBaseNode();
                        String id = "ctrl_l" + l + "_n" + n;
                        nc.setNodeId(id);
                        nc.setDataCollector(collector);
                        nc.setEventContext(context);
                        nc.setUpstream1(prevCtrlLayer.get(n % prevCtrlLayer.size()));
                        procCfg.addNode(nc, id);
                        currentLayer.add(nc);
                    }
                    prevCtrlLayer = currentLayer;
                }
                ValidationBaseNode ctrlSink = new ValidationBaseNode();
                ctrlSink.setNodeId("ctrl_sink");
                ctrlSink.setDataCollector(collector);
                ctrlSink.setEventContext(context);
                if (prevCtrlLayer.size() >= 1) ctrlSink.setUpstream1(prevCtrlLayer.get(0));
                if (prevCtrlLayer.size() >= 2) ctrlSink.setUpstream2(prevCtrlLayer.get(1));
                if (prevCtrlLayer.size() >= 3) ctrlSink.setUpstream3(prevCtrlLayer.get(2));
                procCfg.addNode(ctrlSink, "ctrl_sink");
                
                // shared sink for blackhole
                ValidationSinkNode mainSink = new ValidationSinkNode();
                mainSink.setNodeId("sink");
                mainSink.setDataCollector(collector);
                mainSink.setEventContext(context);
                mainSink.setUpstream1(mdSink);
                mainSink.setUpstream2(tsSink);
                procCfg.addNode(mainSink, "sink");
            });
        }
    }

    private static void generateShortChain() {
        String pkg = "com.telamin.fluxtion.test.performance.generated.service";
        int[] sizes = {3, 5, 10};
        for (int size : sizes) {
            compileAotSafe(pkg, "ShortChain" + size + "Processor", procCfg -> {
                ShortChainRootNode root = new ShortChainRootNode();
                ShortChainNode last = root;
                for (int i = 1; i <= size; i++) {
                    ShortChainNode n = new ShortChainNode();
                    n.setUpstream1(last);
                    last = n;
                }
                ShortChainSinkNode sink = new ShortChainSinkNode();
                sink.setUpstream1(last);
                procCfg.addNode(sink, "sink");
            });
        }
    }

    private static void compileAotSafe(String pkg, String className, SerializableConsumer<EventProcessorConfig> configurer) {
        System.out.println("Generating " + className + " in " + pkg + "...");
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(GenerateAllProcessors.class.getClassLoader());
        try {
            Fluxtion.compileAot(configurer, pkg, className);
            System.out.println("  OK");
        } catch (Throwable t) {
            System.err.println("  FAILED (source may still be written): " + t.getMessage());
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }
}
