public class PascalTriangle {
    public static void main(String[] args) {
        
    }

    public static void PascalTriangle(int n){

        for(int i=0; i<n; i++){
            for(int space =0; space <n-i-1; space++){
                System.out.print(" " + " ");
            }

            for(int star = 0; star <=i; star++){
                    System.out.println("*"+ " ");
            }

            System.out.println();
        }
    }

    // static int factorial(int num){
    //     int fact = 1;

    //     // while(num)
    // }
}
