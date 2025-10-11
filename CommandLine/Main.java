
public class Main {
// Running java GFG GeeksForGeeks prints GeeksForGeeks because the argument is passed to main(String[] args).
// If no arguments are given (e.g., java GFG), it throws ArrayIndexOutOfBoundsException since args is empty.

public static void main(String[] args) {
        System.out.println(args[0]);

        if(args.length > 0){
            System.out.println("command line " + "arg are");

            for(String str : args){
                System.out.println(str);
            }
        }
        else{
            System.out.println("No command line " + "argument found");
        }
    }
}
