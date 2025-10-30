import java.util.Arrays;
//swap the arrays using index
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,33,55,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[]arr,int index1,int index2){
//        just swap the array using index
        int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }
}
