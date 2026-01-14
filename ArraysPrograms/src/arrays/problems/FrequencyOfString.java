package arrays.problems;

public class FrequencyOfString {

    static void main(String[] args) {
String str = "hello i am ramesh i am from pune ";

//step 1 - normalize str
        str = str.toLowerCase().trim();
//       2 split it into words
        String[]arr = str.split("\\s+");

//        step 3 tracking aray
        boolean trace[] = new boolean[arr.length];

//        sep 4 find the frequency
        for(int i =0;i<arr.length;i++){

            if(trace[i]) continue;
            int count = 1;

            for(int j =i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    trace[j] = true;
                }
            }
            System.out.println(arr[i] + " :" + count);
        }
    }
}
