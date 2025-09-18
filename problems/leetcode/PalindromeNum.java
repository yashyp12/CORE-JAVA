public class PalindromeNum {
    
    
    public static void main(String[] args) {
        
        System.out.println("enter the nuHey, CortanaHello. What is your name? Hello. Write a code for me. My name is Swapnil. Hey, Cortana. Bye. Close the Cortana. Hey, Cortana. Hey, Swapdil. Hey, Rutik. How to close Cortana? 
        ");

    }
    


    public static boolean isPalindrome(int x){

        if(x<0) return false;
    
            String str = x+"";
            int i =0,j=str.length()-1;
    
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
    }
}
