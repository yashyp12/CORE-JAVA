
public class fibonacii {

    public static void main(String[] args) {
//check whether the num is fibonacii or not

        int num = 6;
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (true) {
            n3 = n1 + n2;

            //check whether the n1 == num or not 
            if (n1 == num) {
                System.out.println("its an fibonacii num");
                break;
            } //check whtehr then num is greater than n1
            else if (n1 > num) {
                System.out.println("its not an fibo");
                break;
            } // simply swap the vlaues of n2 n3 with n1
            else {
                n1 = n2;
                n2 = n3;
            }

        }

    }
}
