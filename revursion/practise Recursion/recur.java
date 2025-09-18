
import java.util.*;

public class recur {

    static int num = 1; // 4 - 

    public static void main(String[] args) {

        System.out.println("enter the base");
        int base = new Scanner(System.in).nextInt();
        System.out.println("enter the power");
        int power = new Scanner(System.in).nextInt();

        int op = powernum(base, power);
        System.out.println(op);
    }
    //						4       pow -  3     
    // iteration 2   pow = 2 bsae 4 
	// pow - 1
// 4 , 0
    static int powernum(int base, int power) {
        //4*4 num = 16
		// num = 16*4; = 64
		// num = 64*4  = 256
        if (power!=0){
            num = num * base;
        }

        if (power == 0) {
            return num; //
        }
// 4  , pow = 1
//4 pow = 0
       return powernum(base, --power);
    }
}
