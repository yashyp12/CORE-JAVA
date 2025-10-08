
public class pattern2 {
    // print the pattern for whatever size border

    public static void main(String[] args) {
        int n = 15;

        // for (int i = 0; i < n; i++) {

        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {

        //             System.out.print("* " + " ");
        //         } else {
        //             System.out.println(" ");
        //         }
        //     }
        //     System.out.println();
        // }



        // 
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {

                    System.out.print("* " + " ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
