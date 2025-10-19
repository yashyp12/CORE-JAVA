What is Varargs?
Varargs lets a method to take many values or even no value at all. Java will treat these values like a list, so that we can use them inside the method easily.

Syntax:

Internally, the Varargs method is implemented by using the single dimensions arrays concept. Hence, in the Varargs method, we can differentiate arguments by using Index. A variable-length argument is specified by three periods or dots(…). 

public static void fun(int ... a) 
{
   // method body
} 

This syntax tells the compiler that fun( ) can be called with zero or more arguments. As a result, here, a is implicitly declared as an array of type int[].

Why do we Need Varargs?
Until JDK 4, we can not declare a method with variable no. of arguments. If there is any change in the number of arguments, we have to declare a new method. This approach increases the length of the code and reduces readability.
Before JDK 5, variable-length arguments could be handled in two ways. One uses an overloaded method(one for each). Another puts the arguments into an array and then passes this array to the method. Both of them are potentially error-prone and require more code. 
To resolve these problems, Variable Arguments (Varargs) were introduced in JDK 5. From JDK 5 onwards, we can declare a method with a variable number of arguments. Such types of methods are called Varargs methods. The varargs feature offers a simpler, better option.
Example: Demonstrating the working of varargs with integer argument




class Geeks {
  
    // A method that takes variable number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: " + a.length);
​
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
​
    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with one parameter
        fun(100);