package Exceptions_Generics.Cloning;

import java.util.Arrays;

/* 
 * SHALLOW COPY - primitives will be copied as it 
 * for primtives its creating an nwe copy 
 * - 
 * but for non primitives it will point t the same object internally 
if w made any changes into one it will reflect to another one also
 */

public class Human implements Cloneable {
    int age;
    String name;

    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] { 3, 4, 5, 6 };
    }

    // we dont need to wite this one like this its faster
    // public Human(Human other) {
    // this.age = other.age;
    // this.name = other.name;

    // }

    // overide the clone method fom the object class
    // @Override
    // // this is shallowCopy
    // public Object clone() throws CloneNotSupportedException {
    // // this is shallow copy
    // return super.clone();
    // }

    // overide the clone method fom the object class
    @Override
    // this is DeepCopy - it created a new copy 
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human) super.clone(); // this is shallow copy

        // deep Copy 0- just copying the entire array of this the new array
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}

class Main {

    // thethrows means something in this function that throws an exception
    public static void main(String[] args) throws CloneNotSupportedException {
        Human yash = new Human(34, "Yash");
        // Human twin = new Human(yash);

        // clone actually copy all the values from one obj to anothe obj
        Human twin = (Human) yash.clone();

        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));

        // the original copy is also changed this is a shallow copy by default
        System.out.println(Arrays.toString(yash.arr));
        // now when w did the deepc cop the original yash is not changes just a twin is
        // changes

    }
}
