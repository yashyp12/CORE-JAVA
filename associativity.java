// associativity in java precedence

public class associativity{

    public static void main(String [] args){

        // int a = 6*5-34/2;
        /* ass per the bodmas rule the multiplcation will execute  first
        highest precendence goestto * and / .
         *  30 - 34/2
         *
         */
        // int b = 60/5-34*2;
        /*
         *  (* aur / are same in precedence - 
         * asssociativity - 
         * left to right .
         *  = 60/5 
         * = 12 - 34*2
         * =  12 - 68
         * = -56
         */

        // precedence & associativity 
        // System.out.println(a);
        // System.out.println(b);

// quick quiz - > x - y /2 , b 2 - 4ac / 2a, v square - u  square , 2*b-d

int x = 12;
int y = 15;
int b = 43;
int a = 10;
int c =5;

// int k = x-y /2;

// b2 - 4ac
// the paranthesis has higher precedence 
int k = b*b - (4*a*c)/2*a;

System.out.println(k);




    }
}