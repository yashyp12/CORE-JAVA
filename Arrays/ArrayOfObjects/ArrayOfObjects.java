
class Student{

    public int roll_no;
    public String name;

    Student(int roll_no,String name){
            this.roll_no = roll_no;
            this.name = name;
    }
}

public class ArrayOfObjects{

    public static void main(String[] args) {
        // Array of  Objects - An array of objects is created like an array of primitive-type data items
        

        Student[]arr = new Student[5];

        arr[0] = new Student(101,"Yash");
        arr[1] = new Student(102,"Prathamesh");
        arr[2] = new Student(103,"Raut");
        arr[3] = new Student(104,"Raut");
        arr[4] = new Student(105,"Raut");
       

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i].roll_no);
        }

         

        
    }
}