package StaticEx;

import java.util.Arrays;

public class staticex4 {

    static class Innerclass {
//        String name;
         String name;

        public Innerclass(String name) {
            this.name = name;
            System.out.println("hey i am " + name);
        }

        //    overriding tostring here
//while runnign an println if toString availaible here it wil pick this one if not it will call  by default one

//        @Override
//        public String toString() {
//            return name;
//        }
    }




//    the inenr class can have thier own objects , nested classes can be static
    public static void main(String[] args) {
        Innerclass c = new Innerclass("Yash");
        Innerclass d = new Innerclass("nIKHIL");
        System.out.println(c.name);
        System.out.println(d.name);

//        Arrays.toString(new int[]{3,4,5});

        System.out.println(c);
    }
}
