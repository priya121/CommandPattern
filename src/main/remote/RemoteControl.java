package main.remote;

import main.Command;
import main.NoCommand;

public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public String onButtonWasPushed(int slot) {
        return onCommands[slot].execute();
    }

    public String offButtonWasPushed(int slot) {
        return offCommands[slot].execute();
    }

    public String display() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("---Remote Control---\n");
        for (int i = 0; i < onCommands.length; i ++) {
            stringBuffer.append(i);
            stringBuffer.append(onCommands[i].getClass().getName());
            stringBuffer.append(offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
