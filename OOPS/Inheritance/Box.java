package Inheritance;

public class Box {

    static double length;
    double height;
    double weight;

    Box() {
        this.length = -1;
        this.height = -1;
        this.weight = -1;
    }

    //    cube
    Box(double side) {
        this.weight = side;
        this.height = side;
        this.length = side;
    }

    Box(double side,double length,double weight) {
        this.weight = side;
        this.height = side;
        this.length = side;
    }

    Box(Box oldBox){
        this.height = oldBox.height;
        this.weight = oldBox.weight;
        this.length = oldBox.length;
    }

    public void information(){
        System.out.println("Running the box");
    }


}

 