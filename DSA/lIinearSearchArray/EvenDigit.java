package DSA.lIinearSearchArray;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array

public class EvenDigit {

   public static void main(String[] args) {
    int [] nums = {12,345,2,6,7896};
       System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
            int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
    }

    static boolean even(int num){
       int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

//    count the digits in anumber
     static int digits(int num){
       if(num < 0){
           num = num*-1;
       }
       if(num ==0){
           return 1;
       }
       int count = 0;
       while (num >0){
           count ++;
           num/=10;
       }
       return count;
     }

//     another way to find no of digits
    static int digits2(int num){
       return(int)(Math.log10(num)+1);
    }

}
