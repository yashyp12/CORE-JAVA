package Exceptions_Generics.ExceptionHandlingExamp6;

public class Student {

    String name;
    double per;


    Student(String name,int marks,int total) throws Exception
    {
        this.name = name;
        this.per = calcPercentage(marks,total);
    }

    public double calcPercentage(int marks,int total) throws Exception{
        return ((double) marks /total)*100;
    }

    public String toString(){
        return "Name :" + name + " , Percentage :" + per + " %";

    }
}


class Example1{


    static void main(String[] args) {

        Student obj = null;

        try{
            obj = new Student("Yash",470,50);
        }catch (Exception e){
            System.out.println("something went wrong exception handled");

        }
        System.out.println(obj);
    }
}
