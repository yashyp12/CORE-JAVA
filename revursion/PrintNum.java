
public class PrintNum {

    static int a = 0;

    public static void main(String[] args) {

        printNum();

    }

    static void printNum() {
        System.out.println(++a);
        if (a == 100) {
            return;
        }

        printNum();

    }


    
}


class DEMO{

    static char alph = 'Z';
    public static void main(String[] args) {s
        printAlpha();
    }

    static void printAlpha(){
        System.out.println(alph--);
        if(alph == 'A'){
            return;
    }
    
}

