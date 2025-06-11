public class implicit {
     /*  implicit in java , -> data type of smaller range is automatically
        this is known as widening 
     */

     public static void main(String[] args) {
         int varone = 24;
         float vartwo =  2.5f;
         double varthree = 2.652d;

        //  this will be okay because we trying to add an small datatype tot he bigger one
        // its a widenign which is implicit done by the compiler  
        // double varx = varthree; 

        // but in vice verca its show the error , if we try to convert an bigger one tot he smaller datatype (its a explicit narrowing)
        // float varx = varthree;




         System.out.println(varone);
         System.out.println(vartwo);
         System.out.println(varthree);
        
     }


}
