package Interface.extendDemo;

  interface B extends A{

   void greet();

   public default void demo1(){
       System.out.println("i am fro b");
   }


}


