package MULTIDIMENSIONAL_ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimenARR {


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3];
// for accessing the element we need to initialse both rrows and columns in the array
        for(int row = 0; row<arr.length; row++){
            for(int col =0;col <arr[row].length; col++){
               arr[row][col] = new Scanner(System.in).nextInt();
            }
        }


    }
}
