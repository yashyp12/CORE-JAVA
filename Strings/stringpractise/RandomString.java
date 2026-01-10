package Strings;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;
public class RandomString {

    public static void main(String[] args) {
int n =20;
String name = generate(n);
        System.out.println(name);


//        removing whitespaces
        String sentence = "hi   h   i  has slow ";
        System.out.println(sentence);

//        System.out.println(sentence.replaceAll("\\s",""));
        String arr = "YASH PATIL SWAPNIL RAHUL";

        String [] names = arr.split(" ");
        System.out.println(Arrays.toString(names));
    }

    static  String generate(int size) {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();

        for(int i=0; i< size; i++){
            int RandomChar = 97 + (int)(random.nextFloat()*26);
            buffer.append((char)RandomChar);
        }
        return buffer.toString();


    }
}
