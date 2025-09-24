
public class reverseNo {

    // 1234 
    /*
     * 1 - removes the last num store it in the var
     * 2 - run a loop until the num becomes 0
     */
   

    public static void main(String[] args) {
       int num = 1234;
       int last =0;
       while(num!=0){
       last = last*10 + (num%10);
       num/=10;

       }
       System.out.println(last);
    }
}
