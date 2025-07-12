
import java.util.Scanner;

public class vowelsConsonents {
    
    // check whether the character is vowels or consonents 
    //vowels -> a,e,i,o,u
    // consonents -> other than vowels


    public static void main(String[] args) {
        System.out.println("enter the character");
        char name = new Scanner(System.in).next().charAt(0);

        if(name == 'a' || name =='e' || name =='i' || name =='o' || name =='u'){
            System.out.println("the character is vowel bhai");
        }

        if(name != 'a' && name != 'e' && name !='i' && name !='o' && name !='u'){
            System.out.println("the character is consonent");
        }
    }

}
