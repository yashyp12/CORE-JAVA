import java.util.*;

public class fact {
    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        if (num < 0)
            return;
 

        int fact = 1;
        while (num != 0) {
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }
}
