package Recursion;

public class Fibonacii {
    static void main(String[] args) {

        System.out.println(fibo(4));
    }

    static int fibo(int n){

        if(n<2) return 1;

      return fibo(n-1) + fibo(n-2);
    }


}


