package Polymorphism.RuntimePoly;

public class ObjectPirint {
    int num;

    public ObjectPirint(int num) {
        this.num = num;
    }

//   @Override
//   public String toString(){
//       return "objeprint";
//   }
    public static void main(String[] args) {

        ObjectPirint obj = new ObjectPirint(54);
//        by default calling the object class toString method
        System.out.println(obj);
    }
}
