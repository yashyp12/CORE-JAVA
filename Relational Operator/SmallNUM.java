import java.util.*;

class SmallNum{

    // finding the smallest num among 2
    public static void main(String[] args) {
     
        System.out.println("enter the num1");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("enter the num2");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println((num1<num2)?("num1 is smaller"):("num2 is smaller"));
        


    }

}