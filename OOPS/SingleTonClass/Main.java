package SingleTonClass;

public class Main {

    public static void main(String[] args) {

        //only one obj will created in memory whatevre obj you create it will give you only the
        // same obj refernce
        Singleton sc = Singleton.getInstance();
        Singleton sc1 = Singleton.getInstance();
        Singleton sc3 = Singleton.getInstance();
        Singleton sc4 = Singleton.getInstance();

    }
}
