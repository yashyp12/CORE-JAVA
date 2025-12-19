import java.util.Arrays;

public class TrichyArr {

    static void main(String[] args) {

        // 1
        // int[] d = { 1, 2, 3, 4 };
        // for (int i = 1; i < d.length; i++) {
        // d[i] = d[i] + d[i - 1];
        // }
        // System.out.println(Arrays.toString(d));

        // 2 max el

        // int max = Integer.MIN_VALUE;
        // int []arr = { 1,2,3,4,5};
        // for(int i =0;i<arr.length;i++)
        // {
        // if(arr[i]>max) max = arr[i];
        // }

        // System.out.println(max);

        int[][] a = { { 2, 3 }, { 4, 5 } };
        int[][] b = { { 4, 5 }, { 6, 7 } };
        int[][] sum = new int[2][2];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println(Arrays.deepToString(sum));
    }
}
