package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size");
        // int size = sc.nextInt();

        // int []arr = new int[size];

        // System.out.println("before : " + Arrays.toString(arr));

        // for(int i =0;i<size;i++){
        // System.out.println("Enter " + (i+1) + "ele : ");
        // arr[i] = sc.nextInt();
        // }

        // System.out.println("After : " + Arrays.toString(arr));

        // **************************************************
        // char[] arr = new char[26];
        // System.out.println("before : " + Arrays.toString(arr));

        // for (char ch = 'A'; ch <= 'Z'; ch++) {
        // arr[ch - 65] = ch;
        // }

        // System.out.println("After : " + Arrays.toString(arr));
        // ************************************

        // System.out.println("ENter the size ");
        // int size = new Scanner(System.in).nextInt();

        // int[] arr = new int[size];
        // for (int i = 0; i < size; i++) {
        // int randomValue = (int) (Math.random() * 100);
        // if (randomValue < 10) {
        // i--;
        // continue;
        // }
        // arr[i] = randomValue;
        // }

        // System.out.println("aftr " + Arrays.toString(arr));

        // ************************************

        char[] arr = new char[26];

        System.out.println(Arrays.toString(arr));

        for (int i = 1, cnt = 0;; i++) {

            char ch = (char) (Math.random() * 100);
            if (ch >= 65 && ch <= 90) {
                if (!(checkCharacter(arr, ch)))
                    arr[cnt++] = ch;
            }

            if (cnt == 26)
                break;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static boolean checkCharacter(char[] arr, char ch) {
        for (char ele : arr)
            if (ele == ch)
                return true;
        return false;

    }
}
