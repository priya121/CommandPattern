package main.commands;

import main.items.CeilingFan;
import main.Command;

public class CeilingFanOffCommand implements Command {
    private final CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public String execute() {
        return fan.off();
    }
}
