import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        // MOVE ALL ZEROS TO THE END
        // k - position of the non zero elements
        // if found non zero increment it

        int[] arr = {0, 4, 0, 1, 0, 3};

        int k = 0;

        System.out.println("before update " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            } 
        }

        // now k has position of non zero
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }

        // final arry
        System.out.println("after updation " + Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[]arr){
        int k =0 ;

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }
}
