
public class PowerNum {

    public static void main(String[] args) {
        System.out.println("Main starts");
        power(2, 5);
        System.out.println("Main ends");
    }

    static void power(int base, int raise) {
        int pow = 1;

        while (raise != 0) {
            pow = pow * base;
            raise--;
        }

        System.out.println(pow);
    }
}
