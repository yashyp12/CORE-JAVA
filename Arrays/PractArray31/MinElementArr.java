package PractArray31;

public class MinElementArr {
    public static void main(String[] args) {

        int[] arr = { 4,4, 25, 36, 54, 69 };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min element from an array is " + min);
    }
}
