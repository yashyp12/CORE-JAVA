import java.util.Scanner;

public class NumContainArr {
    // Ask the user for a number and
    // check whether it exists in the given array. If yes, print its index, else
    // print “not found”.

    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();

        int[] arr = { 1, 2, 5, 7 };

        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {

                foundIndex = i;
                break;
            }
        }

        
        if (foundIndex >= 0) {
            System.out.println("num found on index " + foundIndex);
        } else {
            System.out.println("num not found");
        }

        // System.out.println(Arrays.toString(arr));

    }

}
