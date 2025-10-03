
public class PatternPrinting {
    public static void main(String[] args) {
        /*     *
         *     * *
         *     * * *
         *     * * * * 
         */

        //  step 1 - > count rows = outer loop 
        // rows = 4 rows so outer loop will be iterate till 4
        //step 2 -> check for every row how many columns ae there
        // 1 row = 1 col = (no of rows = no of col)
        //step 3 - make an inner loop iterate till no of rows
        //step 4 - identify what to print
// NUM = NO OF ROWS IN THE PATTERN
        int num = 4;

        for(int row = 1; row<=num; row++){

            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
