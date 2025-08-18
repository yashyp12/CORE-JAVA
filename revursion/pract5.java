
public class pract5 {
 

    public static void main(String[] args) {

        print(1);
        System.out.println("funcc ends here print");

    }

    // static void print(int n) {
    //      System.out.println(n);
    //      print2(2);
    //      System.out.println("funcc ends here print2");
    // }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    //              System.out.println("funcc ends here print2");
    // }
    // static void print3(int n){
    //     System.out.println(n);
    //              System.out.println("funcc ends here print3");
    // }
    static void print(int n) {

        if (n == 3) {
            System.out.println("number is 4");
            return;
        }

        System.out.println("starting off func " + n); //1 // 2 // 3

        print(n + 1); // print(1+1) // print(2+1)   //print(3+1) -
        System.out.println("recurisve call executed " + n);

        //op
        /*
         * 1
         * 2
         * 3
         * number is 4
         * recursive call executed 3
         * recursive call execyted 2
         * func ends here
         * 
         * 
         */
    }

}
