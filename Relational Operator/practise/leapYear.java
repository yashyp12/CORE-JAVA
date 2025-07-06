package practise;

import java.util.Scanner;

class leapYear{
 
    // so the every 4 year there is leap year , earth rotate 365.25 days (
    // where .25 remains , now 0.25*4 = 1 then 1 day are added which is 29 feb 
    // thats why check num%4==0 and !%100==0 OR num/400==0 then its leap )
    public static void main(String[] args) {
        System.out.println("enter the year");
        int year = new Scanner(System.in).nextInt();

        System.out.println(((year%4==0 && year%100!=0 ?"its a leap year":
        (year % 400 ==0)?
        "its an leap year" :"not an leap year")));
    }
}