package StringPrograms.problems;

public class PermutationString {
    static int cnt = 1;

    public static void main(String[] args) {
        String str = "abcde";
        int perm = factorial(str.length());
        System.out.println(str + " : " + perm);
        permute(str.toCharArray(), 0);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        return fact;
    }

    public static void permute (char[]arr, int indx){
        if(indx==arr.length){
            System.out.println(cnt++ + " : " + new String(arr));
            return;
        }

        for(int i =indx;i<arr.length;i++){
            char temp = arr[indx];
            arr[indx] = arr[i];
            arr[i] = temp;

            permute(arr,indx+1);

            temp = arr[indx];
            arr[indx] = arr[i];
            arr[i] = temp;
        }
    }
}
