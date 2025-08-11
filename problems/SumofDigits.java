

public class SumofDigits {
    // Implement a program to find out whether a number is divisible by the sum of its digits

// inp 123 -> 123 is not divisible by sum of its digits
    public static void main(String[] args) {
        System.out.println("Enter the num");
        int num = 123;
        int dup = num;
//123
        int sum = 0;
        while (dup > 0) {
            sum = sum + dup % 10;
            dup /= 10;
        }

        System.out.println("total sum of num is " + sum);

        if (sum % num == 0) {
            System.out.println(num + "is divisible by sum of its digits");
        } else {
            System.out.println(num + " is not divisble by sum of its digits");
        }
    }
}
