package Interface;

public interface Engine {

    //    by default it is final and static
    static final int PRICE = 780000;

    void start();

    void stop();

    void acc();

    void brake();
}

