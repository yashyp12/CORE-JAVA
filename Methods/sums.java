
public class sums{
    int a =34;
    int b =34;

    // method 
    public static int logic(int a,int b){
        System.out.println("sum of number");
        return a +b;
    }

    public void demo(int a){
       System.out.println(a);
    }

    static class Apple{
        public  void user(){
            System.out.println("hey user");
        }
        
    }

    public static void main(String[] args) {
        System.out.println("calling method");
        logic(23,43);

        Apple a = new Apple();
        // sums s = new sums();
        a.user();


    }

    
}
