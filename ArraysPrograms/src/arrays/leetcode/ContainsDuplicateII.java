package arrays.leetcode;
//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {


    static void main(String[] args) {
        int[]arr = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(arr,3));
    }

     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;

        for(int i =0;i<n;i++){
            //only check upto k positions ahead
            for(int j =i+1;j<n && j<=i+k;j++){
                if(nums[i]==nums[j]) return true;
            }
        }


        return false;
    }
}
