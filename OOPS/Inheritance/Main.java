package Inheritance;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(4,3,5);
//        System.out.println(box.length);
//
//        BoxWeight obj = new BoxWeight();
//        System.out.println(obj.weight + " " + obj.height);
//
//        BoxWeight box4 = new BoxWeight(2,3,4,0);
//        System.out.println("");


//IT is the type of refernce variable -
//        it is referencing to the object of type boxWeight
        /*
        now the box5 hass acces of itself memmbers also along with parent class members also
        you have only access -
            When a refernece to a subclass object - is assigned to a super class reference variable
            you will only have access those parts of the obj that is define in super class

         */

        // Box box5 = new BoxWeight(2, 3, 4, 2);
        // System.out.println(box5.width);



/*    There are many variables in both parent and child classes
            we are given access to variables that are the ref type i.e BoxWeight
            hence, we should have acces to weight variable
            This also means , that the onces we are trying to acces should be initialised
            but here, when the obj itself is of type parent class, how will we call the constructor of child class

SIMPLE THING TEH CHILD CAN INHERIT THE PARENT CLASS
BUT THE PARENT CLAS CANNOT THE CHILD HE DONT KNWO ABOUT THE MEMBERS OF CHILD CLASSS
        */

    //    BoxWeight box6  = new Box(1,2,3,4);
    //    System.out.println(box6);




    }
}