package arrays.leetcode;

import java.util.Arrays;

public class TwoSum {
/*
1. Two Sum
Easy
Topics
premium lock icon
Companies
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

    static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] ans = twoSum(arr, 9);

        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return arr;

    }
}
