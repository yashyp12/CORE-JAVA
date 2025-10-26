package Interface;

public class Car implements Engine, Brake,Media {


    @Override
    public void start() {
        System.out.println("i start engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car ");
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
