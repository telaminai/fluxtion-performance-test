package com.telamin.fluxtion.test.performance.generators;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Shared utilities for all Spring XML graph generators.
 * Subclasses implement generateXml(BenchmarkConfig, int) and return the XML string.
 */
public abstract class GraphGeneratorBase {

    private static final String XML_OUTPUT_DIR = "src/main/resources/graphs";

    // -----------------------------------------------------------------------
    // Template methods
    // -----------------------------------------------------------------------

    /** Generate and write the Spring XML for the given config and size. */
    public final Path generate(BenchmarkConfig config, int size) throws IOException {
        String xml = generateXml(config, size);
        String filename = config.getDimension() + "_" + size + ".xml";
        Path outDir = Paths.get(XML_OUTPUT_DIR);
        Files.createDirectories(outDir);
        Path outFile = outDir.resolve(filename);
        Files.writeString(outFile, xml);
        System.out.println("[generator] wrote " + outFile);
        return outFile;
    }

    /** Implemented by each dimension generator. */
    protected abstract String generateXml(BenchmarkConfig config, int size);

    // -----------------------------------------------------------------------
    // XML builder helpers
    // -----------------------------------------------------------------------

    protected static String xmlHeader() {
        return """
                <?xml version="1.0" encoding="UTF-8"?>
                <beans xmlns="http://www.springframework.org/schema/beans"
                       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                       xsi:schemaLocation="http://www.springframework.org/schema/beans \
                http://www.springframework.org/schema/beans/spring-beans.xsd">
                """;
    }

    protected static String xmlFooter() {
        return "</beans>\n";
    }

    /** Single-upstream property-injected bean. */
    protected static String bean(String id, String className, String upstream1Id) {
        return "  <bean id=\"" + id + "\" class=\"" + className + "\">\n"
                + "    <property name=\"upstream1\" ref=\"" + upstream1Id + "\"/>\n"
                + "  </bean>\n";
    }

    /** Two-upstream property-injected bean (diamond/fan-in). */
    protected static String bean(String id, String className, String upstream1Id, String upstream2Id) {
        return "  <bean id=\"" + id + "\" class=\"" + className + "\">\n"
                + "    <property name=\"upstream1\" ref=\"" + upstream1Id + "\"/>\n"
                + "    <property name=\"upstream2\" ref=\"" + upstream2Id + "\"/>\n"
                + "  </bean>\n";
    }

    /** Bean with no upstreams (root node). */
    protected static String rootBean(String id, String className) {
        return "  <bean id=\"" + id + "\" class=\"" + className + "\"/>\n";
    }

    /** Bean with one upstream and an extra double property. */
    protected static String beanWithDouble(String id, String className,
                                           String upstream1Id,
                                           String propertyName, double value) {
        return "  <bean id=\"" + id + "\" class=\"" + className + "\">\n"
                + "    <property name=\"upstream1\" ref=\"" + upstream1Id + "\"/>\n"
                + "    <property name=\"" + propertyName + "\" value=\"" + value + "\"/>\n"
                + "  </bean>\n";
    }

    // -----------------------------------------------------------------------
    // YAML loading
    // -----------------------------------------------------------------------

    public static BenchmarkConfig loadConfig(String resourcePath) {
        Yaml yaml = new Yaml();
        try (InputStream is = GraphGeneratorBase.class.getClassLoader()
                .getResourceAsStream(resourcePath)) {
            if (is == null) throw new IllegalArgumentException("Resource not found: " + resourcePath);
            return yaml.loadAs(is, BenchmarkConfig.class);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** Helper: get a param as String, with a default. */
    protected static String param(Map<String, Object> params, String key, String defaultVal) {
        if (params == null) return defaultVal;
        Object v = params.get(key);
        return v == null ? defaultVal : v.toString();
    }

    /** Helper: get a param as int, with a default. */
    protected static int paramInt(Map<String, Object> params, String key, int defaultVal) {
        if (params == null) return defaultVal;
        Object v = params.get(key);
        return v == null ? defaultVal : Integer.parseInt(v.toString());
    }

    /** Helper: get a param as double, with a default. */
    protected static double paramDouble(Map<String, Object> params, String key, double defaultVal) {
        if (params == null) return defaultVal;
        Object v = params.get(key);
        return v == null ? defaultVal : Double.parseDouble(v.toString());
    }
}
