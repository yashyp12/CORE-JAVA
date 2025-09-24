
public class factorial {

    static int fact = 1;
    static int num = 5;

    public static void main(String[] args) {

        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println(fact);

    }
}
