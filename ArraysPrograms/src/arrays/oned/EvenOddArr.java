package arrays.oned;

import java.util.Arrays;

//even odd elements in arry , create sepearet array for even and odd
public class EvenOddArr {

    static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6}};

        evenOdd(arr);

    }


    static void evenOdd(int[][] arr) {
        int esize = 0;
        int osize = 0;

        for (int[] ele : arr) {
            for (int ele2 : ele) {
                if (ele2 % 2 == 0) {
                    esize++;
                } else {
                    osize++;
                }
            }
        }

        int[] earr = new int[esize];
        int[] oarr = new int[osize];
        int i = 0, j = 0;
        for (int[] ele : arr) {
            for (int ele2 : ele) {
                if (ele2 % 2 == 0) {
                    earr[i++] = ele2;
                } else {
                    oarr[j++] = ele2;
                }
            }
        }
        System.out.println(Arrays.toString(earr));
        System.out.println(Arrays.toString(oarr));
    }


    static void evenOddSeperation(int[]arr){

        int cnt = arr.length;

        for(int i=0; i<cnt;i++)
        {
            if(arr[i]%2==0){
                cnt --;

                int j = i++;

                while(j<arr.length && arr[j]%2==0)
                {
                    j++;
                }

                if(j==arr.length) break;

                int temp = arr[j];

                for(int k =j; k >i; k--){
                    arr[k] = arr[k-1];
                }

                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}