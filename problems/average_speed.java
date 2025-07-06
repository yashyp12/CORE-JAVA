import java.util.*;


public class average_speed {
            // 1 mile = 1.6 km 
        // a runne run 24 miles in 1 hr 40 min, 35 seconds, wjp to display 
        // 1 hr = 60 min , 40 min -> 
        // avg speed  -> avg always calculated by the hour only sowe need to convert into hour 
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // get the distance from the user in miles
        System.out.println("enter the distance");
        double mile = sc.nextDouble();

        // now we need to convert that in km -> 1miles = 1.6km
        double km = mile * 1.6;

        // get an hour min sec from the user
        System.out.println("enter hour");
        double hr = sc.nextDouble();

        // now min neeeds to convert into the hr which is need 
        // divide by 60 then will get an hr
        System.out.println("enter the minutes");
        double min = sc.nextDouble();

        // now seconds needs to convert into the hr which is 60*60 (min*hr)
        System.out.println("enter the seconds");
        double sec = sc.nextDouble();

        //  now  convert all to hr - hour = min/60

        min = min/60;

//         1 hour = 60 minutes  
//         1 minute = 60 seconds  
// =>      1 hour = 60 × 60 = 3600 seconds
/*
 * simple calc- ex 4 hr 
 * 
 * hr - min = hour * 60 (1hr - 60 min * 4 - > 240 min)
 * hr - sec = hour * 60 *60 (3600) -> 1hr - 3600sec or 1 min - 60sec (60*60)
 * min - hr = 40/60*60  -> 1hr->60min or 
 * sec - hr - sec/3600 (60min*60sec)
 */

// now convert seconds to the hr  - sec/3600
        sec = sec/(60*60);

        double totalHours = hr + min + sec;
        double average_speed = km / totalHours;
        System.out.println("average speed is " + average_speed + "km/h");

    }
}
