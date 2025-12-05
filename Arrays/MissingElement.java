
public class MissingElement {
    public static void main(String[] args) {

        // find the missing element from the ary {1,2,3,5}

        int[] arr = { 1, 2, 3, 5 };
        System.out.println(MissingElement(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

    }

    static int MissingElement(int[] arr) {
        int sum = 0;
        int n = arr.length + 1; // because 1 no is missing

        for (int ele : arr) {
            sum += ele;
        }

        int expectedSum = n * (n + 1) / 2;

        return expectedSum - sum;
    }
}
