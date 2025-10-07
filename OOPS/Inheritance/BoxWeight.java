package Inheritance;

public class BoxWeight extends Box{

double width;

public BoxWeight(){
    this.width = 5;
}

    public BoxWeight(double side, double length, double weight, double width) {
        super(side, length, weight);
//        USED TO intialise value present in parent class
        this.width = width;
    }
}



