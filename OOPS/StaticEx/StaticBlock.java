package StaticEx;

public class StaticBlock {

//    demo fro static initialisation of static variables

    static int a = 4;
    static int b ;

//    
    static{
        System.out.println(" i am a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
