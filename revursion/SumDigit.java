
public class SumDigit {

    public static void main(String[] args) {

        int num = 123;
        int sum = 0;

        int op = SumOfDigit(num, sum);
        System.out.println(op);

    }

    static int SumOfDigit(int num, int sum) {

        sum += num % 10;
        num /= 10;

        if (num == 0) {
            return sum;
        }
        
        return SumOfDigit(num, sum);

    }
}
