package PractArray31;

public class SecondLarget {

   public static void main(String[] args) {
       int []arr = {21,12,14,16,17,20};

 int result = secondLargest21(arr);
       System.out.println(result);

    }

    static int secondLargest21(int []arr){

       if(arr.length<2) return -1;

       int largest = Integer.MIN_VALUE;
       int SecondLargst = Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               SecondLargst = largest;
               largest = arr[i];
           }else if (arr[i]>SecondLargst){
               SecondLargst = arr[i];
           }
       }

        return SecondLargst;
    }
}
