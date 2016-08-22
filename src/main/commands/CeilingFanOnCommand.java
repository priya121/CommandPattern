package main.commands;

import main.items.CeilingFan;
import main.Command;

public class CeilingFanOnCommand implements Command {
    private final CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public String execute() {
        return fan.on();
    }
}
