public class ArraySum2 {
    public static void main(String[] args) {

        int[] arr = { 25, 65, 36, 25 };

        System.out.println("sum of the array is " + SumArr(arr));


    }

    static int SumArr(int[] arr) {

        int sum = 0;

        // sum of an array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }
}
