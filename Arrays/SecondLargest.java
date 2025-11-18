public class SecondLargest {

    static void main(String[] args) {

        int[]arr = {23,43,22,55,54};
        System.out.println(SecondLargestArr(arr));

    }

    static String SecondLargestArr(int[]arr){

        int largest = arr[0];
        int SecondLargest = arr[0];

//        for(int i =0; i<arr.length; i++){
//            if(arr[i]>largest){
//                SecondLargest = largest;
//                largest = arr[i];
//            }else if(arr[i] >SecondLargest){
//                SecondLargest = arr[i];
//            }
//        }

        for(Integer j : arr){
            if(j>largest){
                SecondLargest = largest;
                largest = j;
            }else if (j>SecondLargest){
                SecondLargest = j;
            }
        }

        return "first Largest " + largest + " " +"Second Largest is " + SecondLargest;
    }
}
