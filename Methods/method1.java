
public abstract class method1 {
    // class having abstract keyword
    //cannot be instanciated (cannot create an object)
    static int num = 0;
    
    // format of main method
    // acess modifier - non access modifier - return type - methods name - parameterized argument
    public static void main(String[] args) {
    

    }

    // static keyword cannot be add to an top level classes
    // its needed outer class
    public static   class InnerClass{
        int a = 2;
// this method cannot instanciated
    }

    public class dem extends InnerClass{
        public static void main(String[] args) {
            InnerClass ia = new  InnerClass();
            System.out.println(ia.a);
        }
    }

    public abstract class demo{
        public static void main(String[] args) {
            System.out.println("hell");
        }
    }

    
 public static void m1(){
    
 }



}

 