
class patternx {

    public static void main(String[] args) {

        int n = 4;

        // pyramid - * * * * * * *
        //     * * * * *
        //       * * *
        //        *
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.println(" " + " ");
            }
            for (int star = 0; star < ((n - 1) * 2); star++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n * 2 - i; j++) {
                if (j < i - 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        // pyramid 
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (j < n - i) {
        //             System.out.print("  " + "  ");
        //         } else {
        //             System.out.print("*" + "  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
