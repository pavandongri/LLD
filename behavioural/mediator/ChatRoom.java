package behavioural.mediator;

import java.util.LinkedHashMap;
import java.util.Map;

public class ChatRoom implements Mediator {
    // Keyed by name so lookup is direct and duplicate names are caught
    private final Map<String, User> users;

    public ChatRoom() {
        this.users = new LinkedHashMap<>();
    }

    @Override
    public void addUser(User user) {
        if (users.containsKey(user.getName())) {
            System.out.println("User " + user.getName() + " already exists");
            return;
        }
        users.put(user.getName(), user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getName());
    }

    @Override
    public void send(User from, String to, String message) {
        if (!isMember(from)) {
            return;
        }

        User toUser = users.get(to);
        if (toUser == null) {
            System.out.println(to + " user doesn't exist. So message cannot be sent to " + to);
            return;
        }
        toUser.receive(from.getName(), message);
    }

    @Override
    public void broadcast(User from, String message) {
        if (!isMember(from)) {
            return;
        }

        for (User user : users.values()) {
            if (user != from) {
                user.receive(from.getName(), message);
            }
        }
    }

    private boolean isMember(User user) {
        if (users.get(user.getName()) != user) {
            System.out.println(user.getName() + " is not part of this chat room. Message not sent");
            return false;
        }
        return true;
    }
}
