import java.util.Arrays;

public class jaggedarr {
    public static void main(String[] args) {
        // int[][]a = new int[2][];

        // a[0] = new int[2];
        // a[1] = new int[4];

        // System.out.println(Arrays.deepToString(a) );

        int[][][] a = new int[3][][];
        a[0] = new int[2][3];
        a[1] = new int[1][5];
        a[2] = new int[2][];
        a[3] = new int[3][];
        a[4] = new int[3][];

        // a[0][0][0] = 1;
        // a[0][0][1] = 2;
        // a[0][0][2] = 3;

        System.out.println(Arrays.deepToString(a));
    }
}
