package arrays.twod;
//array pdf question no 101 - shrikant sir

public class NonRepeatingDigits {
    static void main(String[] args) {

        int[][] arr = {{80, 120}};

        for (int[] arr1 : arr) {
            System.out.println(solve(arr1));
        }
    }

    static int solve(int[] arr) {
        int start = arr[0], end = arr[1];
        int cnt = 0;

        for (; start <= end; start++) {
            if (uniqueDigits(start)) cnt++;
        }
        return cnt;
    }

    static boolean uniqueDigits(int num) {
        if (num < 11) return true;

        for (int i = 0; i <= 9; i++) {
            int cnt = 0;
            for (int j = num; j != 0; j /= 10) {
                if ((j % 10) == i) {
                    cnt++;
                }
                if (cnt > 1) return false;
            }
        }
        return true;
    }
}
