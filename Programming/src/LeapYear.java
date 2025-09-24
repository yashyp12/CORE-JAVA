import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        /*
        year comes every 4 year -
        but after a century -
        like we have to use it year/4 ==0 and
        year/100 !=0 or year/400

         */
        System.out.println("enter the year to check");
        int year = new Scanner(System.in).nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("hey its an leap year");
        }else{
            System.out.println("its not an leap year");
        }


    }
}
