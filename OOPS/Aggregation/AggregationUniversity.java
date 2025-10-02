//
//import java.util.ArrayList;
//
//class Student {
//
//    private String studName;
//    private int rollNo;
//
//    public Student(String studName, int rollNo) {
//        this.studName = studName;
//        this.rollNo = rollNo;
//    }
//
//    public String getStudInfo() {
//        return studName + " Roll is : " + rollNo;
//    }
//
//}
//
//class University {
//
//    private String UniversityName;
//    private String Address;
//    private ArrayList<Student> students = new ArrayList<>();
//
//    public University(String name, String Address) {
//        this.UniversityName = name;
//        this.Address = Address;
//    }
//
//    public void addStudent(Student student) {
//        students.add(student); // student obj passed in aggregation
//    }
//
//    public void getUniversityInfo() {
//        System.out.println("UNIVERSITY INFO ");
//        System.out.println("University name - " + UniversityName);
//        System.out.println("Address - " + Address);
//        System.out.println("Student Lists");
//
//        for (Student s : students) {
//            System.out.println(s.getStudInfo());
//        }
//    }
//
//}
//
//public class AggregationUniversity {
//
//    public static void main(String[] args) {
//        Student s1 = new Student("YASH", 0);
//        Student s2 = new Student("sWAPYA", 1);
//        Student s3 = new Student("Ritik", 2);
//
//        University university = new University("NMU", "jalgaon");
//        university.addStudent(s1);
//        university.addStudent(s2);
//        university.addStudent(s3);
//
//        university.getUniversityInfo();
//    }
//}
