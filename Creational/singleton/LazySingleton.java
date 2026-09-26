package Creational.singleton;

class LazySingleton{
    private static LazySingleton simpleSingletonInstance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(simpleSingletonInstance == null){
            simpleSingletonInstance = new LazySingleton();
        }

        return simpleSingletonInstance;
    }
}

/*
Issues: 
this is not thread safe. 
if multiple threads call getInstance() at the same time, they may create multiple instances of simpleSingleton.
*/