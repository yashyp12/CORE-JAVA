package Inheritance;

public class Box {

    static double length;
    double height;
    double weight;

    int width = -1;

    Box() {
        super(); // calls the constructor of object class
        //used to intialsed the values present in the parent class
        this.length = -1;
        this.height = -1;
        this.weight = -1;
        this.width  = 3;

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

 