package behavioural.command;

public class Light {
    public String color;

    public Light(String color) {
        this.color = color;
    }

    public void turnOn() {
        System.out.println("Light with color:" + this.color + " , turned on");
    }

    public void turnOff() {
        System.out.println("Light with color:" + this.color + " , turned off");
    }
}
