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

* All methods in an interface are public and abstract by default.

* All variables in an interface are public, static, final (constants).

* You cannot create an object of an interface.

* A class must implement all abstract methods of an interface, else mark it abstract.

* A class can implement multiple interfaces:

* class SmartTV implements Remote, Bluetooth { }


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

- in the interface two diff class which are not related to each other can implement same interface thsi solves the problem of hierarchy in inheritance


- dynamic lookup of method at runtime it has little bit of overhead like 
 compare to normal method invocation in java thats why we need to careful
 not to use interface gradually in performance critical code because it happens at runtime


[
* _he interfaces are resolved at runtime means they executes on runtime becasue we gives them implementation after implementing that one so thats why or it contains multiple methods so while running during the execution runtime jvm uses lookup to find that correcct method compatible which can take little while delay in performance so it is not recommend to use it in highly performance critical task right - static methods are called directly and they are relatively fast so thats why they are recommended_]
 
## **The role of interfaces**

- our statement that "interfaces are resolved at runtime means they execute on runtime because we give them implementation after implementing that one" is mostly correct. The key point is that the specific, concrete implementation to be executed is not known until the program is running. 

- **Compile time:** The compiler knows that a method call will occur on a variable of an interface type (e.g., Vehicle v). It knows a method with the name start() exists on the Vehicle interface, but it does not know which class (e.g., Car or Boat) will provide the actual implementation.

**Runtime:** During execution, when the v.start() method is called, the Java Virtual Machine (JVM) performs a "lookup" to determine the actual object's type stored in the variable v. This lookup is called dynamic method dispatch.

**Method execution:** Once the JVM knows the actual object is a Car, it executes the start() method from the Car class. 
Performance implications
You are correct that this runtime lookup carries a slight performance overhead compared to a direct, hardcoded method call (static dispatch). 

**Static methods:** These are known at compile time and are faster because the method call is "hardcoded" to a specific memory address. They do not involve dynamic dispatch. Static methods are faster for two reasons:

There is no object instance (this reference) to pass.
The method is resolved directly at compile time.

**Interfaces:** The lookup for the correct method at runtime adds a small amount of extra work for the JVM. For this reason, interfaces are generally not recommended in highly performance-critical code, such as the tightest loops of a gaming engine or high-frequency trading application, where every nanosecond counts. 




  **Advantages of Using Interfaces**
* Interfaces are fundamental to good Java design for several reasons:
* 
* Achieving Total Abstraction: They define a contract for behavior without any implementation details (before Java 8's default methods).
* 
* Enabling Multiple Inheritance of Type: A class can "inherit" method declarations from multiple sources.
* 
* Promoting Loose Coupling: Classes can depend on the interface "contract" rather than on other concrete classes. This makes your code more flexible. For example, two unrelated classes (like Car and Boat) can both implement the Vehicle interface, solving problems of rigid class hierarchies.
* 
* Defining Contracts: Interfaces guarantee that any implementing class will have the required methods, ensuring consistent behavior.
* 
* Supporting Polymorphism: You can treat objects of different classes uniformly if they implement the same interface. (e.g., Vehicle myVehicle = new Car(); or Vehicle myVehicle = new Boat();).
* 
* Facilitating Dependency Injection: Interfaces are essential for frameworks (like Spring) that inject dependencies, allowing you to easily swap implementations.
* 
* Improving Code Reusability: You can create reusable blueprints for functionality that different classes can implement.
* 
* Runtime Performance (Dynamic Method Dispatch)
* You are correct to be curious about performance. The specific implementation of an interface method is resolved at runtime, not compile time.
* 
* Compile Time: The compiler sees you calling a method on an interface variable (e.g., myVehicle.start()). It knows the start() method exists on the Vehicle interface, but it doesn't know which class (Car or Boat) will provide the implementation.
* 
* Runtime: When the code runs, the Java Virtual Machine (JVM) looks up the actual object's type stored in the myVehicle variable. This process is called dynamic method dispatch.
* 
* Execution: The JVM then executes the start() method from the correct class (e.g., the Car's implementation).
  
* Performance Implications
* Overhead: This runtime lookup has a very slight performance overhead compared to a static method call, which is resolved at compile time (static dispatch). Static methods are faster because the call is "hardcoded" to a specific memory address and doesn't require this runtime lookup.
* 
* When It Matters: This overhead is extremely small and is not a concern for 99% of applications. However, in highly performance-critical code where every nanosecond counts (like a high-frequency trading application or the core loop of a gaming engine), developers might avoid interfaces in those specific tight loops.




#INTERFACE

* Before Java 8 Abstract: All methods were implicitly public abstract and could not have a method body. Any class that implemented the interface was required to provide a concrete implementation for every method. 

## * ⚙️ **Before Java 8**

In old-school Java (before Java 8), an interface was pure abstraction —
it could only declare things, not define them.

| Feature          | Before Java 8                    | Java 8 | Java 9+ |
| ---------------- | -------------------------------- | ------ | ------- |
| Abstract Methods | ✅                                | ✅      | ✅       |
| Static Variables | ✅ (always `public static final`) | ✅      | ✅       |
| Default Methods  | ❌                                | ✅      | ✅       |
| Static Methods   | ❌                                | ✅      | ✅       |
| Private Methods  | ❌                                | ❌      | ✅       |
| Constructor      | ❌                                | ❌      | ❌       |

-- here the default means But after Java 8, default method means a method in interface that has its own implementation.”

Perfect bro 💯 — you actually got **90% correct**, just a few tiny tweaks needed, and then I’ll give you your clean **“notes version”** ready to paste in your notebook.

Let’s fix your understanding **step by step** 👇

---
 
 

#### 🔹 Interface in Java

**Definition:**
An interface in Java is a blueprint of a class that defines a **set of abstract methods** (rules) that implementing classes must follow.

---

#### 🔹 Features (Version-Wise)

| Java Version      | Features                                                        | Example                   |
| ----------------- | --------------------------------------------------------------- | ------------------------- |
| **Before Java 8** | Only `public abstract` methods, `public static final` variables | `void show();`            |
| **Java 8**        | Added `default` and `static` methods (with body)                | `default void run(){}`    |
| **Java 9**        | Added `private` & `private static` methods                      | `private void helper(){}` |

---

#### 🔹 Rules

1. Cannot create an object of interface.
2. All methods are `public` by default.
3. All variables are `public static final` (constants).
4. A class uses the `implements` keyword to use an interface.
5. A class must implement **all abstract methods** of the interface.

---

#### 🔹 Advantages

* ✅ Promotes **code reusability**
* ✅ Provides **loose coupling** between classes
* ✅ Supports **multiple inheritance** (a class can implement multiple interfaces)
* ✅ Increases **flexibility and scalability**

---

#### 🔹 Quick Example

```java
interface Vehicle {
    int wheels = 4; // public static final

    void start(); // public abstract

    default void fuel() {
        System.out.println("Uses petrol");
    }

    static void company() {
        System.out.println("Made by Honda");
    }
}

class Car implements Vehicle {
    public void start() { // overriding abstract method
        System.out.println("Car started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();   // "Car started"
        c.fuel();    // "Uses petrol"
        Vehicle.company(); // "Made by Honda"
    }
}
```
 