package practArrProgram;

public class PrimeArr {

    public static void main(String[] args) {
        int[] arr = {12, 65, 3, 6};
    }

    static boolean isPrime(int n){
        for(int i =2; i<n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }


}
