public class BasicIncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        a++; // 1
        System.out.println("a++ = " + a);

        int b = 2;
        ++b; // 2
        System.out.println("++b = " + b);

        int c = 3;
        c--; // 3
        System.out.println("c-- = " + c);

        int d = 4;
        --d; // 4
        System.out.println("--d = " + d);

        int e = 5;
        int f = e++; // 5
        System.out.println("f = e++ → f = " + f + ", e = " + e);

        int g = 6;
        int h = ++g; // 6
        System.out.println("h = ++g → h = " + h + ", g = " + g);

        int x = 10;
        System.out.println("Before x++: " + x); // 7
        x++;
        System.out.println("After x++: " + x);

        int y = 15;
        y--;
        System.out.println("y-- = " + y); // 8

        int m = 3;
        System.out.println("Using ++ in print: " + ++m); // 9

        int n = 7;
        System.out.println("Using n++ in print: " + n++); // 10
        System.out.println("After print, n: " + n);

        int k = 0;
        k = ++k + k++; // 11
        System.out.println("k = " + k);

        int u = 2;
        int v = u++ + ++u; // 12
        System.out.println("u++ + ++u = " + v);

        int z = 5;
        int res = z-- - --z; // 13
        System.out.println("z-- - --z = " + res);

        int w = 10;
        System.out.println("Before reset: " + w);
        w = w++ + w-- - w; // 14
        System.out.println("After reset expression: " + w);

        // 15: Boolean loop
        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Loop count: " + count);
            count++;
            if (count == 3) flag = false;
        }
    }
}
 

Jul 13 - 2:15 pm
public class ExpressionsAndLoops {
    public static void main(String[] args) {
        int a = 5;
        int res1 = a++ + ++a; // 1
        System.out.println("res1: " + res1);

        a = 5;
        int res2 = --a + a--; // 2
        System.out.println("res2: " + res2);

        for (int i = 0; i < 3; i++) { // 3
            System.out.println("Loop i: " + i);
        }

        for (int i = 0; i < 3;) {
            System.out.println("Pre-increment i: " + ++i); // 4
        }

        int counter = 3;
        while (counter-- > 0) { // 5
            System.out.println("Countdown: " + counter);
        }

        int x = 1;
        int y = x++ + x++ + ++x; // 6
        System.out.println("y = " + y);

        int val = 3;
        System.out.println("val++: " + val++); // 7
        System.out.println("Now val: " + val);

        int p = 4;
        int q = ++p + --p + p++; // 8
        System.out.println("q = " + q);

        int i = 10;
        int j = (i++ > 10) ? ++i : --i; // 9
        System.out.println("Ternary result j = " + j);

        int n = 0;
        while (n++ < 2) { // 10
            System.out.println("n = " + n);
        }

        int z = 5;
        z += ++z + z--; // 11
        System.out.println("z = " + z);

        int r = 2;
        r = r++ + r++ + r; // 12
        System.out.println("r = " + r);

        int s = 1;
        int t = ++s + s++ + --s; // 13
        System.out.println("t = " + t);

        // 14: Boolean while loop
        boolean active = true;
        int loop = 0;
        while (active) {
            System.out.println("active loop " + loop++);
            if (loop == 3) active = false;
        }

        // 15: Combined
        int combo = 1;
        combo = ++combo + combo++ + combo--; // 15
        System.out.println("combo = " + combo);
    }
}
 

Jul 13 - 2:16 pm
public class AdvancedIncrement {
    public static void main(String[] args) {
        int i = 1;
        int result = i++ + i++ + ++i + --i + i-- + i++; // 1
        System.out.println("Tricky result: " + result);

        int x = 5;
        System.out.println("addOne(x++): " + addOne(x++)); // 2

        int a = 3;
        int b = (a++ > 2) ? ++a : --a; // 3
        System.out.println("b = " + b);

        a = 0;
        a = ++a + a++; // 4
        System.out.println("a = " + a);

        print(++a); // 5

        int m = 2;
        int n = m++ * --m + ++m; // 6
        System.out.println("n = " + n);

        int z = 10;
        z = z++ + z++ + --z + ++z; // 7
        System.out.println("z = " + z);

        int p = 5;
        int q = --p + p++ + ++p + p--; // 8
        System.out.println("q = " + q);

        int temp = 1;
        temp = temp++ + ++temp + temp-- + --temp; // 9
        System.out.println("temp = " + temp);

        int value = 100;
        value += ++value + value++; // 10
        System.out.println("value = " + value);

        int flag = 0;
        if (flag++ == 0) { // 11
            System.out.println("Condition true with flag = " + flag);
        }

        // 12: Multiple flags
        int f1 = 1, f2 = 2, f3;
        f3 = ++f1 + f2-- + f1++; // 12
        System.out.println("f3 = " + f3);

        // 13: Chain assignment
        int r = 1;
        r = r++ + r++ + ++r; // 13
        System.out.println("r = " + r);

        // 14: Compound + ternary
        int val = 4;
        int output = (val++ > 3) ? ++val : val--; // 14
        System.out.println("output = " + output);

        // 15: Boolean loop
        boolean loop = true;
        int loopVar = 0;
        while (loop) {
            System.out.println("LoopVar: " + loopVar++);
            if (loopVar == 3) loop = false;
        }
    }

    public static int addOne(int x) {
        return x + 1;
    }

    public static void print(int val) {
        System.out.println("Printed: " + val);
    }
}