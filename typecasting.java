public class typecasting {
    public static void main(String[] args){
        /*  type casting - > converting one datatype to another
        java automatically converts smaller to larger this called widening
        and we forcefully converts larger to smaller called narrowing.
        */

        // widening
        // int a = 10;
        // double b = a;
        // System.out.println(b);

        // // narrowing - can causes the data losses
        // double x = 10.5;
        // int y = (int)x;
        // System.out.println(y);

       int num=25;
       String name="Yash";
       System.out.println(name+num);
       String name2  = "Patil";
       System.out.println(name +" "+ name2);
        
    }
}
