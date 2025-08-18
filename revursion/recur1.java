public class recur1 {
    static int count =0;
    public static void main(String[] args) {
        System.out.println("hello");
        message(1);
    }

    static void message(int n){
        System.out.println(n);
        if(n==5){
            System.out.println("stop the execution here");
            return;
        }

        System.out.println("hello i am message calling message");
        count++;
                        System.out.println(count);



        message(n+1);
    }



}
