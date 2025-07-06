import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        
        //  find vowels or consonent - > print char is vowel or char is constant
// vowels - aeiou consonent - other than vowels 
Scanner sc = new Scanner(System.in);

System.out.println("enter the character ");
char ch = sc.next().toUpperCase().charAt(0);
 
System.out.println(ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? "the charater is vowel":"character is consonent");

    }
}
