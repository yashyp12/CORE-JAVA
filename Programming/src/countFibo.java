public class countFibo {
    // 3 - count of fibo num between given range

    public static void main(String[] args) {
       
        int start = 10;
        int end = 50;

        int n1 = 0;
        int n2 =1;
        int n3;

        int count =0;

        while(n1<=end){

            if(n1>=start){
                count ++;

            }
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;

        }
        
        System.out.println("the coutn of fibo between range is " + count);

               

 
    }
}
