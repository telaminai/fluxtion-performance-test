package com.telamin.fluxtion.test.performance;

import com.telamin.fluxtion.builder.extern.spring.FluxtionSpring;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static com.telamin.fluxtion.builder.compile.generation.EventProcessorGenerator.SOURCE_GENERATOR_ID_PROPERTY;

public class GenerateFluxtionProcessor {
    public static void main(String[] args) {
        System.setProperty(SOURCE_GENERATOR_ID_PROPERTY, "local");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                "src/main/resources/benchmark-graph.xml"
        );
        FluxtionSpring.compileAot(
                context,
                "DiamondMeshProcessor",
                "com.telamin.fluxtion.test.performance.generated"
        );
        context.close();
    }
}
