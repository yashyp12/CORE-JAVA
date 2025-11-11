package ObjectClass;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }



    @Override
    public int hashCode() {
        return num;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.num == ((ObjectDemo) obj).num;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    public static void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(25);
//        ObjectDemo obj1 = obj;
        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());
//        ObjectDemo obj1 = new ObjectDemo(37);
//        System.out.println(obj1 );

//        hashcode is jsut shows the unqiueness of the object


        ObjectDemo obj2 = new ObjectDemo(25);

        // == checkign whether thsi two one are poining to the same ref  or not
//        if (obj == obj2) {
//            System.out.println("obj1 is equal to obj2");
//        } else {
//            System.out.println("not equals");
//        }

// .equals are checking the content of the object
//        if (obj.equals(obj2)) {
//            System.out.println("obj1 is equal to obj2");
//        } else {
//            System.out.println("not equals");
//        }



//get class
        System.out.println(obj.getClass());
//        System.out.println(obj instanceof ObjectDemo);


    }

}
