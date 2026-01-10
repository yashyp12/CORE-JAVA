package arrays.leetcode;

public class findEvenDigits1295 {
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    static void main(String[] args) {
        int [] nums= {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        System.out.println(digits2(5065624));
    }
     public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i :nums){
          if(even(i)) count++;
        }
        return count;
    }

    static boolean even(int num){
        return digits2(num) % 2 == 0;
    }


//count no of digits in a num
//    static int digits(int num){
//
//            if(num<0) num*=-1;
//            if(num==0) return 1;
//
//            int count = 0;
//
//            while(num>0){
//                count++;
//                num/=10;
//            }
//            return count;
//    }


    //optimised solution
    static int digits2(int num){
//        return (int)(Math.log10(num))+1;
            return String.valueOf(num).length();
    }


}
