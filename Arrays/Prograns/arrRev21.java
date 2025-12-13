import java.util.Arrays;

public class arrRev21 {


    public static void main(String[] args) {

        int [] arr = {2,34,5,6,56};

        System.out.println(Arrays.toString(arr));

arrRev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrRev(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swaparr24(arr,start,end);
            start++;
            end--;
        }
    }

    static void swaparr24(int[]arr,int index1,int index2){

        Swap.swap(arr, index1, index2);
    }

}
