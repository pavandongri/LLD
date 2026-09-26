package behavioural.mediator;

public class User {
    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void send(String to, String message) {
        mediator.send(this, to, message);
    }

    public void broadcast(String message) {
        mediator.broadcast(this, message);
    }

    public void receive(String from, String message) {
        System.out.println(this.name + " got message from " + from + ". Message = " + message);
    }
}
