package Inheritance;

public class BoxWeight extends Box{

double width;
int roll =4;

public BoxWeight(){
    this.width = 5;
}

//    public BoxWeight(double side, double length, double weight, double width) {
//        super(side, length, weight);
////        USED TO intialise value present in parent class
//        this.width = width;
//    }

BoxWeight(BoxWeight obj){
    super(obj);
    this.width = obj.width;
    this.roll = obj.roll;

}

}



