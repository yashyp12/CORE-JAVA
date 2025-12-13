import java.util.Arrays;
import java.util.Scanner;

public class BankArray {

    public static void main(String[] args) {

        double []accounts;
        accounts = new double[3];

        for(int i =0; i<accounts.length;i++){
             accounts[i] = new Scanner(System.in).nextDouble();
        }

        System.out.println(Arrays.toString(accounts));

    }
}
