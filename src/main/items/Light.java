package main.items;

public class Light {
    private String roomLight;

    public Light(String roomLight) {
        this.roomLight = roomLight;
    }

    public String on() {
        return "Light in the " + roomLight + " is On";
    }

    public String off() {
        return "Light in the " + roomLight + " is Off";
    }
}
