package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Youtubechannel youtubechannel = new Youtubechannel("my channel");

        Observer user1 = new User("user1");
        Observer user2 = new User("user2");
        Observer user3 = new User("user3");

        youtubechannel.subscribe(user1);
        youtubechannel.subscribe(user2);
        youtubechannel.subscribe(user3);

        youtubechannel.uploadVideo("new video - 1");

        youtubechannel.unSubscribe(user3);
        youtubechannel.uploadVideo("new video - 2");
    }
}
