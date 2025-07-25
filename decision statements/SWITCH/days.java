import java.util.Scanner;

public class days {
    

    public static void main(String[] args) {
        
        System.out.println("enter the day");
        int day = new Scanner(System.in).nextInt();

        if(day>7 && day<1){
        System.out.println("invalid input entred");
        }

        int weeks = new Scanner(System.in).nextInt();

        switch(day){
            // we can add multiple similar cases into single line
            //help in fallthrough
            case 1,2,3 -> System.out.println("hello");
            case 4 -> System.out.println("hello");
            case 5 -> System.out.println("hello");
            case 6 -> System.out.println("hello");
            case 7 ->System.out.println("hello");
            default -> System.out.println("hello");
        }


        //if we are storing the value in a string then
        // need an semicolon at the end becz its an assignment 
        // or need to return vlue directly 

       String week = switch (weeks) {

        case 1 -> "monday";
        default -> "monday";

       };
       
    }
}
