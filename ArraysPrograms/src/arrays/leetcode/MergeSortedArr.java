package arrays.leetcode;

import java.util.Arrays;

//ltc 88
//https://leetcode.com/problems/merge-sorted-array/description/?source=submission-ac
public class MergeSortedArr {

    static void main(String[] args) {

//m = 3 . n = 3
        //internally its returning m which contains the num2 element spacealso
        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {4,5,6};

        merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[]nums1,int m,int[]num2, int n){


        for(int i =0;i<n;i++){
            nums1[m++] = num2[i];
        }

        bubbleSort(nums1);
    }

    private static void bubbleSort(int[] arr) {

        for(int i =0;i<arr.length;i++){
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }


}
