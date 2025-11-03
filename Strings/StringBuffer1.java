package Strings;
import java.util.Random;
import java.util.random.*;

public class StringBuffer1 {

    public static void main(String[] args) {

//        System.out.println("String Buffer ");
//    StringBuffer buffer1 = new StringBuffer("Yash");
//
//    buffer1.append("yp");
//        System.out.println(buffer1);
//
//        buffer1.reverse();
//        System.out.println(buffer1);
//
//        String str = buffer1.toString();

        //CONSTURCTOR 1
        StringBuffer sb = new StringBuffer();
        sb.append("dem44444444444444444444444o");
        // intial capacity of buffer is 16 but after adding data
        // it has formula (capacity*2) +2   - so it becoesmes 34
        System.out.println(sb.capacity());

//        constructor no 2
        StringBuffer sb2 = new StringBuffer("Yash Patil");

//        constructor no 3  - we can specify the capasity there
        StringBuffer sb3 = new StringBuffer(30);

        Random random = new Random();
        System.out.println(random.nextInt());
    }
}
