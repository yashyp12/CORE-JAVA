public class factorial78 {
    public static void main(String[] args) {
        

        long fact = 1;
        int num = 20;
        
        while(num!=0){
            fact*=num;
            num--;
        }
        System.out.println(fact);
    }
}
