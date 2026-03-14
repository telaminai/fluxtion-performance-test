package com.telamin.fluxtion.test.performance.generators;

import java.util.List;

/**
 * POJO representing a benchmark-configs/*.yaml file.
 * SnakeYAML maps the YAML fields directly onto this class.
 */
public class BenchmarkConfig {

    /** Unique machine-readable identifier, e.g. "deep_path" */
    private String dimension;

    /** Human-readable title for paper/report */
    private String title;

    /** Paragraph describing what this dimension measures */
    private String description;

    /** Root event type class name used in the generated graph */
    private String rootEventClass;

    /** List of graph sizes (node counts or layer counts) to sweep */
    private List<Integer> sizes;

    /** Fully-qualified generator class that produces the Spring XML */
    private String generatorClass;

    /** Output package for generated Fluxtion processors */
    private String generatedPackage;

    /** Optional extra parameters for the generator */
    private java.util.Map<String, Object> params;

    // --- getters / setters ---

    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getRootEventClass() { return rootEventClass; }
    public void setRootEventClass(String rootEventClass) { this.rootEventClass = rootEventClass; }

    public List<Integer> getSizes() { return sizes; }
    public void setSizes(List<Integer> sizes) { this.sizes = sizes; }

    public String getGeneratorClass() { return generatorClass; }
    public void setGeneratorClass(String generatorClass) { this.generatorClass = generatorClass; }

    public String getGeneratedPackage() { return generatedPackage; }
    public void setGeneratedPackage(String generatedPackage) { this.generatedPackage = generatedPackage; }

    public java.util.Map<String, Object> getParams() { return params; }
    public void setParams(java.util.Map<String, Object> params) { this.params = params; }

    @Override
    public String toString() {
        return "BenchmarkConfig{dimension='" + dimension + "', sizes=" + sizes + "}";
    }
}
