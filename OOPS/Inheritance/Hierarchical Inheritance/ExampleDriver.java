//
//import java.util.*;
//
//class UserCollection {
//
//    int[] arr;
//    int indx = 0;
//
//    public UserCollection(int length) {
//        arr = new int[length];
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public int size() {
//        return indx;
//    }
//
//    public String displayCollection() {
//        if (size() == 0) {
//            return "Empty";
//        }
//        String op = "";
//        for (int i = 0; i <= size() - 1; i++) {
//            op += arr[i] + " ";
//        }
//        return op;
//    }
//
//}
//
//class UserStack extends UserCollection {
//
//    public UserStack(int length) {
//        super(length);
//    }
//
//    public void push(int element){
//        arr[indx] = element;
//        indx ++;
//    }
//
//    public int pop(){
//        int pop = arr[size()-1];
//        arr[size()-1] = 0;
//        indx--;
//        return pop;
//    }
//
//    public boolean isEmpty(){
//        return size()==0;
//    }
//
//    public int peek(){
//        return arr[size()-1];
//    }
//}
//
//class UserQueue extends UserCollection {
//
//}
//
//public class ExampleDriver {
//
//    public static void main(String[] args) {
//
//    }
//}
