package While;

public class wh1 {

    public static void main(String[] args) {
        //  While Loop

        // we not use the semicolon in while because we dont know the starting or ending point
        // int i = 1;
        // System.out.println("starts");
        // while (i <= 50) {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("ends");
// for(int a =122; a<=50; a++;){
//     System.out.println(a);
// }


// int i;
// do{
//     i = 1;
//     System.out.println(i++);    
// }
// while(i<=50); //semicolon needs here

// {
//     //this block is completely diff from the while condition
//     System.out.println("ends");
  
// }


// while loop 1 to 100
// int i =1;
// while(i<=100){
//     System.out.println(i);
//     i++;
// }

// while 100 TO 1
// int i = 100;
// while(i>=1){
//     System.out.println(i);
//     i--;
// }

// WHILE LOOP 1 TO 100 EVEN NUM
// int i = 1;
// while(i<=100){

//     if(i%2==0){
//         System.out.println(i);
//     }
//     i++;
// }


// Q4 - FOR LOOP 1 TO 100 ODD NUM
// int i =1;
// while(i<=100){
//     if(!(i%2==0)){
//         System.out.println(i);
//         i++;
//     }
// }

// Q1 - while LOOP CAPITAL A TO Z  
// char ch ='A';
// while(ch<=90){
//     System.out.println(ch);
//     ch++;
// }

// Q1 - FOR LOOP a to z
// char ch = 'a';
// while(ch <= 'z'){
//     System.out.println(ch);
//     ch++;
// } 

// while LOOP digits 0 to 9;
// int i = 0;
// while(i<=9){
//     System.out.println(i);
//     i++;
// }

//  while loop a to z , capital , 0 to 9 -->
// char ch = 48;
// while(ch<=122){
    
//     if(ch<=58 ){
//         System.out.println(ch);
//     }else if(ch>=65 && ch<=90){
//     System.out.println(ch);
//     }else if(ch>=97 && ch<=122){
//         System.out.println(ch);
//     } 
//     ch++;
// }


// while loop z to a
// char ch = 122;
// while(ch>=97){

//     System.out.println(ch);
// ch--;
// }

// Ascii characters with ascii value (A TO Z)
// char ch = 65;
// while(ch<=90){
//     System.out.println(ch + " " +  (int)ch);
//     ch++;
// }


// series A CF J
// int j =1;
// char i = 'A';
// while(i<='Z'){
// System.out.println(i);
// i+=j;
// j++;
// }


// PRINT VOWELS USING THE SWITCH EXPRESSION AND WHILE LOOP

char ch = 65;

while(ch<=122){

    if(ch>90 && ch<97){
        continue;
    }

    else{
        String result = switch(ch){
            case 'A','E','I','O','U','a','e','i','o','u' -> "VOWELS "+ ch;
            default -> "consonent " + ch;

        };
        System.out.println(result);

    }
    ch++;
}

    }
}
// 