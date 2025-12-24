package PractArray31;

public class frequencyArr {
    // program for couting the frequency of each element in an array
    public static void main(String[] args) {
        int[]arr = {10,20,30,10};
        freqElement(arr);
    }
    static int[] freqElement(int []arr){
        int [] count = new int[arr.length];
        // {0,0,0,0}
//if count[j] = -1 means already counted
        
        for(int i =0;i<arr.length;i++){
            int cnt = 1;
            
            for(int j =i+1;j<arr.length;j++){
                if(count[j]==-1) continue;
            
                if(arr[i]==arr[j])
                {
                    cnt++;
                    count[j]=-1;
                }
                count[i] = cnt;
            }
            
        }

        return new int[4];
    }
}
