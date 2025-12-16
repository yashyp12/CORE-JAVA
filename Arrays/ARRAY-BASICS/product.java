public class product {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        long product = 1;

        // for(int i =0;i<arr.length;i++){
        // product*= arr[i];
        // }

        for (int num : arr) {
            product *= num;
        }

        System.out.println(product);

    }
}
