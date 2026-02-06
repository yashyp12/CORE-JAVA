package arrays.leetcode;
//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {


    static void main(String[] args) {
        int[]arr = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(arr,3));
    }

     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        

        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]== nums[j] && (j-i) <=k){
                    return true;
                }
            }
        }

        return false;
    }
}
