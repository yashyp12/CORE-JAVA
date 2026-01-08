package arrays.searching.LinearSearch;
import java.util.Arrays;

public class UnionDriver {

    static void main(String[] args) {

        int []arr1 = {10,20,30,40};
        int []arr2 = {10,20,50,60,70};
        System.out.println("printing the union array" + Arrays.toString(unionArr(arr1,arr2)));
    }

static int countCommon(int[]arr1,int[]arr2){
    int count = 0;

    if(arr1.length<arr2.length){
        for(int i =0;i< arr1.length;i++){
            if(contains(arr1[i],arr2)){
                count++;
            }
        }
    }
    return count;
}

static int[] unionArr(int []arr1,int[]arr2){

//    to create an union arr first we need an res array to stoer the union elemtns in it
    int []union = new int[arr1.length+arr2.length -(countCommon(arr1,arr2))];

    int i = 0;
//    first ad elemetn form teh array1
    for (int j : arr1) {
        union[i++] = j;
    }

//    now only addd teh non comon elemtns only
    for(int k =0;k<arr2.length;k++){
        if(!contains(arr2[k],arr1))
        {
            union[i++] = arr2[k];
        }
    }

    return union;
//    now
}

static boolean contains(int num, int []arr){
    for(int ele:arr){if (ele==num) return true; }
    return false;
}
}