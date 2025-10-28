
public class HappyNum {
    // happy or sad num

    /*
     * A Happy Number is a number which, after repeatedly replacing it by the sum of
     * the squares of its digits, eventually becomes 1.
     * 
     * A Sad (Unhappy) Number is one which never reaches 1 and instead falls into a
     * loop (like 4, 16, 37, 58, 89, 145, 42, 20... then back to 4).
     * 
     * 🔹 Example 1: Check if 19 is Happy
     * 
     * Step 1: Take digits of 19 → 1 and 9
     * Step 2: Square and sum → 1² + 9² = 1 + 81 = 82
     * Step 3: Now take 82 → 8² + 2² = 64 + 4 = 68
     * Step 4: 68 → 6² + 8² = 36 + 64 = 100
     * Step 5: 100 → 1² + 0² + 0² = 1
     * 
     * Reached 1, so 19 is a Happy Number ✅
     * 
     * Step 1: 2² + 0² = 4
     * Step 2: 4² = 16
     * Step 3: 1² + 6² = 37
     * Step 4: 3² + 7² = 58
     * Step 5: 5² + 8² = 89
     * Step 6: 8² + 9² = 145
     * Step 7: 1² + 4² + 5² = 42
     * Step 8: 4² + 2² = 20
     * 
     * Loop repeats → back to 20. Never reaches 1 → Sad Number ❌
     */
    public static void main(String[] args) {
        System.out.println(isHappy(5));
    }

    static boolean isHappy(int num) {
        if (num == 4) {
            return false;
        } else {
            int op = sumOfSqDigits(num);
            while (num != 1 && num != 4) {
                op = sumOfSqDigits(op);
            }
            return op == 1;
        }
    }

    static int sumOfSqDigits(int num) {

        int sum = 0;
        // int num = 12 = 144

        while (num != 0) {
            // int lastDigit = num%10;
            // sum += lastDigit*lastDigit;

            sum += ((num % 10) * (num % 10));
            num /= 10;
        }

        return sum;

    }

    // static boolean isHappy(int num)
    // {
    // if(num==4){
    // return false;
    // }else{
    // int op = sumOfSqDigits(num);
    // while(num!=1 && num!=4)
    // {
    // op = sumOfSqDigits(op);
    // }
    // return op ==1;
    // }
    // }
    // public static int sumOfSqDigits(int num){
    // int sum = 0;
    // while(num!=0){
    // sum = sum + ((num%10)*(num%10));
    // num/=10;
    // }
    // return sum;
    // }
}
