public class evenOddSum {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 6, 7, 8 };

        int EvenSum = 0;
        int OddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenSum += arr[i];
            } else {
                OddSum += arr[i];
            }
        }

        System.out.println("even Sum is " + EvenSum + "odd Sum is " + OddSum);
    }
}
