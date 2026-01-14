package arrays.searching.SentinelSearch;

public class MySentinelEx {

    static void main(String[] args) {
        int [] arr = {1,3,8,9,2,11,22,40,50,20};
        int key = 20;

        int n = arr.length;
        int pos = sentinelSearch(arr,n,key);
        System.out.println(pos);
    }
    static int sentinelSearch(int[]arr, int n, int key){
          int last = arr[arr.length-1];
        arr[arr.length-1] = key;
        int i =0;
        while(arr[i]!=key){
            i++;
        }

        arr[arr.length-1] = last;
         if(i<arr.length-1 || last==key) return i;
         else return -1;
    }

}
