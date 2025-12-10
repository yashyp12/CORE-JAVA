package PractArray31;

import java.util.Arrays;

public class sortingAsc {


   public static void main(String[] args) {

       int []arr = { 4,3,2,1,7};

       for(int i =0;i<arr.length;i++){
           for(int j =i+1; j<arr.length;j++){
               if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }

       }

       System.out.println("sorted arrays is " + Arrays.toString(arr));
    }
}
