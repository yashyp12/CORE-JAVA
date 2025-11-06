package DSA.lIinearSearchArray;

public class FindMinarr {

   public static void main(String[] args) {
        int[] arr = {13,24,12,7,25,10};
       System.out.println(minNum(arr));
    }

    // return teh min value in the array
    static int minNum(int arr[]){
        //assume arr length is not equals to 0
        int ans = arr[0];
        // we have taken int i =1 bcz we alredy checking index of 0
        for(int i =1; i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
       return ans;
    }
}
