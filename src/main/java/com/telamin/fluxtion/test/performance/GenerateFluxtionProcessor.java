package com.telamin.fluxtion.test.performance;

import com.telamin.fluxtion.builder.extern.spring.FluxtionSpring;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GenerateFluxtionProcessor {
    public static void main(String[] args) {
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
