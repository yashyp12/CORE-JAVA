public class increment {
    
    // increment / decrement  -> pre increment and post increment

    public static void main(String[] args) {
        
        int a = 2;
        int b = ++a;
        int c = b++;

        // preincrement -
        // System.out.println("value will update first "+ ++a);  // 3 stored -> a
        // System.out.println( a++ + " value will update later "); //current - 3 // updated ->4
        // System.out.println(a);

        System.out.println(b);
        
    }
}
