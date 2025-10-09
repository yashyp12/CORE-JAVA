public class PatternSquare {
    public static void main(String[] args) {
        
        /*
         *    * * * * 
         *    *     *
         *    *     *
         *    * * * *
         */



         for(int i = 0; i<4;i++){

                for(int j=0; j<4; j++){
                    if(i==0){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
         }


        //  int n = 4;

        //  for(int row = 1; row<=n; row++){

        //     for(int col = 1; col<=n; col++)
        //     {
        //         if(row==1 || row ==n || col==1 || col==n)
        //         {
        //             System.out.print("*");
        //         }else{

        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(); //next row
        //  }
    }
}
