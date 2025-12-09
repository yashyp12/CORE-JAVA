package PractArray31;

import java.util.Arrays;

//find the missing num from an array
// [1,2,3,5 ]
public class MissingNum {

   public static void main(String[] args) {
       int []arr = {12,13,15,16};
       int n = arr.length+1;
       int sum = 0;
       int expectedSum = n *(n+1)/2;

       for(int i =0;i<arr.length;i++){
           sum += arr[i];
       }

       System.out.println("missing element are " +  (expectedSum - sum));

    }
}
