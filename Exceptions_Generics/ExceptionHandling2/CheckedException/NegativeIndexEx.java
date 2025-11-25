package Exceptions_Generics.ExceptionHandling2.CheckedException;

import java.util.Arrays;

public class NegativeIndexEx {

    static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        try{
              int []arr = new int[-12]; // index cannot be negative
              System.out.println(Arrays.toString(arr));
        }catch (NegativeArraySizeException e){
            System.out.println("index out of bound");
        }
    }
}
