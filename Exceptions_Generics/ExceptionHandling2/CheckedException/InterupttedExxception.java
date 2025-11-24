package Exceptions_Generics.ExceptionHandling2.CheckedException;

public class InterupttedExxception {


    static void main(String[] args) throws InterruptedException {

/*
means we are thats why throwing an interuppted exception , because when the thread are sleep for 1 seconds anything thats
why if another thread has disturb it it can throw an itneruppted error right
 */
        System.out.println();
        for(char i ='A'; i<='Z';i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println();

    }

}
