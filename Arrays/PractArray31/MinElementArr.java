package PractArray31;

import java.util.Arrays;

public class MinElementArr {
    public static void main(String[] args) {

        int[] arr = { 4,4, 25, 36, 54, 69 };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min element from an array is " + min);
    }

    static class distinctElement {

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

    public static class EvenOddSeperation {
        public static void main(String[] args) {
            int[] arr = { 8, 3, 1, 4, 7, 6 };
            evenOdd(arr);

            System.out.println("array after sorting eeven odd elements " + Arrays.toString(arr));
        }

        static void evenOdd(int[] arr) {

            int[] temp = new int[arr.length];
            int index = 0;

            // first pass copy all evn element to tempar

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    temp[index++] = arr[i];
                }
            }

            // 2 pass copy all odd element to tempar

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    temp[index++] = arr[i];
                }
            }

            // 3 - merge wiyth out arr
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];
            }

        }
    }

    public static class duplicateElement {

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
            // int[] distinct = removeDuplicate(arr, count);
            // System.out.println("distinct elements ");

            // for (int i : distinct) {
            //     System.out.print(i + " ");
            // }


            uniDupSepArr(arr, count);



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


        // all in onee
        public static void uniDupSepArr(int[] arr, int[] count) {

            // uncut - unique count , dupcnt - dup count , repeat - mor than 0 freq
            int uncnt = 0, dupcnt = 0, repeat = 0;

            for (int i = 0; i < arr.length; i++) {
                if (count[i] == -1) {
                    dupcnt++;
                } else if (count[i] == 1) {
                    uncnt++;
                } else if (count[i] > 1) {
                    repeat++;
                }
            }

            int[] uncntar = new int[uncnt];
            int[] dupcntar = new int[dupcnt];
            int[] repeatcnt = new int[repeat];

            // adding elements to the arrays
            for (int i = 0, j = 0, k = 0, l = 0; i < arr.length; i++) {

                if (count[i] == 1) {
                    uncntar[j] = arr[i];
                    j++;
                } else if (count[i] > 1) {
                    repeatcnt[k] = arr[i];
                    k++;
                } else if (count[i] == -1) {
                    dupcntar[l] = arr[i];
                    l++;
                }
            }

            System.out.println("UNIQUE  : " + Arrays.toString(uncntar));
            System.out.println("REPEATED: " + Arrays.toString(repeatcnt));
            System.out.println("DUPLICATE : " + Arrays.toString(dupcntar));

        }

        public static class LeftRotation {

            static void main(String[] args) {

                int[]arr = { 10,20,30,40};
                leftRotate(arr);
            }

            private static void leftRotate(int[] arr) {
                int temp = arr[0];

                for(int i =1;i<arr.length;i++){
                    arr[i-1] = arr[i];
                }
                arr[arr.length-1] = temp;

                System.out.println("updated array is " + Arrays.toString(arr));
            }
        }
    }

    public static class diffArrEl {
        public static void main(String[] args) {

            int[] arr = {3,8,15,23 };
            diffArrEl1(arr);
            System.out.println(Arrays.toString(arr));

        }

        static void diffArrEl1(int[] arr) {
            if (arr == null || arr.length == 0)
                return;

            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i] - arr[i - 1];
            }

        }
    }

    public static class frequencyArr {
        // program for couting the frequency of each element in an array
        public static void main(String[] args) {
            int[]arr = {10,20,30,10};
            freqElement(arr);
        }
        static int[] freqElement(int []arr){
            int [] count = new int[arr.length];
            // {0,0,0,0}
    //if count[j] = -1 means already counted
            for(int i =0;i<arr.length;i++){
                int cnt = 1;
                for(int j =i+1;j<arr.length;j++){
                    if(count[j]==-1) continue;

                    if(arr[i]==arr[j])
                    {
                        cnt++;
                        count[j]=-1;
                    }
                    count[i] = cnt;
                }
            }
            return new int[4];
        }
    }

    public static class MoveZero {
        public static void main(String[] args) {

            // MOVE ALL ZEROS TO THE END
            // k - position of the non zero elements
            // if found non zero increment it

            int[] arr = { 1, 0, 3, 0, 4, 0 };
            System.out.println("ARRAY BEFORE SHIFTING " + Arrays.toString(arr));

            nonZeroMove(arr);
            System.out.println("ARRAY AFTRE SHIFTING " + Arrays.toString(arr));
        }

        static void nonZeroMove(int[] arr) {
            int k = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[k] = arr[i];
                    k++;
                }
            }

            // now add 0 at th end
            for (int i = k; i < arr.length; i++) {

                arr[i] = 0;
            }

        }
    }
}
