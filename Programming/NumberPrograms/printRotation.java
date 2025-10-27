public class printRotation {
 
    


    public static void main(String[] args) {
        printAllRotations(1234);
    }


    static void printAllRotations(int num)
    {
         for(int i = num;i!=0; i/=10)
         {
            num = rotateNumber(num);
            System.out.println(num);
         }
    }


     static int rotateNumber(int num) {
        int last = num%10;
        num/=10;

        return last*power(10,count(num))+num;
    }

    static int power(int base, int raise) {
        int pow = 1;
        while (raise > 0) {
            pow *= base;
            raise --;
        }
        return pow;
    }

    static int count(int num){
        int count=0;
        while(num!=0){
            count++;
        }
        num/=10;
        return count;
    }
}
