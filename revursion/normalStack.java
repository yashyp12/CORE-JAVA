
import java.util.Scanner;

class normalStack{
    static int ans=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int pow=sc.nextInt();
        int store=recPower(base,pow);
        System.out.println(store);
    }

    public static int recPower(int base , int pow) {
        if(pow==0){
            return  0;
        }
        if(pow!=0){
            ans=ans*base;
            recPower(base, --pow);
        }
        return ans;
    }
}