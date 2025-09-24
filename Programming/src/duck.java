public class duck {
    public static void main(String[] args) {
       int num = 123;
        
       //read the num
       //extract the last digit nd check whether it contains 0 or not

       while(num!=0){
            if(num%10==0){
                break;
            }
            num/=10;
       }

       if(num==0){
        System.out.println("its not an duck no");
       }else{
        System.out.println("its an duck no");
       }
    
    }
}
