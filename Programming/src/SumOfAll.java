import java.util.*;

public class SumOfAll {

    static int sum = new Scanner(System.in).nextInt();
    static int start = new Scanner(System.in).nextInt();
    static int end = new Scanner(System.in).nextInt();

    //sum of all bumbers from 1 to 10
    public static void main(String[] args) {

        while (start <= end) {
            sum += start;
            start++;
        }
    }
}
