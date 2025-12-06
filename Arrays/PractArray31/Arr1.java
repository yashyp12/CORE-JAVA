package PractArray31;

import java.util.Arrays;
import java.util.Scanner;


class Demo{

}
public class Arr1 {

    static void main(String[] args) {

        int []arr = new int[5];

        for(int i =0;i<arr.length;i++){
            arr[i] = new Scanner(System.in).nextInt();
        }

//        System.out.println(Arrays.toString(arr));

        for(int ele: arr){
            System.out.print(ele);
        }
//
//        Demo []arr2 = new Demo[4];
//        for (int i = 0 ;i<arr2.length;i++){
//            arr2[i] = new Demo();
//        }
//
//


    }
}
