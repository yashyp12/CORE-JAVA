package PractArray31;

public class DupArr {

   public static void main() {

       // return the duplicate elemet from the array
       int []arr = {1,2,3,4,5,6,6};

       for(int i =0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(i==j) {
                   continue;
               }
               if(arr[j]==arr[i]){
                   System.out.println(arr[i]);
               }
           }
       }
    }
}
