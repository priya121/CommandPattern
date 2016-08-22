package main.commands;

import main.Command;
import main.items.Stereo;

public class StereoOffWithCDCommand implements Command {
    private final Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        return stereo.off();
    }
}
