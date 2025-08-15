
import java.lang.reflect.Array;

public class demo2 {

    public static void main(String[] args) {

        int[] arr = {20, 30, 40};
        System.out.println("before main" + Array.toString(arr));
        arr[3] = 400;

        m1(arr);
        System.out.println("main" + arr);
        System.out.println("after main " + Array.toString(arr));

    }

    static void m1(int[] arr1) {

    }
}
