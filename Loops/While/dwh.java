
public class dwh {

    public static void main(String[] args) {

        // loop 1 to 100 do while
        // int i =100;
        // do { 
        //     System.out.println(i);
        //     i++;
        // } while (i<=100);
        // FOR LOOP 100 TO 1
        // do { 
        //     System.out.println(i);
        //     i--;
        // } while (i>=1);
        //  1 TO 100 EVEN NUM
        // int i =1;
        // do { 
        //     if(i%2==0){
        //         System.out.println(i);      
        //     }
        //     i++;
        // } while (i<=100);
        // 1 TO 100 ODD NUM
        // int i =1;
        // do { 
        //     if(!(i%2==0)){
        //         System.out.println(i);
        //     }
        //     i++;
        // } while (i<=100);
        // CAPITAL A TO Z 
        // char ch =65;
        // do { 
        //     System.out.println(ch);
        //     ch++;
        // } while (ch<=90);
        // a to z ->
        // char ch = 97;
        // do { 
        //     System.out.println(ch);
        //     ch++;
        // } while (ch<=122);
        // digits 0 to 9;
        // int i =0;
        // do { 
        //     System.out.println(i);
        //     i++;
        // } while (i<=9);
        //a to z , capital , 0 to 9
        // char ch = 45;
        // do { 
        //     if(ch>=49 && ch<=57){
        //         System.out.println(ch);
        //     }
        //     else if(ch>=65 && ch<=90){
        //         System.out.println(ch);
        //     } else if(ch<=122 && ch>=97){
        //         System.out.println(ch);
        //     }
        //     ch++;
        // } while(ch<=122);
        // loop z to a do while
        // char ch = 122;
        // do {
        //     System.out.println(ch);
        //     ch--;
        // } while (ch >= 97);
// Ascii characters with ascii value (A TO Z)
// char ch = 65;
// do { 
//   System.out.println(ch + " " + (int)ch);
//   ch++;  
// } 
// while(ch<=90);
// Ascii characters with ascii value (a to z)
// char ch = 97;
// do { 
//     System.out.println(ch);
//     ch++;
// } while (ch<=122);
// series Alphabets (ACFGOU) +1;
        char ch = 65;
        int j = 1;

        do {
            System.out.println(ch);
            j++;
            ch += j;
        } while (ch <= 'Z');
    }
}
