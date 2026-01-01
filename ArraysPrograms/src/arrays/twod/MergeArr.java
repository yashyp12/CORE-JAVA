package arrays.twod;

public class MergeArr {

//    merging the 2d array

    static void main(String[] args) {

        char[][]arr ={{'a','b','c'},{'d','e','f'}};

        int size = 0;

        for(char[]ele:arr){
            for(int ele1:ele){
                size+=arr.length;
            }
        }
    }
}
