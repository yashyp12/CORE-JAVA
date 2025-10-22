### -interface
- _An interface in Java is a blueprint for a class, defining a contract of required behavior. It is not a class itself, and you cannot create an object from an interface. A class that uses an interface must provide a specific implementation for all the methods declared in that interface._
- 
- we can achieve multiple inheritance using interface
- Interfaces contains abstract functions , like a class only not completely
by default functions are public and abstratc in the interface, variables are static and by final by default in interfaces
- specifies wht class is doing not about how is doing 
- Think of an interface as a “contract” or blueprint for classes.

It only tells what to do, not how to do it.

- Interface Rules (very important)

All methods in an interface are public and abstract by default.

All variables in an interface are public, static, final (constants).

You cannot create an object of an interface.

A class must implement all abstract methods of an interface, else mark it abstract.

A class can implement multiple interfaces:

class SmartTV implements Remote, Bluetooth { }


An interface can extend another interface (yes, extends, not implements).

- variables in interface are final and static
because it does not have any constructor to initialise that one so
- abstract can provide the implementation of an interface 
but interface cannot provide the implementation of abstract class
-  java interface can be implement usign implements keyword
- in abstract class we use extend keywords
- we can implement multiple interface together 
- interface can extend **another java interface** 
- accesbility members of java interface are public by default
- abstract can have all types of access modifiers
- class can implement more than one interfaces
- class can inherit only single inheritance class

