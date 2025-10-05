package SingleTonClass;

public class Singleton {
    int num = 10;

    //singleton class - only can create one object of
    //we need only one instance
    private Singleton() {
    }

    //created an object
    private static Singleton instance;

    public static Singleton getInstance() {
        //check whether one obj is only created or not
        if (instance == null) {
            instance = new Singleton();
        }
//        otherwise it will return same one
        return instance;
    }
}
