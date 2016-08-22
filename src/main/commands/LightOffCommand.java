package main.commands;

import main.Command;
import main.items.Light;

public class LightOffCommand implements Command {
        private final Light light;

        public LightOffCommand(Light light) {
            this.light = light;
        }

        @Override
        public String execute() {
            return light.off();
        }
}
