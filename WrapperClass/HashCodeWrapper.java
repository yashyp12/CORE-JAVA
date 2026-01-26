public class HashCodeWrapper {

    static void main(String[] args) {


        //👉 hashCode() is derived directly from the stored value.
        // hashcode of the wrapper classes are always its data
        Integer a = 10;
        Integer b = 10;

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
