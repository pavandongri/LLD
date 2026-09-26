package behavioural.mediator;

interface Mediator {
    void addUser(User user);

    void removeUser(User user);

    void send(User from, String to, String message);

    void broadcast(User from, String message);
}
