package test;

import main.commands.*;
import main.items.CeilingFan;
import main.items.GarageDoor;
import main.items.Light;
import main.items.Stereo;
import main.remote.RemoteControl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoteControlTest {
    RemoteControl remote = new RemoteControl();

    Light livingRoom = new Light("Living Room");
    Light kitchen = new Light("Kitchen");
    CeilingFan fan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo();

    @Test
    public void initialRemoteCommandsSetToNoCommands() {
        assertEquals( "---Remote Control---\n" +
                      "0main.NoCommandmain.NoCommand\n" +
                      "1main.NoCommandmain.NoCommand\n" +
                      "2main.NoCommandmain.NoCommand\n" +
                      "3main.NoCommandmain.NoCommand\n" +
                      "4main.NoCommandmain.NoCommand\n" +
                      "5main.NoCommandmain.NoCommand\n" +
                      "6main.NoCommandmain.NoCommand\n" , getRemote());
    }

    @Test
    public void complexRemoteCanHandleMultipleCommands() {
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoom);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoom);
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        assertEquals("Light in the Living Room is On", remote.onButtonWasPushed(0));
        assertEquals("Light in the Living Room is Off", remote.offButtonWasPushed(0));
    }

    @Test
    public void canTurnKitchenLightOnAndOff() {
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchen);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        assertEquals("Light in the Kitchen is On", remote.onButtonWasPushed(1));
        assertEquals("Light in the Kitchen is Off", remote.offButtonWasPushed(1));
    }

    @Test
    public void canTurnCeilingFanOnAndOff() {
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
        remote.setCommand(2, fanOn, fanOff);
        assertEquals("Ceiling fan in the Living Room is On", remote.onButtonWasPushed(2));
        assertEquals("Ceiling fan in the Living Room is Off", remote.offButtonWasPushed(2));
    }

    @Test
    public void canTurnGarageDoorOnAndOff() {
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        remote.setCommand(3, garageDoorUp, garageDoorDown);
        assertEquals("The garage door is open", remote.onButtonWasPushed(3));
        assertEquals("The garage door is closed", remote.offButtonWasPushed(3));
    }
    
    @Test
    public void canTurnStereoWithCDOnAndOff() {
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        remote.setCommand(4, stereoOnWithCD, stereoOffWithCD);
        assertEquals("Stereo is On", remote.onButtonWasPushed(4));
        assertEquals("Stereo is Off", remote.offButtonWasPushed(4));
    }

    private String getRemote() {
        return remote.display();
    }
}
