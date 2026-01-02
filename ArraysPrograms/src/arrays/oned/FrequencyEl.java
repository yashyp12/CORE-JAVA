package arrays.oned;

import java.util.Arrays;

public class FrequencyEl {

    static void main(String[] args) {
       int[]arr = {1,2,1,2,3,4,5,4,4};
        frequencyEle(arr);
    }
    static void frequencyEle(int [] arr){
        int [] freq = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            if(freq[i]==-1) continue;
            int cnt = 1;

            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq[j] = -1;
                    cnt++;
                }
            }
            freq[i] = cnt;
            System.out.println("Freq of element is " + arr[i] + " : " +cnt);

        }

    }

}
