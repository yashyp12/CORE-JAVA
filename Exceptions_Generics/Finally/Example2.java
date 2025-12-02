public class Example2 {
    public static void main(String[] args) {
        
        try {
            System.out.println("try");
            System.out.println(10/0);
        } catch (ArithmeticException e ) {
            System.out.println("catch block 1");
            String str = null;
            str.length();
        }
        catch (Exception e){
            System.out.println("catch block 2");
        } finally{
            System.out.println("finally block ");
        }
        System.out.println("main ends");
    }
}
