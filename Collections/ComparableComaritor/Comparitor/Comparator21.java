package Collections.ComparableComaritor.Comparitor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;



class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return 0;
    }
}

class MyComparator implements Comparator<Integer>{

//    if it is negative then 01 will first and o2 will second
//    if the equals means both are euqal
//    if positive o1 will be after o2
    @Override
    public int compare(Integer o1, Integer o2) {
//        now we want an ascending num so this method schould return positive
        return o1-o2;
    }
}


public class Comparator21 {

    public static void main(String[] args){


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);


//        sort the leemnt in ascending
        list.sort(null);


        System.out.println(list);

        List<String> words = Arrays.asList("Banana","apple","date");
//     now we wnat to sort words bsed on length we can do using comaprator
        //comparator itnerface has comapre method , which comapres teh two objects of same type
//        System.out.println(words);
        words.sort(new StringLengthComparator());
//        words.sort(a,b) -> a.length() - b.length();




    }
}
