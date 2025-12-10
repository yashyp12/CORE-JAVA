package PractArray31;

public class SecondLarget {

   public static void main(String[] args) {
       int []arr = {12,12,41};

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
           }else if (arr[i]>SecondLargst && arr[i] <largest){
               SecondLargst = arr[i];
           }
       }

        return SecondLargst == Integer.MIN_VALUE ? -1 : SecondLargst;
    }
}
