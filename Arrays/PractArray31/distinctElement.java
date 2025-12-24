package PractArray31;

class distinctElement {

    public static void main(String[] args) {

        int[] arr = { 20, 20, 10, 12, 13, 20, 12 };

        int[] count = frequArr(arr);

        // counting the distinct elements from it
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println(arr[i]);
            }
        }

    }

    static int[] frequArr(int[] arr) {

        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (count[i] == -1)
                continue;

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
