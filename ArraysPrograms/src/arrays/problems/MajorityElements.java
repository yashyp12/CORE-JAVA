package arrays.problems;

public class MajorityElements {

    static void main(String[] args) {

        int[]arr = {2,2,1,2,3,2,2,2};

        System.out.println(majorityElement(arr));

    }

    private static int majorityElement(int[] arr) {
    int candidate = 0;
    int count = 0;

    for(int num : arr){
        if(count == 0){
            candidate = num;
        }
        count += (candidate == num) ? 1 :-1;
    }
    return candidate;
    }
}
