package Inheritance.Polymorphism.TypeCasting;

public class TypeCast1 {

    public static void main(String[] args) {

        System.out.println("Type Castingm is a conversion");
        System.out.println("Converting the smaller datatype to the bigger one ");
        System.out.println("one type of data assigned to another type of variable " +
                "automatic type conversion take place " +
                " 1 - Two types should be compatible ");


//        basically when you try to cast this one
//        int a = 257;
//        byte b = (byte) a; 256%257 = 1
//        System.out.println(Byte.MAX_VALUE);

////        autoamatic type conversion in expression
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);


//        wheneve we do any arithmetic operation in java -
//        (+-*/) - done of smaller types (byte short char)
//        its automatically prommoted to int before performing operation

//        byte b = 50;
//        b = b*2; //b*2 is an int

//        automatic type conversion
//        java follows unicode principles
        int num = 'a';
        System.out.println(num);


    }
}
