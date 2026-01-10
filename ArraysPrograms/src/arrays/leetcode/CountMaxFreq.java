package arrays.leetcode;

//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
public class CountMaxFreq {

    static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));
    }


    public static int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];

        int maxFreq = 0;
        int res = 0;
        for (int num : nums) {
            byte newFreq = ++freq[num];
            if (newFreq > maxFreq) {
                maxFreq = newFreq;
                res = maxFreq;
            } else if (newFreq == maxFreq) {
                res += newFreq;
            }
        }
        return res;
    }
}
