package arrays.problems;

public class LeastRepEle {


    //    find the least rep element from teh array means having less frequency element
    static void main(String[] args) {
        int[] arr = {2, 3, 66, 5, 6, 2, 3, 66, 5};
        int[] count = new int[arr.length];
        int minfreq = arr.length;
        int minEle = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count[i] == -1) continue;

            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[j]=-1;
                    cnt++;
                }
            }
            count[i] = cnt;
            if (count[i] < minfreq) {
                minfreq = cnt;
                minEle = arr[i];
            }
        }


        System.out.println("Least repeating element in arr is " + minEle);
    }


}
