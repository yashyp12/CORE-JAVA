package StaticEx;

//outer classes cannot be static
public class statics {

    //in this code if we try to access the
    // inner cclass static context it will show error because
//    the inner class is dependant on outer class
     static class A {
        String name;

        A(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
         statics s = new statics();

        }
    }
}

