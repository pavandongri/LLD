package behavioural.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light("green");

        LightTurnOnCommand lightTurnOnCommand = new LightTurnOnCommand(light);
        LightTurnOffCommand lightTurnOffCommand = new LightTurnOffCommand(light);

        Remote remote = new Remote(lightTurnOnCommand);
        remote.press();

        remote.setCommand(lightTurnOffCommand);
        remote.press();
    }
}
