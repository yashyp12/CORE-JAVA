package PractArray31;

import java.util.Arrays;

public class duplicateElement {

    public static void main(String[] args) {

        int[] arr = { 12, 21, 25, 12, 21 };

        int[] count = duplicate(arr);
        // print duplicates
        // for (int i = 0; i < count.length; i++) {
        // if (count[i] > 1) {
        // System.out.println(arr[i]);
        // }
        // }

        // removeDuplicate
        // int[] distinct = removeDuplicate(arr, count);
        // System.out.println("distinct elements ");

        // for (int i : distinct) {
        //     System.out.print(i + " ");
        // }


        uniDupSepArr(arr, count);



    }

    public static int[] duplicate(int[] arr) {
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (count[i] == -1)
                continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    count[j] = -1;
                }
            }

            count[i] = cnt;
        }
        return count;
    }

    // remov duplicates
    public static int[] removeDuplicate(int[] arr, int[] count) {

        // coutn how many distinct elements
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                size++;
            }
        }

        // stepn 2 - > crata an array of exact siz
        int[] distinct = new int[size];
        int index = 0;

        // step 3 -> copt only the distinct element to th ary
        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                distinct[index] = arr[i];
                index++;
            }
        }

        return distinct;
    }


    // all in onee
    public static void uniDupSepArr(int[] arr, int[] count) {

        // uncut - unique count , dupcnt - dup count , repeat - mor than 0 freq
        int uncnt = 0, dupcnt = 0, repeat = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count[i] == -1) {
                dupcnt++;
            } else if (count[i] == 1) {
                uncnt++;
            } else if (count[i] > 1) {
                repeat++;
            }
        }

        int[] uncntar = new int[uncnt];
        int[] dupcntar = new int[dupcnt];
        int[] repeatcnt = new int[repeat];

        // adding elements to the arrays
        for (int i = 0, j = 0, k = 0, l = 0; i < arr.length; i++) {

            if (count[i] == 1) {
                uncntar[j] = arr[i];
                j++;
            } else if (count[i] > 1) {
                repeatcnt[k] = arr[i];
                k++;
            } else if (count[i] == -1) {
                dupcntar[l] = arr[i];
                l++;
            }
        }

        System.out.println("UNIQUE  : " + Arrays.toString(uncntar));
        System.out.println("REPEATED: " + Arrays.toString(repeatcnt));
        System.out.println("DUPLICATE : " + Arrays.toString(dupcntar));

    }

}
