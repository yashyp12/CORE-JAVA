package arrays.oned;

//sort the array such taht sperate it the even and odd.
//without chaning its original order

public class SortEvenOdd {

    static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};

        int n = arr.length;
        int cnt = n;

        for(int i =0;i<cnt;i++){

            if(arr[i]%2==0){

                cnt--;

                int j = i +1;

                while(j<n && arr[j]%2==0){
                    j++;
                }

                if(j==n) break;

                int temp = arr[j];

                //shift right
                for(int k = j;k>i;k--){
                    arr[k] = temp;
                }

                arr[i] = temp;
            }
        }
    }
}
