import java.util.Scanner;
public class exm {
    
    /* wap to calculate the percentage of given cbse board exam, his marks from 5 subjects
     must be taken ass input from the keyboard - 
     formula - Percentage = (Total Marks obtained / total max possible marks )* 100   
     */

    public static void main(String[] args) {
        int english,maths,sci,history;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for english ");
        english =  sc.nextInt();
        System.out.println("Enter marks for the maths");
        maths =  sc.nextInt();
        System.out.println("Enter the marks for the history");
        history =  sc.nextInt();
        System.out.println("enter your sci marks");
        sci =  sc.nextInt();


        // calculating thier percentage
        float max_marks = 500;
        float total_marks = english + maths + history + sci;
        float percentage = (total_marks/max_marks)*100;

        System.out.println("you got " + percentage + " Percentage");

        

    }
}
