package arrays.oned;

//sum of elements, average of array elemtns ,
public class BasicArr {

    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(sumOfArray(arr));
        System.out.println(avgOfArray(arr));
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

    static int sumOfEven(int[] arr) {
        int Evensum = 0;

        for(int i:arr){
            if(i%2==0) Evensum+=i;
        }
        return Evensum;
    }
}
