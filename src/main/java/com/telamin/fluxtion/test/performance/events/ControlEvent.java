package com.telamin.fluxtion.test.performance.events;
import com.telamin.fluxtion.runtime.event.Event;
/**
 * Enables or disables propagation through named processing paths.
 * Used by: dirty_filter, multi_event_path benchmarks.
 *
 * In dirty_filter, 90% of events are DISABLE — the compiled Fluxtion guard
 * check at the root arrests the entire downstream graph in ~1 ns, while
 * RxJava must still traverse its subscriber list before each filter() discards.
 *
 * Fields are intentionally mutable so benchmark harnesses can pre-allocate
 * a single instance and update it in-place before each onEvent() call,
 * enabling the JMH GC profiler (-prof gc) to report 0 B/op for Fluxtion.
 */
public class ControlEvent implements Event {
    public enum Command { ENABLE, DISABLE, RESET }
    private String targetPath;
    private Command command;
    private double threshold;

    public ControlEvent(String targetPath, Command command, double threshold) {
        this.targetPath = targetPath;
        this.command = command;
        this.threshold = threshold;
    }

    public static ControlEvent enable(String targetPath) {
        return new ControlEvent(targetPath, Command.ENABLE, 0);
    }

    public static ControlEvent disable(String targetPath) {
        return new ControlEvent(targetPath, Command.DISABLE, 0);
    }

    public static ControlEvent withThreshold(String targetPath, double threshold) {
        return new ControlEvent(targetPath, Command.RESET, threshold);
    }

    // Mutable update — allows object reuse in benchmarks
    public void update(String targetPath, Command command, double threshold) {
        this.targetPath = targetPath;
        this.command = command;
        this.threshold = threshold;
    }

    public void setCommand(Command command) { this.command = command; }
    public void setThreshold(double threshold) { this.threshold = threshold; }
    public void setTargetPath(String targetPath) { this.targetPath = targetPath; }

    public String getTargetPath() { return targetPath; }
    public Command getCommand() { return command; }
    public double getThreshold() { return threshold; }
    public boolean isEnabled() { return command == Command.ENABLE; }

    @Override
    public String filterString() { return targetPath; }

    @Override
    public String toString() {
        return "ControlEvent{targetPath='" + targetPath + "', command=" + command
                + ", threshold=" + threshold + "}";
    }
}
