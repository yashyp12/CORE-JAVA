import java.util.Scanner;

public class days {
    

    public static void main(String[] args) {
        
        System.out.println("enter the day");
        int day = new Scanner(System.in).nextInt();

        if(day>7 && day<1){
        System.out.println("invalid input entred");
        }

        String days = switch(day){
            // we can add multiple similar cases into single line
            //help in fallthrough
            case 1,2,3 ->  "Monday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 ->"Sunday";
            default -> "Invalid data entered";
        };

        System.out.println(days);
    }
}
