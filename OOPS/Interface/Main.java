package Interface;

public class Main extends Object {

    public static void main(String[] args) {

        ////        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();

//        can we add like type of variable as type of interface
//        Engine car = new Car();
//        this is static methods we can acces using interface name
//        what will acess depend on car type and which one wil execute depends on the object type
//        car.acc();
//        car.brake();
//        car.stop();
//        Engine.demo1();

//        i wanted to stop media player or its stoping engine to solve
        //this issue we need to create seperate classses for this interface
//        Media carMedia = new Car();
//        carMedia.stop();

        /*
        now we can add  any engine electric or power
         */
        NiceCar car = new NiceCar();

//        default power engine will be start
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();


    }
}
