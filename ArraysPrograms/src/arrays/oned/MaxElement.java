package arrays.oned;

public class MaxElement {

    static void main(String[] args) {
        int[] arr = {1, 8,9, 4,8, 5, 6, 7};
//        largestEl1(arr);
//        smallestEl1(arr);
        secondLargest(arr);
    }

    //find the first largest element from the array
    static void largestEl1(int[] arr) {
        int max = Integer.MIN_VALUE;
       for(int ele:arr){
           if(ele>max){
               max=ele;
           }
       }
        System.out.println("Arrays 1st largest element " + max);
    }


    static void smallestEl1(int[] arr) {
        int min = Integer.MAX_VALUE;
       for(int ele:arr){
           if(ele<min){
               min=ele;
           }
       }
        System.out.println("Arrays 1st smallestt element " + min);
    }

//
    static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max){
                max2 = max;
                max = ele;
            }
            else if(ele > max2){
                max2 = ele;
            }
        }

        System.out.println("Arrays 2ND largest element " + max2);
    }
}