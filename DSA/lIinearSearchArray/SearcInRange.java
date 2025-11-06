package DSA.lIinearSearchArray;

import java.util.Scanner;

public class SearcInRange {


    public static void main(String[] args) {
//        arr = [ ]

        Scanner sc = new Scanner(System.in);
        int Start = sc.nextInt();
        int End = sc.nextInt();
        int Target = sc.nextInt();
        int[] arr = {12, 78, 2, 5, 6, 5,45,25};
//        ENTER THE RANGE OF INDEX OF ARRAY TO FIND
        System.out.println(RangeSearch(arr, Target, Start, End));
    }

    static int RangeSearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) return -1;

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
