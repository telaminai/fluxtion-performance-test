package com.telamin.fluxtion.test.performance.validation.events;

import java.util.Set;

/**
 * Control event carrying a command and threshold payload.
 * Routes through the Control chain in the validation diamond graph —
 * the shortest chain (max(1, size/4)) representing a rare, low-latency
 * administrative operation.
 */
public class ValidationControlEvent extends ValidationEvent {

    public enum Command { ENABLE, DISABLE, RESET }

    private String targetPath;
    private Command command;
    private double threshold;

    public ValidationControlEvent() {}

    public ValidationControlEvent(Set<String> activeIds, long seq,
                                  String targetPath, Command command, double threshold) {
        super(activeIds, seq);
        this.targetPath = targetPath;
        this.command = command;
        this.threshold = threshold;
    }

    public void update(Set<String> activeIds, long seq,
                       String targetPath, Command command, double threshold) {
        super.update(activeIds, seq);
        this.targetPath = targetPath;
        this.command = command;
        this.threshold = threshold;
    }

    public String getTargetPath() { return targetPath; }
    public Command getCommand() { return command; }
    public double getThreshold() { return threshold; }
    public void setTargetPath(String targetPath) { this.targetPath = targetPath; }
    public void setCommand(Command command) { this.command = command; }
    public void setThreshold(double threshold) { this.threshold = threshold; }
}
