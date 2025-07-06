package out.production.practise;

public class operators {
    
// 
    byte x = 5;
    short z = 8;
    int b = 25;
    int l =z + b; 
    float a = 6.54f + 6;
    float m = z + x;
    // it will giv an error that cannot convert from
    // int to short 
    // short s = x + z;
    
  char i = 'y';
  short o = 24;




public static void main(String[] args) {
     operators op = new operators();
     System.out.println(op.i);
}

    /** 
     * rules of dat type is below 
     * byte  + short -> int
     * short  + int -> int
     * long  + float -> float
     * int  + float -> float
     * char  + int   -> int
     * char  + short -> int
     * long  + double -> double
     * float  + double -> double
     * */ 




}
