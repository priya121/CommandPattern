package main.commands;

import main.Command;
import main.items.Stereo;

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;

    }
    @Override
    public String execute() {
        return stereo.on();
    }
}
