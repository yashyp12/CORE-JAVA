
public class pattern8 {

    public static void main(String[] args) {

        /*
         * hollow rectangle
         *      * * *  *  * 
         *      *         *
         *      *         *
         *      *  * *  * *
         *      
         */
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=m; j++) {
                if (j == 1 || i == 1 || j == m || i == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
          
            }
            System.out.println();
        }

    }
}
