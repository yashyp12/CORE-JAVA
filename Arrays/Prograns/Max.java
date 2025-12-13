public class Max {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7 };

        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    // step 1 - compare the mx val with arr[1] then star compare one by one till last
    //if you found greater val add it to max otherwise move forward run the loop over the arrays
    // static int max(int[] arr) {
    //     //imagine that array is not empty
    //     if(arr.length == 0) System.out.println("array is empty");

    //     int max = arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }



static int max(int[]arr){
    if(arr.length==0) System.out.println("array is empty");

    int max= arr[0];

    for(int i =0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }

    return max;

}





//    pritn the max value between the rangee
    static int maxRange(int[]arr,int start,int end){

        if(end>start) return -1;

        if(arr==null) return -1;

        int max =arr[start];
        for(int i =start; i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
