package com.telamin.fluxtion.test.performance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class DiamondXmlGenerator {
    public static void main(String[] args) {
        generateDiamondXml(11, 10); // 1 + 10 * 10 = 101 nodes
    }

    public static void generateDiamondXml(int layers, int nodesPerLayer) {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"\n");
        xml.append("       xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
        xml.append("       xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd\">\n");

        // Root Node
        xml.append("  <bean id=\"node_0_0\" class=\"com.telamin.fluxtion.test.performance.RootNode\"/>\n");

        for (int l = 1; l < layers; l++) {
            for (int n = 0; n < nodesPerLayer; n++) {
                String id = "node_" + l + "_" + n;
                xml.append("  <bean id=\"").append(id).append("\" class=\"com.telamin.fluxtion.test.performance.BenchmarkNode\">\n");
                
                // Link to two nodes in the previous layer
                String dep1;
                String dep2;
                if (l == 1) {
                    dep1 = "node_0_0";
                    dep2 = "node_0_0";
                } else {
                    dep1 = "node_" + (l - 1) + "_" + n;
                    dep2 = "node_" + (l - 1) + "_" + ((n + 1) % nodesPerLayer);
                }
                
                xml.append("    <property name=\"upstream1\" ref=\"").append(dep1).append("\"/>\n");
                xml.append("    <property name=\"upstream2\" ref=\"").append(dep2).append("\"/>\n");
                xml.append("  </bean>\n");
            }
        }
        xml.append("</beans>");
        
        File resourcesDir = new File("src/main/resources");
        if (!resourcesDir.exists()) {
            resourcesDir.mkdirs();
        }
        
        try (FileWriter writer = new FileWriter("src/main/resources/benchmark-graph.xml")) {
            writer.write(xml.toString());
            System.out.println("Generated src/main/resources/benchmark-graph.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
