package Creational.singleton;

public class EagerSingletone {
    private static final EagerSingletone instance = new EagerSingletone();

    private EagerSingletone(){}

    public static EagerSingletone getInstance(){
        return instance;
    }
}


/*
Issue: 
This implementation is thread safe, because the instance is created at the time of class loading, and the class loading mechanism ensures that only one thread can load a class at a time.
But this consumes memory even if the instance is never used, because the instance is created at the time of class loading, which may be unnecessary if the instance is never used.
*/