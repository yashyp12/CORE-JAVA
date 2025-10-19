
public class ExxamVargs {
    // Variable Arguments (Varargs) in Java

// In Java, Variable Arguments (Varargs) write methods that can take any number of inputs, which simply means we do not have to create more methods for different numbers of parameters. This concept was introduced in Java 5 to make coding easier. Instead of passing arrays or multiple methods, we can simply use one method, and it will handle all the test cases.
    public static void Names(String... n) {
        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Names("Yash");
        Names("Yash", "new");
    }
}
