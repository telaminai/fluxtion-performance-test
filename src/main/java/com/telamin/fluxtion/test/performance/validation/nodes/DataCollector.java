package com.telamin.fluxtion.test.performance.validation.nodes;

import com.telamin.fluxtion.runtime.annotations.Initialise;
import com.telamin.fluxtion.runtime.annotations.builder.FluxtionIgnore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Shared data-collection sink injected into every validation node.
 *
 * Each node calls {@link #record(String)} when its {@code @OnTrigger} method executes.
 * After the event processor returns, tests read {@link #getFiredNodes()} to verify:
 *   <ul>
 *     <li>Correct nodes fired (matching the activeIds set in the event).</li>
 *     <li>Each node fired <em>exactly once</em> (glitch-free diamond propagation).</li>
 *     <li>Nodes fired in topological order (parent IDs appear before child IDs).</li>
 *   </ul>
 *
 * Call {@link #reset()} between event cycles. Because Fluxtion event processing is
 * strictly single-threaded and synchronous, no synchronisation is needed here.
 *
 * For multi-cycle history (e.g. benchmark validation), call {@link #snapshot()} to
 * archive the current cycle's results before resetting.
 */
public class DataCollector {

    @FluxtionIgnore
    private List<String> firedNodes = new ArrayList<>();
    @FluxtionIgnore
    private List<List<String>> history  = new ArrayList<>();

    /** Called by Fluxtion lifecycle to make this a proper graph participant (enables wiring). */
    @Initialise
    public void onInit() { /* no-op — lists are initialised at field declaration */ }

    /** Called by each node when it executes during an event cycle. */
    public void record(String nodeId) {
        firedNodes.add(nodeId);
    }

    /** Fired nodes in execution order for the current (or last completed) cycle. */
    public List<String> getFiredNodes() {
        return Collections.unmodifiableList(firedNodes);
    }

    /**
     * Archives the current cycle's fired-node list into history, then clears
     * the in-progress list ready for the next event cycle.
     */
    public void snapshot() {
        history.add(new ArrayList<>(firedNodes));
        firedNodes.clear();
    }

    /** Clears the in-progress list without archiving. */
    public void reset() {
        firedNodes.clear();
    }

    /** All archived cycles (oldest first). */
    public List<List<String>> getHistory() {
        return Collections.unmodifiableList(history);
    }

    /** Clears both the in-progress list and the full history. */
    public void fullReset() {
        firedNodes.clear();
        history.clear();
    }

    /** How many times {@code nodeId} appears in the current cycle's fired list. */
    public long countFirings(String nodeId) {
        return firedNodes.stream().filter(nodeId::equals).count();
    }
}
