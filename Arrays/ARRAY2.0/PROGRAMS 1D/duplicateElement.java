public class duplicateElement {

    public static void main(String[] args) {

        int[] arr = { 12, 21, 25, 12,21 };

        int[] count = duplicate(arr);
        // duplicates
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] duplicate(int[] arr) {
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
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
