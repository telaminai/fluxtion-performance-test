package com.telamin.fluxtion.test.performance.generators;

import com.telamin.fluxtion.Fluxtion;
import com.telamin.fluxtion.test.performance.nodes.LinearNode;
import com.telamin.fluxtion.test.performance.nodes.LinearNodePublisher;
import com.telamin.fluxtion.test.performance.nodes.RootLinearNode;

public class NoDirtyFlagGenerator {

    public static void main(String[] args) {
        Fluxtion.compile(
                procCfg ->{
                    RootLinearNode root = new RootLinearNode();
                    LinearNode node = new LinearNode();
                    node.setUpstream1( root);
                    LinearNodePublisher sink = new LinearNodePublisher();
                    sink.setUpstream1(node);
                    procCfg.addNode(sink, "sink");

                    procCfg.setSupportDirtyFiltering(false);
                },
                compilerCfg ->{
                    compilerCfg.className("NoDirtyFlagGenerator")
                            .packageName("com.telamin.fluxtion.test.performance.generated");
                }
        );
    }
}
