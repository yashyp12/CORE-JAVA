package Interface.AnimalInterface;

public interface Animal {
//
   public static final int MAX_SIZE = 150;

   void eat();
   void sleep();

   public static void info(){
      System.out.println("this is animal interface");
   }

   /*
   the this keyword in a default interface method like run() does not refer to an object of the interface itself.
    It refers to an object of the concrete class that implements the interface.
    The default method is invoked on an object of that implementing class.


    */
   default void run(){
      //its allow here but not allow in the static methods
      this.eat();
      System.out.println("animal is running");
   }
}
