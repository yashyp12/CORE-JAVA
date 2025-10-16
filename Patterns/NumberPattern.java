
public class NumberPattern {

    public static void main(String[] args) {

        int n = 4;

        // for (int i = 1; i <=n; i++) {
        //     int num = i;
        //     System.out.println(num);
        //     for (int j = 1; j < num; j++) {
        //         num += n;
        //         System.out.println(num + " ");
        //     }
        //     System.out.println();
        // }





        // pattern 2 -
        /*
       *  2  5
       * 3  6 8 
       * 4  7  9  10
         */
        // for (int i = 1; i <= n; i++) {
        //     int num = i;

        //     System.out.print(num + " ");

        //     for (int j = 1; j < i; j++) {
        //         num += n - j;
        //         System.out.print(num + " ");
        //     }

        //     System.out.println();
        // }



        // pattern 3 
        /*
         * 1 10 11 20
         * 2 9 12 19
         * 3 8 13 18 
         * 4 7 14 17
         * 5 6 15 16
         *          
         */

         int evenDiff = 2*n-1,oddDiff =1;

         for(int i =1; i<=n;i++)
         {

            int num =i;

            System.out.print(num + " ");

            for(int j=1;j<n; j++){

                if(j%2==0){
                    num+=oddDiff;
                    System.out.print(num+ " ");
                }
                else{
                    num+=evenDiff;
                    System.out.print(num + " ");
                }
            }

            evenDiff -=2;
            oddDiff +=2;

            System.out.println();


         }
    }
}
