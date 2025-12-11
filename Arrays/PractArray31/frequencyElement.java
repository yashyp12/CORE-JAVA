package PractArray31;

public class frequencyElement {
    public static void main(String[] args) {
        
        // finding the max frequency of elemetnin an array

        int []arr = {2,3,2,5,2,3,3,3};
        int max_freq = -1;
        int element = -1;

        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max_freq){
                max_freq = count;
                element = arr[i];
            }
        }

        System.out.println("max freq of elemetn are " + element);
        
    }
}
