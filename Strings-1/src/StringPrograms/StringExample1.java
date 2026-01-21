package StringPrograms;

import java.net.Inet4Address;
import java.util.Arrays;

public class StringExample1 {

    public static void main(String[] args) {

        String str = "hippopotammmmus";

        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        frequencyOfCharacters(arr, arr.length);
        System.out.println("frequency of char" + str);

        String distinct = distinctCharacters(arr, arr.length);
        System.out.println("distinct : " + distinct);

        String uni = uniqueCharacters(arr, arr.length);
        System.out.println("unique : " + distinct);

        String dup = duplicateCharacters(arr, arr.length);
        System.out.println("duplicated " + dup);

        char highestRepChr = highestRepeatingCharacters(arr, arr.length);
        System.out.println("highest rep  : " +  highestRepChr);

    }

    private static char highestRepeatingCharacters(char[] arr, int n) {
        char ch = ' ';

        int max = Integer.MIN_VALUE;
        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt > max) {
                max = cnt;
                ch = arr[i];
            }
        }

        return ch;

    }

    private static String duplicateCharacters(char[] arr, int n) {
        String str = " ";
        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt > 1) str += arr[i];
        }
        return str;
    }

    private static String uniqueCharacters(char[] arr, int n) {

        String str = " ";
        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt == 1) str += arr[i];
        }
        return str;

    }

    private static String distinctCharacters(char[] arr, int n) {
        String str = "";
        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    trace[j] = true;
                }
            }
            str += arr[i];
        }
        return str;
    }


    private static void frequencyOfCharacters(char[] arr, int n) {
        boolean[] trace = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    trace[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }

    }

}
