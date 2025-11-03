package Exceptions_Generics.lamdaFunction;

import java.util.ArrayList;

public class LambdaFunc {
//    lamda functions are one line functions

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        arr.forEach((item) -> System.out.print(item * 2));


//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;

        LambdaFunc myCalculator = new LambdaFunc();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, prod));

    }


    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}


interface Operation {
    int operation(int a, int b);
}