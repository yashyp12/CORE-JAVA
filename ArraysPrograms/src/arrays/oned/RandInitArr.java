package arrays.oned;

import java.util.Arrays;
import java.util.Scanner;

public class RandInitArr {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//                arr1 = new int[(int) (Math.random() * 10)];
//        randomInit(arr1);

        char[]ch = new char[26];
        charInitRandom(ch);
//        DistinctRand();
    }

    static void randomInit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
    }


    //    initialsing char array wiht the random function
    static void charInitRandom(char[] charr) {
        int random = 65 + (int) (Math.random() * 25);

        for (int i = 0; i < charr.length; i++) {

            if (random > 90) {
                random = 65;
            }
            charr[i] = (char) random;
            random++;
        }

        System.out.println(Arrays.toString(charr));
    }


//    printing random numbers from 20 to 60 without duplicates
//    static void DistinctRand(){
//        int randomNumber = 20 +(int)(Math.random()*10);
//        for(int i =20;i<=60;i++){
//            if(randomNumber>60)
//            {
//                randomNumber = 20;
//                System.out.println(randomNumber);
//                randomNumber++;
//            }
//
//            System.out.println(randomNumber);
//        }
//    }

}
