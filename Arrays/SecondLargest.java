public class SecondLargest {


    static void main(String[] args) {

        int[]arr = {2,32,15,25,32};

        System.out.println(SLargestArr(arr));

    }


    static String SLargestArr(int[]arr){

        int Largest = arr[0];
        int SecondLargest = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }else if(arr[i] >SecondLargest && arr[i] !=Largest){
                SecondLargest = arr[i];
            }
        }

        return "Largest " + Largest + "Second Largest " + SecondLargest;
    }
}