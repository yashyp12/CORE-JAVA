package Inheritance.Super;

class Box {

    int height;
    int width;
    int weight;

    Box() {
        System.out.println("i am a box contructor");
        System.out.println(width);
    }


//HERE THIS IS TAKIGN THE BOX TYPE OBJ but we are passing boxWeight type obj to it means  - > MEANS Box obj = new BoxWeight();
// Box obj = obj1 -> so it has only acces of box type 
    Box(Box obj) {
        obj.weight = weight;
    }

}

class BoxWeight extends Box {

    int weight;

      BoxWeight(int weight) {
        this.weight = weight;
    }


    // COPY CONSTRUCTOR
      BoxWeight(BoxWeight obj) {
        //YOU ARE PASSSING TO THE PARNT A BOXWEIGHT TYPE OF OBJ
        super(obj);
        this.weight = obj.weight;
    }



}

public class Demo {
// 

    public static void main(String[] args) {
        

        BoxWeight obj1 = new BoxWeight(23);


    }

}



 