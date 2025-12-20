import java.util.Arrays;

public class frequencyArr {
    // program for couting the frequency of each element in an array
    public static void main(String[] args) {
        int[] arr = { 20, 20, 10, 12, 13, 20, 12 };

        int[] result = freqElement(arr);
        System.out.println(Arrays.toString(result));

    }

    static int[] freqElement(int[] arr) {
        int[] count = new int[arr.length];
        // {0,0,0,0}
        // if count[j] = -1 means already counted
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            if (count[i] == -1)
                continue;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    cnt++;
                    count[j] = -1;
                }
            }
            count[i] = cnt;

        }
        return count;
    }
}
