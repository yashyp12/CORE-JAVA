
public class printNumPattern {

    /*
     *    12345
     *    1234
     *    123
     *    12
     *    1
     * 
     * when outer loop is on 5 iteration teh same the inner loop also hass to be on 5th iteration
     * 
     * step 1 - run outer loop decrement by 1 evey time 
     * then same run inner loop with outer iteration
     * 
     * step2 - run the inner loop till outer loop
     */
    public static void main(String[] args) {

        // step 1
        // for(int i =0;i<5;i++){
        //     System.out.println(num);
        //     num++;
        // }
        // for (int i = 5; i > 0; i--) {
        //     int num = 1;
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        int n = 5;

        for (int i = 0; i < 5; i++) {
            int num = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
