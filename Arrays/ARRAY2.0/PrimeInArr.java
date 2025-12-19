public class PrimeInArr {

    public static void main(String[] args) {

        int[] arr = { 12, 13, 4, 7 };

        System.out.println("hello");
        isPrimeArr(arr);

    }

    static void isPrimeArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            int den = 2;
            while (den * den <=arr[i]) {
                if (arr[i] % den == 0) {
                    isPrime = false;
                    break;
                }
                den++;
            }
            if (isPrime) {
                System.out.println(arr[i] + " its an prime num");
            }

        }
    }
}
