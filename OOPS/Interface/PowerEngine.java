package Interface;

public class PowerEngine implements Engine {

    @Override
    public void brake() {

    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }

    //        System.out.println("i am static");
    //    }
    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    @Override
    public void start() {
        System.out.println("power engine starts");
    }
}
