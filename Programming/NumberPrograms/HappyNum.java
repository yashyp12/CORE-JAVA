public class HappyNum {
    // happy or sad num


    public static void main(String[] args) {
        System.out.println(isHappy(5));
    }

    static boolean isHappy(int num)
    {

        if(num==4){
            return false;
        }else{
            int op = sumOfSqDigits(num);

            while(num!=1 && num!=4)
            {
                op = sumOfSqDigits(op);
            }
            return op ==1;
        }

    }


    public static int sumOfSqDigits(int num){
        int sum = 0;

        while(num!=0){
            sum = sum + ((num%10)*(num%10));
            num/=10;
        }

        return sum;

    }
}
