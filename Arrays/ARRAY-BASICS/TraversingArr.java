import java.util.Arrays;

class TraversingArr {

    public static void main(String[] args) {

        // forwardd traversing
        // using for whil do whil for each

        int[] arr = { 10, 20, 20, 40, 50 };
        // for(int i = 0; i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // int i = 0;
        // while (i < arr.length) {
        // System.out.println(arr[i]);
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println(arr[i]);
        // i++;
        // } while (i < arr.length);

        //

        // for (int i : arr) {
        // System.out.println(i);
        // }

        // 2d arr
        // int [][]arr2 = { {10,20,30,40},{50,60,70,80,90,100}};

        // for(int i =0;i<arr2.length;i++){
        // for(int j = 0;j<arr2[i].length;j++){
        // System.out.println(arr2[i][j]);
        // }
        // }

        // backward traversing

        // for(int i = arr.length-1;i>=0;i--){
        // System.out.println(arr[i]);
        // }

        //
        // int i = arr.length - 1;
        // while(i>=0){
        // System.out.println(arr[i]);
        // i--;
        // }

        // do {
        // System.out.println(arr[i]);
        // i--;
        // } while (i >= 0);

        // 2d arr
        // int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80, 90, 100 } };
        // for(int i=0;i<a.length;i++){
        // for(int j=0;j<a[i].length;j++){
        // System.out.println(a[i][j]);
        // }
        // }

        // do while
        // int i = 0;
        // do {
        // int j =0;
        // do {
        // System.out.println(a[i][j]);
        // j++;
        // } while (j<a[i].length);
        // System.out.println();

        // i++;
        // } while (i<a.length);

        // while

        // int i = 0;
        // while (i < a.length) {

        // int j = 0;
        // while (j < a[i].length) {
        // System.out.println(a[i][j]);
        // j++;
        // }
        // System.out.println();
        // i++;
        // }

        // reverse traversing 2 d arrat
        // for (int i = a.length - 1; i >= 0; i--) {
        // for (int j = a[i].length - 1; j >= 0; j--) {
        // System.out.println(a[i][j]);
        // }
        // System.out.println();
        // }

        int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80, 90, 100 } };

        // using while loop
        // int i = a.length - 1;
        // while (i >= 0) {

        // int j = a[i].length - 1;
        // while (j >= 0) {
        // System.out.println(a[i][j]);
        // j--;
        // }
        // System.out.println();
        // i--;
        // }

        // using do while
        // int i = a.length - 1;
        // do {
        // int j = a[i].length - 1;
        // do {
        // System.out.println(a[i][j]);
        // j--;
        // } while (j >= 0);
        // i--;
        // System.out.println();
        // } while (i >= 0);

        String[] strarr = { "yash", "patil" };
        System.out.println(Arrays.toString(strarr));

        
    }
}