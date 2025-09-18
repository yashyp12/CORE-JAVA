
public class dem1 {

    public static void main(String[] args) {
        demo();
    }

    static void demo() {

        System.out.println("A");
        while (true) {
            System.out.println("hey you are inside the while loop");
            step1(); // from here control will goes to step 1 or waiting for control to come
            return;
        }
    }

    static void step1() {
        // here statement will execute then control wil go to stpe2 and method will wait here for control to come
        System.out.println("C");
        step2();
        return;
    }

    static void step2() {
        //this will execute then again it will go return to step1
        System.out.println("E");
        return;
    }
}
