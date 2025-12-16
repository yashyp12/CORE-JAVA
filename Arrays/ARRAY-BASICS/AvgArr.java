public class AvgArr {
    public static void main(String[] args) {

        int sum = 0;

        int[] arr = { 1, 2, 3, 4, 5 };

       for(int number : arr){
        sum+=number;
       }

        double avg = (double) sum / arr.length;
        System.out.println("Average " + avg);
    }
}
