package main;

public class NoCommand implements Command {
    @Override
    public String execute() {
        return "";
    }
}
