package StringPrograms;

import java.util.Arrays;

public class StringExampleArr2 {
    public static void main(String[] args) {

        String str = "java is easy java is a programming language it is platform independant language ";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        frequencyOfWords(arr, arr.length);
        System.out.println("frequency of words" + str);

        String[] distinctArr = distinctWords(arr, arr.length);
        System.out.println("distinct : " + Arrays.toString(distinctArr));

        String[] uni = uniqueWord(arr, arr.length);
        System.out.println("unique : " + Arrays.toString(uni));

        String[] dup = duplicateWords(arr, arr.length);
        System.out.println("duplicated " + Arrays.toString(dup));
//
        String highestRepChr = highestRepeatingWord(arr, arr.length);
        System.out.println("highest rep  : " + highestRepChr);
//
        String lowestRepChr = LowesttRepeatingWord(arr, arr.length);
        System.out.println("lowestRepChr rep  : " + lowestRepChr);
//
        String sndHighestRepWord = sndHighestRepeatingWord(arr, arr.length);
        System.out.println("2highest rep  : " + sndHighestRepWord);
//
        String SndLowestRepChr = sndLowesttRepeatingWord(arr, arr.length);
        System.out.println("2lowestRepChr rep  : " + SndLowestRepChr);


    }


    private static String LowesttRepeatingWord(String[] arr, int length) {

        String word = "";
        int min = Integer.MAX_VALUE;
        boolean[] trace = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (trace[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < length; j++) {
               if (arr[i].equals(arr[j])) {
                cnt++;
                trace[j] = true;
            }
            }

            if (min > cnt) {
                min = cnt;
                word = arr[i];
            }
        }
        return word;
    }


    private static String sndLowesttRepeatingWord(String[] arr, int length) {
        String ch1 = "", ch2 = "";
        int min1 = Integer.MAX_VALUE, min2 = min1;

        boolean[] trace = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (trace[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < length; j++) {
                if (arr[i].equals(arr[j])) {
                    trace[j] = true;
                    cnt++;
                }
            }
            if (min1 > cnt) {
                min2 = min1;
                ch2 = ch1;
                min1 = cnt;
                ch1 = arr[i];
            } else if (cnt > min1 && cnt < min2) {
                min2 = cnt;
                ch2 = arr[i];
            }

        }
        return ch2;
    }

    private static String sndHighestRepeatingWord(String[] arr, int length) {
        String ch1 = "", ch2 = "";
        int max1 = Integer.MIN_VALUE, max2 = max1;

        boolean[] trace = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (trace[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < length; j++) {
                if (arr[i].equals(arr[j])) {
                    trace[j] = true;
                    cnt++;
                }
            }
            if (max1 < cnt) {
                max2 = max1;
                ch2 = ch1;
                max1 = cnt;
                ch1 = arr[i];
            }else if (cnt < max1 && cnt > max2) {
                max2 = cnt;
                ch2 = arr[i];
            }
        }
        return ch2;
    }


    private static String highestRepeatingWord(String[] arr, int n) {
        String word = "";
        int max = Integer.MIN_VALUE;
        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt > max) {
                max = cnt;
                word = arr[i];
            }
        }

        return word;

    }

    private static String[] duplicateWords(String[] arr, int n) {
        String[] result = new String[n];
        boolean[] trace = new boolean[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt > 1) result[k++] = arr[i];

        }
        return java.util.Arrays.copyOf(result, k);

    }

    private static String[] uniqueWord(String[] arr, int n) {

        String[] result = new String[n];
        int k = 0;

        boolean[] trace = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    trace[j] = true;
                }
            }
            if (cnt == 1) result[k++] = arr[i];

        }
        return result;

    }

    private static String[] distinctWords(String[] arr, int n) {
        String[] str = new String[n];
        boolean[] trace = new boolean[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {

                    trace[j] = true;
                }
            }
            str[k++] = arr[i];
        }
        return str;
    }


    private static void frequencyOfWords(String[] arr, int n) {
        boolean[] trace = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (trace[i]) {
                continue;
            }

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    trace[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }

    }

}
