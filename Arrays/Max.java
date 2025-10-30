public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 25, 35, 2, 54, 8};

        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    // step 1 - compare the mx val with arr[1] then star compare one by one till last
    //if you found greater val add it to max otherwise move forward run the loop over the arrays
    static int max(int[] arr) {
        //imagine that array is not empty
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


//    pritn the max value between the rangee
    static int maxRange(int[]arr,int start,int end){
        int max =arr[start];
        for(int i =start; i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
