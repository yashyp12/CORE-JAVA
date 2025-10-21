package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34, "Yash");

        //1 - access the data members
        // 2 modify the data members..
        System.out.println(obj.getNum());
        int n = obj.num;
    }
}
