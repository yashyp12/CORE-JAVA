package arrays.leetcode;


import java.util.Arrays;

//https://leetcode.com/problems/plus-one/description/
public class plusOneLtc66 {

    static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println(Arrays.toString(plusOne(arr)));

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            //digit is 0 then continue carries to the left on
            digits[i] = 0;
        }

        //if we reach were all digits were 9
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;

    }
}
