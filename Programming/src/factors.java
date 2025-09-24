
class factors {

    static int num = 100;
    static int den = 1;
    static int count = 1;

    public static void main(String[] args) {

        // while (den <= num) {
        //     if (num % den == 0) {
        //         System.out.println(den);
        //     }
        //     den++;
        // }
        //to reduce the time complexity and show the factors count -
        while (den <= num / 2) {

            if (num % den == 0) {

                count++;
            }
            den++;
        }
        System.out.println(count);
    }
}
