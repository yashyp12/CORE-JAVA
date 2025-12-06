package PractArray31;

import java.util.Scanner;

public class PrimeNumArr {


    static void main(String[] args) {

//        System.out.println(isPrim(new Scanner(System.in).nextInt()));
        int[] arr = {2, 3, 4, 5, 6, 7};
        primearr(arr);
    }

    static void primearr(int[] arr) {
        for(int i =0 ; i<arr.length;i++){
            if(isPrim(arr[i])){
                System.out.println(arr[i]);            }
        }
    }

    static boolean isPrim(int num) {
        if (num < 2) return false;
        int den = 2;
        while (den * den <= num) {
            if (num % den == 0) {
                return false;
            }
            den++;
        }
        return true;
    }
}
