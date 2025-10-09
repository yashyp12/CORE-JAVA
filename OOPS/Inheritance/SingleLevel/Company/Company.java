
class Employee {

    String name;
    double salary;
    String id;
    String role;

    public Employee(String name, double salary, String id,
            String role) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.role = role;
    }

    public void getEmployee() {
        System.out.println("Name " + name + "Salary " + salary + "id" + id + "Role " + role);
    }

}

class Manager extends Employee {

    int Manager_id;
    String Mob;
    String mgr_name;

    public Manager(int Manager_id, String Mob, String mgr_name,
            String name, double salary, String id,
            String role) {
        super(name, salary, id, role);

        this.mgr_name = mgr_name;
        this.Mob = Mob;
        this.Manager_id = Manager_id;
    }

    public void getManager() {
        System.out.println("MANAGER ID " + Manager_id + "Mob " + Mob + "Manager Name" + mgr_name);
    }

}

public class Company {

    public static void main(String[] args) {

        Manager m1 = new Manager(01, "78555", "Yash Patil", "RAUT", 45000.0, "EMP12", "SDE");

        m1.getManager();

    }
}
