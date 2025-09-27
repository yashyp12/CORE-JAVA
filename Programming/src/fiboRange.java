public class fiboRange {
    // print fibonacii in the range of 10 to 50
    //start 10 end = 50 n1 = 0 n2 =1
    
    public static void main(String[] args) {
      int start = 10;
      int end = 50;

      int n1 = 0;
      int n2 =1;
      int n3;

      while(n1<end){
        n3 = n1+n2;

        if(n1>start){
            System.out.println(n1);
        }
        n1 = n2;
        n2 = n3;
      }

    }
}
