import java.util.Arrays;

public class ColNoFixed {
    //here we dont fixed the column
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[i]));

//            size of array on that particular row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //            System.out.println(Arrays.deepToString(arr));
    }
}
