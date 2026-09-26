package Creational.singleton;

public class ImprovedThreadSafeSingleton {
    private static volatile ImprovedThreadSafeSingleton instance = null;

    private ImprovedThreadSafeSingleton(){}

    public static ImprovedThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ImprovedThreadSafeSingleton.class) {
                instance = new ImprovedThreadSafeSingleton();
            }
        }
        return instance;
    }
}

/*
*/