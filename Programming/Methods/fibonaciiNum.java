public class fibonaciiNum {

    public static void main(String[] args) {

        System.out.println(fiboCheck(13));

    }

    static boolean fiboCheck(int num) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (true) {
            n3 = n1 + n2;

            if (n1 == num)
                return true;
            if (n1 > num)
                return false;

            n1 = n2;
            n2 = n3;
        }
    }
}
