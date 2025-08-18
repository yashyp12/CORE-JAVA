public class pract1 {
    static int a ,b; // default val = 0
    
	public static void main(String[] args) {
        
        System.out.println("main () starts");
        m1();
        System.out.println("terminate");

    }

    static void m1(){
        System.out.println("m1() starts a incremented " + ++a);
        if(a==3){
            return; //false
        }
        m1();
        System.out.println("m1() ends " + ++b);
        System.out.println("java");
        
    }
}
