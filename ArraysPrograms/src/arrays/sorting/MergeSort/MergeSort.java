package MergeSort;

import java.util.Arrays;

//https://youtu.be/iKGAgWdgoRk?si=sp55fZV90B-KO1XS
public class MergeSort {

    static void main(String[] args) {
    int[]arr = {5,4,3,2,1};

    arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[]arr){


        if(arr.length==1) return arr;

        int mid = arr.length/2;

        //we need to pass a copy of orignal range array
//original array is not sorted
        int[]left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); // the of Range uses the exclusive of index of last thats why we usedth len

        //merge it and return it
        return merge(left,right);


    }


    private static int[] merge(int[] first, int []second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j< second.length){

            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //itmay be possible that one of the arrays is not complete
        //add all the remining to the array
        //copy the remaining elements
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<first.length){
            mix[k] = second[j];
            j++;
            k++;
        }
return mix;

    }
}
