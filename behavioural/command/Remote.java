package behavioural.command;

public class Remote {
    private Command command;

    public Remote(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
