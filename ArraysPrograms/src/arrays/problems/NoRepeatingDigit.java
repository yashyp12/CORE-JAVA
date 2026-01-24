package arrays.problems;

// arrays pd  quetion no 101
public class NoRepeatingDigit {

    static void main(String[] args) {

        int[][] arr = {{1, 20}, {9, 19}};
        for (int[] arr1 : arr) {
            System.out.println(solve(arr1));
        }
    }

    private static int solve(int[] arr1) {

        int start = arr1[0], end = arr1[1];
        for (; start <= end; start++) {
            System.out.println(start + " ");
        }
        System.out.println();
        return 0;

    }
}
