// January Mini Console Project #6
// Smart Home System
// Author: Nikhil Parmar

interface SmartDevice {
    public void turnOn();
    public void turnOff();
}

class LightBulb implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("\uD83D\uDCA1 Bulb is glowing");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("\uD83C\uDF11 Bulb is turned off");
    }
}

class Fan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("\uD83C\uDF2A\uFE0F Fan is spinning at speed 5");
    }

    @Override
    public void turnOff() {
        System.out.println("\uD83D\uDED1 Fan is stopped");
    }
}

class MusicPlayer implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("\uD83C\uDFB6 Playing Arijit music");
    }

    @Override
    public void turnOff() {
        System.out.println("⏹\uFE0F Music Stopped");
    }
}

class smartHome {
    void controlDevice(SmartDevice device) {
        System.out.println("\n\uD83D\uDD17 Connecting to device...");
        device.turnOn();
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        smartHome remote = new smartHome();

        SmartDevice bulb = new LightBulb();
        SmartDevice Fan = new Fan();
        SmartDevice Music = new MusicPlayer();

        remote.controlDevice(bulb);
        remote.controlDevice(Fan);
        remote.controlDevice(Music);
    }
}
