package StaticEx;

public class staticex4 {

    static class Innerclass {
//        String name;
         String name;

        public Innerclass(String name) {
            this.name = name;
            System.out.println("hey i am " + name);
        }
    }

//    the inenr class can have thier own objects , nested classes can be static
    public static void main(String[] args) {
        Innerclass c = new Innerclass("Yash");
        Innerclass d = new Innerclass("nIKHIL");
        System.out.println(c.name);
        System.out.println(d.name);

    }
}
