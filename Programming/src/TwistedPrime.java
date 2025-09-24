
import java.util.Scanner;


// import java.util.Scanner;

// public class primeNos {

//     //the num is only divisble by one or itself
//     /*STEP 1 - read the num
//      * num  = numerator , din = denominator
//      * every num is divisible by 1 or itself - so skip that  iteration
//      * then for every num factors are found only half of it means
//      * 10/2 - you will only get a factors of 10 till half of it till 5 only
//      * so will check condition of factors only till half of the num
//      * 
//      * every number is - divisible by itself and 1 so skip this iteration
//      * start denominator from 2 and check it till num/2 (half) 
//      */
//     public static void main(String[] args) {
//         System.out.println("enter the num");
//         int num = new Scanner(System.in).nextInt(); //10
//         int den = 2; // starting from 2 bcz every num is divisble by 1 

//         while (den < num / 2) { //taking less than half of num then goes directly to the else condtion
//             if (num % den == 0) {
//                 break; // breaking bcz we found an num who is divisible by num simple logic break here
//             }
//             //if any case not found let increment the den
//             den++;
//         }

//         //now wil check whether the num == den bcz if that found then the num is not a prime 
//         //bcz if it is not equals to den then definetly it has some factors in above condition
//         if (num == den) {
//             System.out.println("its prime num");
//         } else {
//             System.out.println("its not an prime num");
//         }

//     }
// }




public class TwistedPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=2;
        while(temp*temp<num){
            if(num%temp==0){
                break;
            }
            temp++;
        }
        if(temp*temp>num){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}