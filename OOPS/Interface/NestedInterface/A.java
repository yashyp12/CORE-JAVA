package Interface.NestedInterface;

public class A {

//    NESTED INTERFACE


    public interface NestedInterface {

        boolean isOdd(int num);

    }
}


class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        //checking in the bitwise
        /*
        isOdd(int num) explanation
Goal: Check if an integer is odd using bitwise logic.
Key Concept: Odd numbers have a 1 as their rightmost (least significant) bit in binary. Even numbers have a 0.
The Check: (num & 1) isolates the rightmost bit of num.
& is the bitwise AND operator.
1 (binary ...0001) acts as a mask, hiding all other bits.
How it Works:
Odd number: ...1 & ...1 results in 1. The comparison 1 == 1 is true.
Even number: ...0 & ...1 results in 0. The comparison 0 == 1 is false.
Why Use This? It is often faster and more efficient than using the modulo operator (%), as it operates directly on the binary data.
         */
       return (num & 1) ==1;
    }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.isOdd(7));
    }
}