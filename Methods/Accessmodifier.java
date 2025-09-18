
public class Accessmodifier {

    public int x = 10; // accesible everywhere

    private int y = 25;

    public static void main(String[] args) {


        access ac = new access();
        ac.demo();
    }

    public void show() {
        System.out.println("public method"); // this  is an public method
    }

    private void secret() {
        System.out.println("private method");
    }

    private void useSecret() {
        secret(); // calling the private method within the same class
    }

    public static void dem() {
       System.out.println("this is a dem method bhai ");
    }

}

class access {

    public void demo() {
        System.out.println("this is a subclass");

        Accessmodifier obj = new Accessmodifier();
       Accessmodifier.dem(); // this is static method can be access via reference
        
    }

     
}
