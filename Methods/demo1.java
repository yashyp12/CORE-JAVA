
public class demo1 {

    public static void main(String[] args) {

        int num = 123;
        String str = new String("yash");

    

        System.out.println("before main() " + str);
        m1(str);
        System.out.println("after main() " + str);

    }

    static void m1(String str) {

        System.out.println("before m1()" + str);
        str = "swapni";
        System.out.println("after m1()" + str);

    }
}
