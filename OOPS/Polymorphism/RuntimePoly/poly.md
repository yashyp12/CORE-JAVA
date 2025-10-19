2 - Runtime polymorphism / dynamic polymorphism

achived by method overriding

- overiding when a child class has method name and param same as parent class just a body is diff
- overriding means - the type of ref is parent class and object is of child class 
- Upcasting - Parent obj = new Child();
 - object type define which one to run
 - ref type define which one to acccess


how java determines this - 
using the dynamic method dyspatch - 
just a mechanism in which a call to an overrriden method is resolved at runtime rather at compile time - 

when the program iss running java will determine which particular method to run


Downcasting only works if the object was originally of the child class.
Just writing (Suresh) doesn’t magically change the object type — it only tells the compiler what you claim it is.


We can use final keyworrd to prevent overridding
- because method is declared as final
- provides perfromance enhaccnements
- compiler will know this method will not going to overridden
if we maek a class final implicitly makes its methods fina ltoo

- Static methods as such we cannot override it ,
- sattic method can be inherited btu cannot overridden
- because main class one always calls does not depend on the object