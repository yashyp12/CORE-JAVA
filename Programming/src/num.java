
import java.util.Scanner;

class NumNotAvl {
    // check whether the given num is contains in the number or not

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        while (num != 0) {
            if ((num % 10) == num) {
                break;
            }
            num /= 10;
        }
        if (num == 0) {
            System.out.println("it is not a duck");
        } else {
            System.out.println("its is a  duck num");
        }
    }

}

public class num{

}