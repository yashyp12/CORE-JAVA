package arrays.oned;

import java.util.Arrays;

public class FrequencyEl {

    static void main(String[] args) {
        int[] arr = {10, 10, 5, 5, 7, 7};
//        frequencyEle(arr);
//        SecondHighestFreq(arr);
//        uniqueEle(arr);
    thirdLargest(arr);
    }


    static void frequencyEle(int[] arr) {
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == -1) continue;
            int cnt = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = -1;
                    cnt++;
                }
            }
            freq[i] = cnt;
            System.out.println("Freq of element is " + arr[i] + " : " + cnt);
        }
    }


    static void SecondHighestFreq(int[] arr) {
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == -1) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = -1;
                    cnt++;
                }
            }
            freq[i] = cnt;
        }

        // step 2 , now iterate from the array searches for the second SMALLEST repeating elemtn
        //frequency has to be atleast 2 and more than 2
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == -1) continue;
            if (freq[i] >= 2) {
                if (arr[i] > largest) {
                    Secondlargest = largest;
                    largest = arr[i];
                } else if (arr[i] < largest && arr[i] > Secondlargest) {
                    Secondlargest = arr[i];
                }
            }
        }


//      seconds smallest least repeating element in ar
 int SMALLEST = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == -1) continue;
            if (freq[i] >= 2) {
                if (arr[i] < SMALLEST) {
                    SecondSmallest = SMALLEST;
                    SMALLEST = arr[i];
                } else if (arr[i] >SMALLEST && arr[i] < SecondSmallest) {
                    SecondSmallest = arr[i];
                }
            }
        }


        System.out.println("Seconds highest array is " + Secondlargest);
        System.out.println("Seconds LOWEST array is " + SecondSmallest);
    }


    static void uniqueEle(int []arr){

        int[]freq = new int[arr.length];

        for(int i =0; i<arr.length;i++)
        {
            if(freq[i] ==-1) continue;
            int cnt = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    freq[j] = -1;
                    cnt++;
                }
            }
            freq[i] = cnt;
        }

//        now we want unqiue elemtns into the new array - like the elements which have an frequency only 1

//        create the new array with the exact size
        int uniqueCount = 0;
        for(int i =0;i<freq.length;i++){
            if(freq[i]==1) uniqueCount++;
        }

        // create aray of exact size
        int[]uniqueAr = new int[uniqueCount];
        int k =0;
        for(int i =0;i<arr.length;i++){
            if(freq[i]==1){
                uniqueAr[k++] = arr[i];
            }
        }

//        printing the array
        System.out.println(Arrays.toString(uniqueAr));
    }


//    third largest repeateting element from the array
    static void thirdLargest(int[]arr){
        int []freq = new int[arr.length];

//        step 1 - calculate the frequency of the arr element
        //step 2 - then iterate over the freuency arr and pick up the element which are repeating ,
        // step 3 - check the largest , second largest, third largest repeatinig element
        for(int i =0;i<arr.length;i++)
        {
            if(freq[i]==-1) continue;
            int cnt = 1;
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    freq[j] = -1;
                }
            }
            freq[i] = cnt;
        }

        //now we have an frequency array - will calculate 2nd max elemetn from it
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;


        for(int i =0;i<arr.length;i++)
        {
            if(freq[i]==-1) continue;
            if(freq[i]<2) continue;

            if(arr[i]>max){
                max3 = max2;
                max2 = max;
                max = arr[i];
            }else if(arr[i]<max && arr[i]>max2){
                max3 = max2;
                max2 = max;
            }else if(arr[i]<max2 && arr[i]>max3){
                max3 = arr[i];
            }
        }
        System.out.println("max repeateting element is " + max + " second max is " + max2 + " third max is " + max3);
    }

}
