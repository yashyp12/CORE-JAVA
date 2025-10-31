package Strings;

public class StringPerformance {

    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series += ch;
        }

        System.out.println(series);

//if one of the datatype is string ans is string
        System.out.println("a" + 'a');

        /*
        # String Performance
 - whenever we cincatenate every time the new obj is created
 - it every time creates new obj and copies old one to new and discard reference from old one
 - these create lots of unused obj with not pointng to anything
 - this causes time complexity O(Nsquare)

         */
    }
}
