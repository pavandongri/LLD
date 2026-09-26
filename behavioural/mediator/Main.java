package behavioural.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoom();
        User pavan = new User("Pavan", chatRoom);
        User kumar = new User("Kumar", chatRoom);
        User dongri = new User("Dongri", chatRoom);

        chatRoom.addUser(pavan);
        chatRoom.addUser(kumar);
        chatRoom.addUser(dongri);

        System.out.println("=== Direct messages ===");
        pavan.send("Kumar", "Hi Kumar");
        pavan.send("Dongri", "Hi Dongri");
        kumar.send("Pavan", "Hello Pavan");
        dongri.send("Pavan", "Hello Pavan");

        System.out.println("\n=== Broadcast ===");
        kumar.broadcast("Meeting at 5pm");

        System.out.println("\n=== Invalid cases ===");
        pavan.send("Ravi", "Are you there?");
        chatRoom.addUser(new User("Kumar", chatRoom));
        User outsider = new User("Outsider", chatRoom);
        outsider.send("Pavan", "I never joined");

        System.out.println("\n=== After Dongri leaves ===");
        chatRoom.removeUser(dongri);
        pavan.send("Dongri", "Still there?");
        pavan.broadcast("Bye everyone");
    }
}
