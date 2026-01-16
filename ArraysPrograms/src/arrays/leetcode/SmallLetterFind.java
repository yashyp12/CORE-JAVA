package arrays.leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?source=submission-ac
public class SmallLetterFind {

//letters = ["c","f","j"], target = "a"
    public static void main(String[] args) {

        char[]letters = {'x','x','y','y'};
        System.out.println(nextGreatestLetter(letters,'z'));

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        //we dont wanted to check == ok , and at teh alast if not found target then wanted to return letter[0]
        while(start<=end){
            int mid = start + (end-start)/2;

            if(letters[mid]<=target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
            return letters[start % letters.length];


    }
}
