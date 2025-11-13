package Collections.ComparableComaritor.Comparitor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Studentz {

    private String name;
    private double gpa;

    public Studentz(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

}


public class StudentComparitorExx {


    public static void main(String[] args) {
        List<Studentz> students = new ArrayList<>();

        students.add(new Studentz("YaSH", 9.5));
        students.add(new Studentz("Bob", 3.5));
        students.add(new Studentz("Raj", 3.7));

//students.sort(null); will give an error

//       students.sort((o1,o2) -> (int) (o2.getGpa() - o1.getGpa()));
//        students.sort((o1, o2) -> {
//
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });


//        another way using method reference
//        Comparator.comparing(Studentz::getGpa); :: its an method refernce  - first compare the gpa then compared the name
       Comparator<Studentz> comparator =  Comparator.comparing(Studentz::getGpa).reversed().thenComparing(Studentz::getName);

students.sort(comparator);

        for (Studentz s : students) {
            System.out.println(s.getName() + " " + s.getGpa());
        }
    }
}
