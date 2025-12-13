import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 36, 5, 9};
//    swap(arr,0,4);
        reverseARR(arr);
        System.out.println(Arrays.toString(arr));

    }

    //this will work for even num arrays and odd num arrays
//    THIS IS CALLED TWO POINTER METHOD
    // remember here we are passing the reference of array so it will modifies the original array
    //In Java, when you pass a primitive type (like int, char) to a method, the method works on a copy of the value.
// But when you pass an object (like an array or an ArrayList), you are passing a reference to the original object in memory.
//    Both the main() method and the reverseARR() method are looking at and changing the exact same array in memory.
    static void reverseARR(int[] arr) {
//        WE ARE TAKING INDEX FROM 0
        int start = 0;
        // we are taking index val so we need to use length-1
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    static void swap(int[] arr, int index1, int index2) {
        Swap.swap(arr, index1, index2);
    }

}
