# ABSTRACTION 
- 
parent class gives the nature of the method jsut giving definition of it it does not gives implementation , 

- abstract void career(String name);
- child class must override them
- any class that contains one or more abstract methods must also be declared as abstract
- ex - cars - every single class has engine so parent class will contains abstract class
- cannot create object of an abstract class
- we cannot create abstract constructors
- abstratc class can have constructors since we cant instanciate it usig new keyword
- its constructor is called when an instance of a concrete subclass is created.

-  we cannot create abstract static methods - 
- No ,since static are not get overridden so
- because abstract methods needs to be overridden

Can we create static methods in abstract classses 
Yes - 

abstract class contains normaml methods 
Yes - 

- we cannot use final behind abstract class becuase it prevents from being inherited

Perfect 👌 bro, here’s a **clean, note-ready explanation** of the **abstract class in Java** — formatted like how you’d write in your handwritten notes or digital notes. It covers **definition, rules, examples, and key points** — exactly the way you’ll need it for interviews + exams.

---

# 🧠 **Abstract Class in Java**

---

## 🔹 **Definition:**

An **abstract class** in Java is a class that is declared using the `abstract` keyword.
It serves as a **blueprint** for other classes and **cannot be instantiated** directly.
It may contain **abstract methods (without implementation)** as well as **concrete methods (with body)**.

```java
abstract class ClassName {
    // abstract method (no body)
    abstract void methodName();

    // concrete method (with body)
    void display() {
        System.out.println("This is a concrete method");
    }
}
```

---

## 🔹 **Key Points / Rules of Abstract Class:**

### 1. **Cannot be instantiated**

* You **cannot create an object** of an abstract class directly.
* It is meant to be **inherited** by subclasses.

```java
abstract class Animal {}
Animal a = new Animal(); // ❌ Error
```

---

### 2. **Can contain both abstract and non-abstract methods**

* Abstract methods → declared without a body (`;`)
* Concrete methods → have a full implementation (`{ }`)

```java
abstract class Shape {
    abstract void draw(); // abstract method
    void info() {         // concrete method
        System.out.println("This is a shape");
    }
}
```

---

### 3. **If a class has even one abstract method, it must be declared abstract**

Otherwise, the compiler will throw an error.

```java
// ❌ Invalid
class Shape {
    abstract void draw(); // Error: class must be abstract
}
```

---

### 4. **Subclasses must implement all abstract methods**

* A subclass that extends an abstract class **must override** all its abstract methods.
* If it doesn’t, the subclass must also be declared `abstract`.

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() { // must implement
        System.out.println("Dog barks");
    }
}
```

---

### 5. **Abstract classes can have constructors**

* Even though you can’t create an abstract class object directly,
  **its constructor runs** when a subclass object is created.

```java
abstract class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car constructor called");
    }
}

class Main {
    public static void main(String[] args) {
        new Car();
    }
}
```

**Output:**

```
Vehicle constructor called
Car constructor called
```

---

### 6. **Can have instance variables and static methods**

* Abstract classes can define variables and static methods like normal classes.

```java
abstract class Demo {
    int x = 10;
    static void show() {
        System.out.println("Static method in abstract class");
    }
}
```

---

### 7. **Use `extends` keyword to inherit**

* Subclasses extend abstract classes using the `extends` keyword.

```java
class Circle extends Shape { }
```

---

### 8. **Can have access modifiers**

* Abstract classes and methods can use public, protected, or default access modifiers.
* But **cannot be private**, as private members can’t be inherited.

---

### 9. **Cannot be declared as final**

* `final` prevents inheritance, while `abstract` requires inheritance — so both can’t coexist.

```java
final abstract class Demo {} // ❌ Invalid
```

---

### 10. **Can implement interfaces**

* Abstract classes can **implement** one or more interfaces and **may or may not** provide implementations for their methods.

```java
interface A {
    void show();
}

abstract class B implements A {
    // may or may not implement show()
}
```

---

## 🔹 **Why Use Abstract Classes? (Real Use)**

* To achieve **partial abstraction** (some methods abstract, some concrete).
* To provide a **common base class** for multiple subclasses.
* To enforce a **standard behavior** but still allow flexibility for subclass-specific implementation.

---

## 🔹 **Example:**

```java
abstract class Shape {
    abstract void draw(); // must be implemented by subclass

    void message() {
        System.out.println("Drawing shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape s = new Shape(); ❌ Error
        Shape s = new Circle(); // ✅ allowed (polymorphism)
        s.message();
        s.draw();
    }
}
```

**Output:**

```
Drawing shape...
Drawing Circle
```

---

## 🔹 **Summary Table:**

| Feature                   | Abstract Class                                   |
| ------------------------- | ------------------------------------------------ |
| Keyword used              | `abstract`                                       |
| Object creation           | ❌ Not allowed                                    |
| Can have abstract methods | ✅ Yes                                            |
| Can have normal methods   | ✅ Yes                                            |
| Can have constructors     | ✅ Yes                                            |
| Can have variables        | ✅ Yes                                            |
| Can have static methods   | ✅ Yes                                            |
| Access modifier allowed   | ✅ (public, protected, default)                   |
| Must use                  | `extends`                                        |
| Can implement interfaces  | ✅ Yes                                            |
| Can be final              | ❌ No                                             |
| Purpose                   | To provide a base class with partial abstraction |
 
