package main.items;

public class CeilingFan {
    private final String room;

    public CeilingFan(String room) {
        this.room = room;
    }

    public String on() {
        return "Ceiling fan in the " + room + " is On";
    }

    public String off() {
        return "Ceiling fan in the " + room + " is Off";
    }
}
