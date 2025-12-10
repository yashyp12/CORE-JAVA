package PractArray31;


//count how many times a num appeared in an array
public class countOccurrence {

    static void main(String[] args) {

        int []arr = {4,4,4,2,1,6,7 };
        int count = 0;
        int num = 4;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==num) count++;
        }

        System.out.println(count);

    }
}
