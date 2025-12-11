package ArrayBasics;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        // int[] a; // 1 -d arr
        // int b[]; // // 1-d
        // int[][] c; // 2-d
        // int[] d[]; // same as int [][]d
        // int[][] e; // 2d array
        // int[] f, g; // both f and g are int []
        // int h[], i; // h is int[] , i is varaible
        // int[] j[], k; // j is int [][] , k is int[]
        // int[][] l[], m, n; // l is [][][] and m and n are int[][]
        // int[][] aa[], bb[], cc; // aa and bb are int[][][] cc is int[][]

        // int[][] jaggedArr = {
        // { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 }
        // };

        // System.out.println(Arrays.deepToString(jaggedArr));

        byte[][] a = new byte[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        System.out.println(Arrays.deepToString(a));

    }
}
