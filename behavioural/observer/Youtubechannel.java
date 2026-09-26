package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Youtubechannel implements Target {
    private List<Observer> observers;
    private String name;
    private String latestVideo;

    public Youtubechannel(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : observers) {
            observer.update(latestVideo);
        }
    }

    public void uploadVideo(String video) {
        this.latestVideo = video;
        this.notifySubscribers();
    }

}
