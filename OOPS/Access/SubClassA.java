package Access;

public class SubClassA extends A {
    public SubClassA(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        SubClassA obj = new SubClassA(125,"Yash");
        int n = obj.num;
    }

}
