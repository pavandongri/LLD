package behavioural.observer;

public interface Target {
    public void subscribe(Observer observer);

    public void unSubscribe(Observer observer);

    public void notifySubscribers();
}
