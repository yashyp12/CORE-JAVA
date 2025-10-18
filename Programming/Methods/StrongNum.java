
public class StrongNum {

    // sum of factorial of individaula digit
    // 145 - 1 facto + 4 facto + 5 facto -> if 1+4+5 is same num is strong num
    public static void main(String[] args) {

        rangeOfStrong(1, 45000);

    }

    public static void rangeOfStrong(int start, int end) {
        while (start <= end) {
            if (isStrong(start)) {
                System.out.println(start);
            }
            start++;
        }
    }

    public static boolean isStrong(int num) {

        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            sum = sum + factorial(1 % 10);
        }

        return sum == num;
    }

    public static int factorial(int num) {
        int fact = 1;

        while (num > 0) {
            fact *= num;
            num--;
        }

        return fact;

    }
}
