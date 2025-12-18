package ArrayBasics;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        // int[] a; // 1 -d arr
        // int b[]; // // 1-d
        // int[][] c; // 2-d
        // int[] d[]; // same as int [][]d
        // int[][] e; // 2d array
        // int[] f, g; // both f and g are int []
        // int h[], i; // h is int[] , i is varaible
        // int[] j[], k; // j is int [][] , k is int[]
        // int[][] l[], m, n; // l is [][][] and m and n are int[][]
        // int[][] aa[], bb[], cc; // aa and bb are int[][][] cc is int[][]

        // int[][] jaggedArr = {
        // { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 }
        // };

        // System.out.println(Arrays.deepToString(jaggedArr));

        // byte[][] a = new byte[2][3];
        // a[0][0] = 1;
        // a[0][1] = 2;
        // a[0][2] = 3;

        // a[1][0] = 4;
        // a[1][1] = 5;
        // a[1][2] = 6;

        // System.out.println(Arrays.deepToString(a));

        // int[] arr4 = new int[4];
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr4.length; i++) {
        // arr4[i] = sc.nextInt();
        // }

        // initialsing an array usign random function
        // int[] arr5 = new int[(int)(Math.random()*10)];

        // for (int i = 0; i < arr5.length; i++) {
        // arr5[i] = (int)(Math.random()*10);
        // }

        // initialising an char array
        char[] charr = new char[26];
        // System.out.println(Arrays.toString(charr));

        // System.out.println(charr[2] == '\0');
        // System.out.println(Arrays.toString(charr));

        // int ch = 65;
        // for (int i = 0; i < charr.length; i++) {
        //     System.out.println("adding element " + ch);
        //     charr[i] = (char) ch;
        //     ch++;
        // }

        // for (int i = 0; i < charr.length; i++) {
        //     System.out.print(charr[i] + " ");
        // }



// initialsing an char array using random function
// random *100 gives us 0 to 100

int randomNum = 65 + (int)(Math.random()*26);     // generate from 65 to 90                                                                               
 
char chr9[] = new char[26];
for(int i =0;i<chr9.length;i++)
{
    if(randomNum<=90){
        chr9[i] = (char) randomNum;
        randomNum++;
    }else{
        randomNum = 65;
        chr9[i] = (char) randomNum;
        randomNum++;   
    }
}

System.out.println(Arrays.toString(chr9));






// char chr8 []  = new char[26];
// for(int i = 0;i<chr8.length;i++)
//     {
//         if(randomNum>=65 && randomNum<=90)
//             chr8[i] = (char)randomNum; randomNum++;
//     } 

//     System.out.println(Arrays.toString(chr8));


 





    }
}
