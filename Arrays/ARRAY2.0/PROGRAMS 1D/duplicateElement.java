public class duplicateElement {

    public static void main(String[] args) {

        int[] arr = { 12, 21, 25, 12, 21 };

        int[] count = duplicate(arr);
        // print duplicates
        // for (int i = 0; i < count.length; i++) {
        // if (count[i] > 1) {
        // System.out.println(arr[i]);
        // }
        // }

        // removeDuplicate
        int[] distinct = removeDuplicate(arr, count);
        System.out.println("distinct elements ");

        for (int i : distinct) {
            System.out.print(i + " ");
        }

    }

    public static int[] duplicate(int[] arr) {
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

    // remov duplicates
    public static int[] removeDuplicate(int[] arr, int[] count) {

        // coutn how many distinct elements
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                size++;
            }
        }

        // stepn 2 - > crata an array of exact siz
        int[] distinct = new int[size];
        int index = 0;

        // step 3 -> copt only the distinct element to th ary
        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                distinct[index] = arr[i];
                index++;
            }
        }

        return distinct;
    }
}
