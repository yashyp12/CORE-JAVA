
public class primeSqrt {

    public static void main(String[] args) {

//finding the prime -non prime , using math sqauare root
        int num = 123;

        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("not a prime num");
            } else {
                System.out.println("its an prime num");
            }
        }

    }
}
