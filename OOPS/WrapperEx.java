public class WrapperEx {
    public static void main(String[] args) {
      
    //   how can we createa n primitves using new 
    //here an intger isa clas and num is an obj
        // int a =10;
        // int b =20;
        Integer num = 45;
        Integer a = 10;
        Integer b= 20;


        //it is not going to swap becuase everythign in java in 
        //primitves call by value only ,its onyl swappin inside the function only
      swap(a,b); 
      System.out.println(a + " " + b);
    // when we passed the obj th refernce value is passed


    // final int bonus = 2;
    
    }


    //this is not going to swap the original val because the Integer is an final class
   static void swap(Integer a,Integer b){
        int temp = a;
        a = b;
        b = temp;

    }
}


class A{
    final int num = 23;
    
}