package practise;
import java.util.*; 
class EvenOdd{

    // even odd with modulas 
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number");
    int num = sc.nextInt();

    // // using ternary operator 
    // System.out.println(num%2==0?"its an even num":"its an odd");
    
    // without using modules 
    //  qu0otient * divisor = divident then its a even num
    int quotient = num/2;  //so this will give us quotient 


    System.out.println((num == quotient*2)?
    "the num is even bhai" : "its an odd bhai ");
    
}

}