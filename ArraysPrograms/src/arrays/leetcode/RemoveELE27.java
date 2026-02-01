package arrays.leetcode;

//https://leetcode.com/problems/remove-element/
public class RemoveELE27 {

    static void main(String[] args) {

        int[]arr = {3,2,2,3};

        System.out.println(removeElement(arr,3));



    }

     public static int removeElement(int[] nums, int val) {
        int k =0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
