import java.util.Scanner;

public class Switchex {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the operation");
        String op = sc.next();
        System.out.println("enter the valeu 1 ");
        int n1 = sc.nextInt();
        System.out.println("enter val 2");
        int n2 = sc.nextInt();
//
//        switch (op) {
//            case "Addition": {
//                int ans = n1 + n2;
//                System.out.println(ans);
//                break;
//            }
//            case "Subtraction": {
//                int ans = n1 - n2;
//                System.out.println(ans);
//                break;
//            }
//
//            case "Multiplication": {
//                int ans = n1 * n2;
//                System.out.println(ans);
//                break;
//            }
//
//            case "DIVISION": {
//                int ans = n1 / n2;
//                System.out.println(ans);
//                break;
//            }
//
//            default:
//                System.out.println("invalid expression");
//                break;
//        }

//        switch expression

        int ans =
                switch (op) {
                    case "Addition" -> n1 + n2;
                    case "Substraction" -> n1 - n2;
                    case "Multiplication" -> n1 * n2;
                    case "Division" -> n1 / n2;
                    default -> {
                        System.out.println("invalid operation");
                        yield 0;
                    }
                };

        System.out.println(ans);
    }
}
