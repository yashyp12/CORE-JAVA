package Exceptions_Generics.Cloning.Cloning;

class Address{

    String area;
    String city;

    Address(String area,String city){
        this.area = area;
        this.city = city;
    }

    public void displayAddress(){
        System.out.println("Address Info");
        System.out.println("Area " + area);
        System.out.println("City " + city);
    }
}

class Employee extends Address implements Cloneable{

    String name;
    String empid;
    double salary;

    Employee(String name,String empid,double salary,String area,String City){

        super(area,City);
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
     public void displayEmployee(){
        System.out.println("Employee Info");
        System.out.println("empid " + empid);
        System.out.println("Emp Name " + name);
    }

//    we need to override the clone method from teh obj class and ned to update its access modifer to public
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }


}


public class CloneObjNew {




    static void main(String[] args) {

        Employee oldObj = new Employee("Yash Patil","224",45000,"jal","pune");

        oldObj.displayEmployee();

        Employee copyObj = null;

        try{
            copyObj = (Employee) oldObj.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("clone not supproted exception handled");
        }
        System.out.println("    -----");
        System.out.println("check whether both are same or not  "  + (oldObj == copyObj));
        copyObj.displayEmployee();
    }
}
