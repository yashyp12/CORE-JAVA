package out.production.practise;

public class armstrong {
    public static void main(String[] args) {
        
        int num = 153,add = 0,r1;
        int org = num;
        while (num>0) {
            r1 = num%10;
            add = r1*r1*r1+add;
            num = num / 10;

        }
        if (org == add) {
            System.out.println("this sis armstrong  num");
            
        }
        else{
            System.out.println("this is not a armstrong number");
        }
    }
}
