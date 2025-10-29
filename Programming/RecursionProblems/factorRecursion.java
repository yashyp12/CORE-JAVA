public class factorRecursion {
    

    public static void main(String[] args) {
        factors(100, 1);

    }

    static void factors(int num, int den){

        if(den>num)
        {
            return ;
        }
        else if(num%den==0){
            System.out.println(den);
        }

        factors(num, den+1);
    }
}
