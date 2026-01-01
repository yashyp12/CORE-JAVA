package arrays.oned;


import java.util.Arrays;

//merge the 2 sorted array
/*
Always pick the smallest available element
and put it into the result array

we are using 3 pointers to maintain its indexes
- POINTERS (VERY IMPORTANT)
Pointer	Purpose
i	current index in arr1
j	current index in arr2
k	current index in result array
 */
public class MergeArr {

    static void main(String[] args) {
        int[]arr1 = {5,7,8};
        int []arr2 = {10,12,13};
        mergeSortedArr(arr1,arr2);
    }

    static void mergeSortedArr(int[]arr1,int[]arr2){

        //step 1 - create an res array to store teh final array
        int[]res = new int[arr1.length+arr2.length];

        // stpe 2- maintiang 3 pointers  i->arr1 , j-> arr2, k -> res array
        /*
        arr1 [ 1 2 3 ]
        arr2  [4 5 6 ]
        res [1, ]
         */


        int i =0,j=0,k=0;

//        step 3 - comapre the arr1 and arr2 elemtns , add the smallest in teh res arr
        // let the i iterate till the arr1 , j will till arr2 , k will res
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <=arr2[j]){
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }

        // now add teh remainign elements of the arr1 to result
        while(i<arr1.length){
            res[k++] = arr1[i++];
        }

        //now also add remainign the arr2 to the result
        while(j<arr2.length){
            res[k++] = arr2[j++];
        }

        System.out.println("Sorted Array is " + Arrays.toString(res));
    }
}
