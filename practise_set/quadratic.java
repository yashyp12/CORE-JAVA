import java.util.Scanner;

public class quadratic {
    


// Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.

// Implement a program to solve a quadratic equation.

// Find the discriminant value using the formula given below.

// discriminant = b2 - 4ac

// If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

// If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

// If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

// Use the formula given below to find the roots of a quadratic equation.

// x = (-b ± discriminant)/2a


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();
    System.out.println("Enter the value of c");
    int c = sc.nextInt();

    //FINDING DISCIRIMINATS d = b*b - 4ac

    int d = (b*b)-(4*a*c);
    System.out.println("the discriminant value is " + d);

    if(d==0){
        double root = -b /(2.0 * a);
        System.out.println("roots are equal");
        System.out.println("Root : " + root);

    }else if(d>0){
System.out.println("the roots are unequal roots ");
double sqrtD =  Math.sqrt(d);  //sqrt of discriminant
//  x = (-b +- discriminant)/2a
double root1 =(-b + sqrtD)/(2.0*a) ;
double root2 = (-b - sqrtD)/(2.0*a) ;
System.out.println("The first root is " + root1   );
System.out.println("The second root is " + root2   );
    }else if(d<0){
        System.out.println("the equation has no real roots");
    }

}


}
