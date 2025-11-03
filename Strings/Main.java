package Strings;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4};
        String name = "Yash Patil";

        String b = "Yash";

        String a = "Yash";

        System.out.println(a);
//        object is not changing we are creating a new obj
        a = "PATIL";
        System.out.println(a);


//        rounding off
        DecimalFormat ddf = new DecimalFormat("0.00000");
        System.out.println(ddf.format(7.29));

    }

}
