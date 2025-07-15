
import java.util.*;

public class vowels {

    //check whether the user input is vowel or consonent
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character");
        char ch = sc.next().toUpperCase().charAt(0);

        if (!(ch >= 65 && ch <= 90)) {
            System.out.println("invalid charcter entered");
        }

        switch (ch) {

            case 'A': {
                System.out.println("its an vowel");
                break;
            }
            case 'E': {
                System.out.println("vowel");
                break;
            }
            case 'I': {
                System.out.println("vowel");
                break;
            }
            case 'O': {
                System.out.println("vowel");
                break;
            }
            case 'U': {
                System.out.println("Vowel");
                break;
            }

        default :{
            System.out.println("its an consonent");
        }
        }

    }
}
