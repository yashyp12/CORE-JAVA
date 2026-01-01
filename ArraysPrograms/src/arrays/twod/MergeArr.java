package arrays.twod;

import java.util.Arrays;

public class MergeArr {

//    merging the 2d array

    static void main(String[] args) {

        char[][] arr = {{'a', 'b', 'c'},
                {'d', 'e', 'f'}};
        int size = 0;

        for (char[] ch : arr) {
            size += ch.length;
        }

        //make a new aray to tore all elements
        char[] ch2 = new char[size];

        //now add the elemnts to the new array
        int i = 0;
        for (char[] arr1 : arr) {
            for (char ele : arr1) {
                ch2[i++] = ele;
            }
        }

        System.out.println(Arrays.toString(ch2));
    }
}
