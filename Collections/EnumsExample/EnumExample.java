package Collections.EnumsExample;

//1️⃣ Enum constants are objects, not strings
// all the enum explicitly extends java.lang.enum Class
//abstract are not allowd because it not inherit so no meaning of thats

import java.sql.SQLOutput;

public class EnumExample {

    //  mon tuesday is the object of type  enum class (Week) they are implcity public static final
    //define enum
    enum Week implements A {
        MONDAY, TUESDADY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        //this are enum constants
        // every single one is public static final
        // sicne it final we cannot create child enums
        // type iss week


//        need to override interface methods


        //        we can create a constructor in enum
        Week() {
//            here this refrrs to th current objects because all of these are objects
            System.out.println("constructor in enum" + this + " ");
        }

        @Override
        public void Hello() {
            System.out.println("overriding hello method");
        }

        //this si not public or protected , only private or default
        // why ? we dont want to  create new objects
        // this is ntot the enum concept thats why

//        inetanally : public static final Week Monday = new Week() ;
    }

    enum Month {
        JAN, FEB, MARCH, APR, MAY, JUNE, JULY
    }

    public static void main(String[] args) {
// enum constants are accessed using - EnumName.CONSTANT
        Week week; // step 1  - declare a variable of enum type
        week = Week.FRIDAY; //step2 -  assign a values to the variable
//        System.out.println(" printing week variable" + week); //use it

//        for (Week week1 : Week.values()) {
//            System.out.println("iterating over enum week ");
//            System.out.println(week1);
//        }

        Month month = Month.JAN;

//        System.out.println(week);

        //        methods -
        // ordinal() - position of the enum declaration like friday position
//        System.out.println("using enum ordinal() method " + week.ordinal());

//        System.out.println(month);

        System.out.println(week.ordinal());
//        valueof is static method
        System.out.println(Week.valueOf("MONDAY"));


//        declaring an var for enum
//        Days days = Days.FRI;
//        System.out.println(days);

    }

}
