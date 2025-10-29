import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 25;
//        arr[3] = 13;
// [23,45,25,13]

        //input usign for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for printing the array ->enhanced loop
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

//        System.out.println(Arrays.toString(arr));


//        enhanced for loop
//        for(int num :arr) { //for every element in array print the element
//            System.out.println(num); //num represents the element of the array
//        }

//        System.out.println(arr[5]);

//      array clas has tostring method which converts the arr converting it to string
//        System.out.println(Arrays.toString(arr));

//        he maximum valid index of any Java array is always array.length - 1.
//        int maxofArray = arr.length-1;
//        System.out.println(maxofArray);



//        Array of objects
        String [] str = new String[4];
        for(int i =0; i<str.length; i++){
            str[i] = new Scanner(System.in).next();
        }

//        System.out.println(Arrays.toString(str));

//        MODIFY the string array
//        str[1] = "Yash";
////        System.out.println(str[0]);
////
////        for(String i :str){
////            System.out.println(i);
////        }

        

    }

}
