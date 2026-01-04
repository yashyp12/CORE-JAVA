public class Boxing {

    static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        Integer integer = a; // autobocing
        System.out.println(integer);
        Integer integer2 = Integer.valueOf(a); // inetanally
//        System.out.println(integer2);

        String b = "10";
        Byte byte1 = Byte.valueOf(b); // returns the wrapper object
//        System.out.println(byte1);


//        autounboxing - wrapper -> primitve
        Integer i = 10;
        int x = i; // autounboxing
        int y = i.intValue(); // inteanlly

//         Integer caching (-128 - 127)
        Integer p = 127;
        Integer r = 127;
        System.out.println(p==r); // integer caching
//        System.out.println(p.equals(r)); // caching
        /*
        Java caches Integer objects from -128 to 127
        --  wrapper classes store this data inside the scp
        - if we try to compare them its comparing referncce
        - if it exeeds -128 127 - will be stored in form of object inside heap
        not in scp and refernces will be diff
        - we can comapre them using equals ()
- Same object reused
         */

        int k = Integer.parseInt("10"); // returns primtive




    }
}
