package StringPrograms;

import java.util.Arrays;

public class StringCombination {

    public static void main(String[] args) {

        String str = "abc";
//        combination2(str);
//        rotateString(str);

//        System.out.println(rotateString(str));
    }
//permutations
    //combination
    private static void combination2(String str) {
        //j
        //   i
        // 0 1 2
        // a b c

        for(int i =0;i<str.length();i++){
            System.out.println(str.charAt(i));
            String str1 = str.charAt(i)+""; //"ba

            for(int j=0;j<str.length();j++){
                if(i==j) continue;
                str1 += str.charAt(j);
                System.out.println(str1);
            }
            str1="";
        }
    }

    public static void permutation(String str){
        //permutaion in the strings

    }




    /*
        rotation = rotation%arr.length;
        for (int i = 1; i <=rotation; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("rotated to clockwise arr " + Arrays.toString(arr));
    }
     */


    private static void rotateString(String str){
        char[]arr = {'a','b','c','d'};

        int temp = arr[0];
        for(int j = 0;j<arr.length;j++){
            arr[j] = arr[j+1];
        }
//        arr[arr.length-1] = temp;
    }

}


