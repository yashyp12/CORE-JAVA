
public class pattern4 {
    public static void main(String[] args) {
        
        int n = 4;

        // step 1 - count the rows
        // step 2 - how many coln each rows hass
        //step3 - outer loop of the coutn of rows


        for(int rows = 1; rows<=n; rows++){

            for(int col = 1; col <=rows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
