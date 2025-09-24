import java.util.Scanner;

public class SeasonSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month");
        String mon = sc.next();

        String season = switch (mon) {
            case "DEC", "JAN", "FEB" ->
                    {
                        System.out.println("you are lucky ");
                        yield "WINTER";
                    }
            case "MAR", "APR", "MAY" ->{
                System.out.println("you are born in summer ");
                yield "SUMMER";
            }
            case "JUNE", "JULY", "AUG", "SEP" -> "RAINY";
            //if you want to execute any statement after tis
            default -> "invalid month";

        };
        System.out.println(season);
    }
}
