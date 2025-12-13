import java.util.Arrays;
import java.util.Scanner;

public class SumofMultiArr {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        [
        [1,2,3,4]  /row 1
        [2,3,4,5]   /row2
        ]
         */

        int[][] arr = new int[2][2];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr) );

    }
}
