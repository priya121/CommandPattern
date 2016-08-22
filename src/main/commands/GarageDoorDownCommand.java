package main.commands;

import main.Command;
import main.items.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private final GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public String execute() {
        return door.down();
    }
}
