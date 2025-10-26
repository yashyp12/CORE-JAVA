package Interface;

public class ElectricEngine implements Engine {

    @Override
    public void brake() {

    }

    @Override
    public void start() {
        System.out.println("electric engine starts");
    }

    //        System.out.println("i am static");
    //    }
    @Override
    public void stop() {
        System.out.println("electric engine stops");
    }

    @Override
    public void acc() {
        System.out.println("electric engine acelerate");
    }
}
