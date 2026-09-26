package Creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = null;
    private ThreadSafeSingleton(){}

    public static synchronized  ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

/*
This is thread safe, because the getInstance() method is synchronized, which means that only one thread can execute it at a time.

But this implementation has a performance issue, because the synchronized keyword makes the method slower, especially when multiple threads are trying to access it.

Even after instance is created, every call to getInstance() will be synchronized, which is unnecessary.
*/