import java.util.Arrays;

class distinctElement {

    public static void main(String[] args) {

        int[] arr = { 20, 20, 10, 12, 13, 20, 12 };

        int[] res = frequArr(arr);
        System.out.println(Arrays.toString(res));

    }

    static int[] frequArr(int[] arr) {

        int[] count = new int[arr.length];

        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {

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
