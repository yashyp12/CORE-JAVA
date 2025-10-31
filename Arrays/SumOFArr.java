import java.util.Arrays;

public class SumOFArr {

    // Take an integer array of any size 4.
    // Print the sum of all elements and average without using any built-in methods.

    public static void main(String[] args) {

        // basic 1d array with size 4
        // syntax for initialssing an arrya - datatype [] arr_name = new typeof_data [];
        // ElementType[] variableName = new ElementType[length];
        // You are telling the compiler: "Create a new array of type 'int'."
        int[] arr = new int[4];

        // adding an value in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        // printing the array
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // printing
        // for(int j:arr){
        // System.out.println(j);
        // }

        // sum of all elements in the array

        System.out.println("sum of ARRAY is " + sumArr(arr));
        System.out.println(" average of arr is " + AvgArr(arr));
    }

    // printing sum of arr
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        return sum;
    }

    public static int AvgArr(int[] arr) {
        int sum = 0;
        int count = 0;
       
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            count++;
        }
        return  sum / count;
    }
}
