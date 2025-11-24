package Exceptions_Generics.ExceptionHandling2.CheckedException;

import java.io.FileReader;
import java.io.IOException;


public class CheckedException {

    //if the called method throws an exception then calling method must handled it
    //SO THIS will handled by the defualt jvm exception handler
    static void main(String[] args) throws Exception {

        int a = 2;
        int b = 4;
        test();
    }

    static void test() throws IOException {
        FileReader fr = new FileReader("ABC.TXT");
        System.out.println(fr);

    }


}
