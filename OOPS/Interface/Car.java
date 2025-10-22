package Interface;

public class Car implements Engine, Brake {


    @Override
    public void start() {
        System.out.println("i start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car ");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like normal car");
    }

    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }



//   brake



}
