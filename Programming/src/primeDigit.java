
class primeDigit {

    // // print prime digits of a num
    // public static void main(String[] args) {
    //     int num = 1234;
    //     int den = 2;
    //     if (num == 1) {
    //         System.out.println("not prime");
    //     }
    //     while (num != 0) {
    //         if ((num % 10==2 ||num % 10==7 )) {
    //             System.out.println(num%10);
    //         }
    //         num /= 10;
    //         den++;s
    //     }
    //     if (den == 0) {
    //         System.out.println("prime num");
    //     } else {
    //         System.out.println("not an prime num");
    //     }
    // }
    public static void main(String[] args) {
        int num = 12;

        int den = 2;

        if (num == 1) {
            System.out.println("its not an prime num");
            return;
        }

        while (den <= num / 2) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (den> num / 2) {
            System.out.println("its an prime num");
        } else {
            System.out.println("not an prime num");
        }

    }

}
