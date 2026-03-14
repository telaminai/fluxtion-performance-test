package com.telamin.fluxtion.test.performance;

import com.telamin.fluxtion.test.performance.generated.DiamondMeshProcessor;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class DiamondMeshBenchmark {

    private DiamondMeshProcessor fluxtionProcessor;
    private PublishProcessor<Integer> rxRoot;
    private AtomicInteger rxResult;
    private int eventValue = 0;

    @Setup
    public void setup() {
        // Fluxtion Setup
        fluxtionProcessor = new DiamondMeshProcessor();
        fluxtionProcessor.init();

        // RxJava3 Setup
        rxRoot = PublishProcessor.create();
        Flowable<Integer>[] currentLayer = new Flowable[10];
        
        // Root is at layer 0
        Flowable<Integer> rootFlowable = rxRoot;
        
        // Layer 1
        for (int n = 0; n < 10; n++) {
            currentLayer[n] = rootFlowable.map(v -> v + v + 1);
        }
        
        // Layers 2 to 10
        for (int l = 2; l < 11; l++) {
            Flowable<Integer>[] nextLayer = new Flowable[10];
            for (int n = 0; n < 10; n++) {
                Flowable<Integer> dep1 = currentLayer[n];
                Flowable<Integer> dep2 = currentLayer[(n + 1) % 10];
                nextLayer[n] = Flowable.zip(dep1, dep2, (v1, v2) -> v1 + v2 + 1);
            }
            currentLayer = nextLayer;
        }
        
        rxResult = new AtomicInteger();
        // Subscribe to all nodes in the last layer to ensure they all execute
        // and pick one for the blackhole.
        for(int n=0; n<10; n++) {
            final int nodeIdx = n;
            currentLayer[n].subscribe(v -> {
                if(nodeIdx == 0) {
                    rxResult.set(v);
                }
            });
        }
    }

    @Benchmark
    public void testFluxtion(Blackhole bh) {
        fluxtionProcessor.onEvent(++eventValue);
        bh.consume(fluxtionProcessor.node_10_0.getValue());
    }

    @Benchmark
    public void testRxJava(Blackhole bh) {
        rxRoot.onNext(++eventValue);
        bh.consume(rxResult.get());
    }
}
