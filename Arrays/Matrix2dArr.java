
import java.util.Scanner;

public class Matrix2dArr {
    // Create a 3x3 matrix and print the sum of each row separately.
    // (Use nested loops properly.)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // int[][] arr = { { 1, 2, 3 }, { 2, 3, 6 }, { 5, 6, 6 } };

        for (int row = 0; row < arr.length; row++) {

            // taking input in array
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        // printing sum of each row seperaely
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];

            }
            System.out.println("sum is " + sum);
        }

        // System.out.println(Arrays.deepToString(arr));

    }

}
