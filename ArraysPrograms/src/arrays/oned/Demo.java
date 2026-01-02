package arrays.oned;

public class Demo {
    static void main() {
        int[] arr = {2, 5, 1, 3, 2, 0, 5, 5, 1, 2, 5};

        int[] frequency = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (frequency[i] != -1) {
                int cnt = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cnt++;
                        frequency[j] = -1;
                    }

                }
                frequency[i] = cnt;
                System.out.println(arr[i] + " " + cnt);

            }

        }
    }
}
