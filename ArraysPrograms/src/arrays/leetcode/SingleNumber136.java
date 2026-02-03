package arrays.leetcode;
//https://leetcode.com/problems/single-number/
public class SingleNumber136 {

    static void main(String[] args) {
        int[]arr = {4,1,2,1,2};
        System.out.println(SingleNumber(arr));

    }

    public static int SingleNumber(int[]nums){
        int ans = 0;

        for(int num:nums){
            ans = ans^num;
        }

        return ans;
    }
}
