
public class AutomorphicNum {

    /*
 *  take a num - 5
 * square it - 25
 * 
 * check if 25 ending with the give num or not
 * 
 * 6 - 36
 * its an automorphci Num 
 * 
 * 25 - 625 
 take coutn of give ndigit -  
 * 
     */

    public static void main(String[] args) {
        System.out.println(isAutomorphic(5));
    }

    public static boolean isAutomorphic(int num) {

        int ct = count(num);

        return ((num * num) % power(10, ct) == num)

    
    );
 }


 static int count(int num) {

        int ct = 0;

        while (num != 0) {
            ct++;
            num /= 10;
        }

        return ct;
    }

    static int power(int base , int raise) {
     int pow = 1;

     while(raise>0){
        pow*=base;
        raise--;
     }
     return pow;
    }

}
