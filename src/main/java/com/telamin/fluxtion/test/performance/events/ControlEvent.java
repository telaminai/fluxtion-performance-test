package com.telamin.fluxtion.test.performance.events;

import com.telamin.fluxtion.runtime.event.Event;

/**
 * Enables or disables propagation through named processing paths.
 * Used by: dirty_filter benchmark — 90% of these events suppress downstream computation.
 */
public class ControlEvent implements Event {
    public enum Command { ENABLE, DISABLE, RESET }

    private final String targetPath;
    private final Command command;
    private final double threshold;

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
