package arrays.oned;

import java.util.Arrays;

//sum of elements, average of array elemtns ,
public class BasicArr {

    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(sumOfArray(arr));
//        System.out.println(avgOfArray(arr));
//        sumOfEvenOdd(arr);
//        productOfArr(arr);
//        randFuncInit(arr);
        charArrExam();
    }


    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double avgOfArray(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    static void sumOfEvenOdd(int[] arr) {
        int EvenSum = 0;
        int OddSum = 0;
        for (int i : arr) {
            if ((i & 1) == 0) {
                EvenSum += i;
            } else {
                OddSum += i;
            }
        }
        System.out.println("SUM OF EVEN " + EvenSum);
        System.out.println("SUM OF Odd " + OddSum);
    }

    static void productOfArr(int[] arr) {
        long product = 1;
        for (int i : arr) {
             if(i != 0) product *= i;

        }
        System.out.println("Product of arr " + product);
    }

    static void charArrExam(){
        char []arr = new char[26];
        System.out.println("before " + Arrays.toString(arr));
        for(char ch ='A'; ch<='Z'; ch++)
        {
            arr[ch-65] = ch;
        }
        System.out.println("after " + Arrays.toString(arr));
    }




}
