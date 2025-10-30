public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 25, 35, 2, 54, 8};

        System.out.println(max(arr));
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


}
