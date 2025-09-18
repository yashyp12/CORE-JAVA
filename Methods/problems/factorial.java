public class factorial {
    

    public static void main(String[] args) {
        //1 - find factors 
        // 2 - count factors 
        //3 - if count ==2 then its prime num

int num = 20;
fact(num);
    }

    //factorial of number 20 - > 
    public static void fact(int num){

        int count = 0;

        for(int i=1; i<=num; i++){

            // we are just doing that checking whther the 
            //num till 20 are fully divisble by num or not
            //if yes then in that case its factor of that num
            if(num%i==0){
                System.out.println(i);
                count++;
            }
        }

        System.out.println("total factors of " + num+ " are " + count);

    }
}
