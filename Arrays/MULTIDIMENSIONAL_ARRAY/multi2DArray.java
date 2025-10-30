package MULTIDIMENSIONAL_ARRAY;
import java.util.Arrays;


import java.util.Scanner;

public class multi2DArray {

    public static void main(String[] args) {
        System.out.println("hello");
      Scanner in = new Scanner(System.in);


//      array 1d
//        int []arrx = {2,3,5,6};
//      ENHANCED FOR LOOP ITERATE OVER ARRAY
        //in the array thhe int num defiens the type of data in every elemetn
//        for(int num:arrx){ //for every element in array, print the element
//            System.out.print(num + " "); //num represents the element of the array
//        }



        /*

        1 2 3
        4 5 6
        7 8 9
         */
//        int[][] arr = new int[3][];
//        syntax int [][] arr = new int [rows][col];
//        int[][] arr1 = {
//                {2, 3},
//                {3, 4},
//                {5, 6}
//        };

//        int[][] arr2D = {
////                NO OF COL IN 1 ROW IS 3 , 2 -2 , 3- 4
//                {1, 2, 3},  //0TH INDEX // size of 3
//                {4, 5},    // 1ST INDEC  // size of 2
//                {6, 7, 8, 9}  // 2ND INDEX -> ARR[2] = {6,7,8,9} //size of 4
//        };



//        int[][] arr = new int[3][2];
//        System.out.println(arr.length); // returns the rows

//        for(int row=0; row<arr.length;row++){
//            //for each col in every row , we are say
//            // every of thet row the length of that array
//            for(int col = 0;col<arr[row].length;col++){
//                arr[row][col] = in.nextInt();
//            }
//        }



//        System.out.println(Arrays.toString(arr2D[0]));
//        for(int i=0; i<arr2D.length;i++){
//            System.out.println(Arrays.toString(arr2D[i]));
//        }



//        input
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }


// let we have an aray
        /*     arr[3],[2] 3 rows and 2 col
                 [ 0, 0,0

         */

        int[][] arr = new int[3][3];
//        3 rows 3 column
        /*     C1  C2
              [ 0 ,  0]   ROW 1 arr[row].len   /arr[0].len ->2
              [ 0  , 0  ] ROW 2                 arr[1].len
              [ 0 ,  0 ]   RPW 3
         */
//        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);

//        to take an input to the array
//        for(int row = 0; row<arr.length; row++){
//
//            for(int col=0; col<arr[row].length;col++)
//            {
//                arr[row][col] = sc.nextInt();
//
//            }
//        }

//        System.out.println(arr[1].length);
//        to print the array
        //iterating over every row
//        for(int row =0; row<arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        taking input in the array from the user
        for(int row =0; row<arr.length; row++){
                for(int col =0; col<arr[row].length;col++){
//                    System.out.print(arr[row][col] + " ");
                    arr[row][col] =  new Scanner(System.in).nextInt();
                }
            System.out.println();
        }

//    System.out.println(Arrays.toString(arr[2]));
//we are itrating every column using another for loop

//another waY of printing - THE SINGLE INDIVIDUAL ELEMENTS OF THE OUTSIDE ARRAY IS THE ARRAY ITSELF
//      for(int row=0; row<arr.length; row++){
//          System.out.println(Arrays.toString(arr[row]));
//      }

//        ENHANCED way to iterate over array
        // type of data in every elementis array so we need int []a
        // Datatype of every single element of an array itself is an array
        for(int[]a : arr){
            System.out.print(Arrays.toString(a));
            System.out.println();
        }


    }
}
