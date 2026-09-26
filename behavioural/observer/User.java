package behavioural.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println("Notification : Hey " + this.name + " new video got uploaded... + " + video);
    }
}
