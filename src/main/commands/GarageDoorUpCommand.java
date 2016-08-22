package main.commands;

import main.Command;
import main.items.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private final GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public String execute() {
        return door.up();
    }
}
