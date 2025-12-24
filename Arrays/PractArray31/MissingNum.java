package PractArray31;

import java.util.Arrays;

//find the missing num from an array
// [1,2,3,5 ] - FORMULA WORKS ONLY FOR THE 1 TO NATURAL NUMBERS
public class MissingNum {

   public static void main(String[] args) {
//       int []arr = {1,2,3,5};
//       int n = arr.length+1;
//       int sum = 0;
//       int expectedSum = n *(n+1)/2;



//       num not startin with 1 and sorted array
       int [] arr = {12,13,15,16};

       for(int i =0;i<arr.length-1;i++){
           if(arr[i+1]!= arr[i]+1){
               System.out.println("missing number is " + (arr[i]+1));
               break;
           }
       }
    }

    static class cumulativSum {

        public static void main(String[] args) {

            int[] arr = { 1, 3, 5, 7 };

            prefixSum1(arr);

            System.out.println(Arrays.toString(arr));
        }

        static void prefixSum1(int[] arr) {
            if (arr == null || arr.length == 0)
                return;

            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i - 1];
            }
        }

    }
}
