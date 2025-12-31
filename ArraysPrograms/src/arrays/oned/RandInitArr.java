package arrays.oned;

import java.util.Arrays;
import java.util.Scanner;

public class RandInitArr {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//                arr1 = new int[(int) (Math.random() * 10)];
//        randomInit(arr1);

        char[]ch = new char[26];
//        charInitRandom(ch);
        DistinctRand();
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
    static void DistinctRand(){

        int []arr = new int[40];

        for(int i =1, cnt=0;;i++){
            int num = (int)(Math.random()*100);
            if(num>=20 && num<=60){
                if(checkNumber(arr,num)){
                    arr[cnt++] = num;
                }
            }
            if(cnt==40) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean checkNumber(int[] arr, int num) {
        for(int ele:arr){
            if(ele==num) return false;

        }
        return true;
    }

//

}
