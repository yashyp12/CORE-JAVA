public class pattern2 {
    public static void main(String[] args) {
        // print a patter 
        /*    *****
         *    *****
         *    *****
         *    *****
         *    *****
                           */
        //no of rows 
        int n = 5;
        // step1  -> no of rows  = outer loop
        // step 2- > identify no of coln for every row
        // 1 row = 5 col , 2 row = 5 col

        for(int row = 1; row<=n; row++){

            for(int col =1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
