
public class pow {
//     Implement a program to check whether a given number is an Armstrong number.

// An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its individual digits.
// E.g.: 371 is an Armstrong number as 33 + 73 + 13=371
//         1634 is an Armstrong number as 14 + 64 + 34+ 44=1634
// Hint
// Use Math.pow(double a, double b) method to calculate the power of a number
    public static void main(String[] args) {

        int num = 371;
        int count = 0;
        int sum = 0; // 1 
        int pow = 0;

        int temp = num;

        // calculating the count
// power addition
        int digits = 0;

        // count 
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // second loop
        temp = num;
        while (temp > 0) {
            digits = temp % 10;

            sum = (int) Math.pow(digits, count);

            temp /= 10;

        }

        if (sum == num) {
            System.out.println("its an Armstrong Num");
        } else {
            System.out.println("not an armstrong num");
        }

    }
}
