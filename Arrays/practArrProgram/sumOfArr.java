package practArrProgram;

public class sumOfArr {
    public static void main(String[] args) {
        

        int []arr = {14,4,3,2};

        int sum = 0;

        for(int i = 0;i<=arr.length-1; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
