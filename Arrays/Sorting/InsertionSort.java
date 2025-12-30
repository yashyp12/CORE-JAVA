import java.util.Arrays;

class InsertionSort{

    public static void main(String[] args) {
        int []arr = {6,5,7,4,8,3,9,2,0,1};

        System.out.println("beforer " + Arrays.toString(arr));
        insertionSort1(arr,arr.length);
        System.out.println("After " + Arrays.toString(arr));
    }

    static void insertionSort1(int []arr,int n){
        for(int i=1;i<n;i++){

            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}