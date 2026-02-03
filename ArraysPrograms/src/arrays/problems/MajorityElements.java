package arrays.problems;

public class MajorityElements {

    static void main(String[] args) {

        int[]arr = {2,2,1,2,3,2,2,2};

        System.out.println(majorityElement2(arr));

    }

    private static int majorityElement(int[] arr){

        int candidate = 0;
        int count =0;

        for(int nums:arr){
            if(count==0){
                candidate = nums;
            }

            count += (candidate==nums) ?1:-1;
        }
        return candidate;
    };



        private static int majorityElement2(int[]arr){

        boolean []trace = new boolean[arr.length];

        for(int i =0;i<arr.length;i++){
            if(trace[i]) continue;
            int cnt = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    trace[j] = true;
                    cnt++;
                }
            }
            if(cnt>arr.length/2){
                return arr[i];
            }
        }
        return 0;
        }
}
