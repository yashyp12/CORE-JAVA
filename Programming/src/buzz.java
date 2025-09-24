
public class buzz {
//if num is positive num is either divisible by 7 or ends 
// with the digit 7 

    public static void main(String[] args) {
        int num = 2137;

       if(num%10==7 || num%7==0){
        System.out.println("its an buzz");
       }else{
        System.out.println("its not an buzz num");
       }
    }
}
