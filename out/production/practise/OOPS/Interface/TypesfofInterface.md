 

## 🌟 1️⃣ What is an Interface (Quick Recall)

An **interface** is a **blueprint** that defines **methods (rules)** a class must follow — but doesn’t provide their implementation (except for `default`, `static`, or `private` ones).

---

## 🧩 2️⃣ Types of Interfaces in Java

There are mainly **5 types of interfaces** (based on purpose and usage):

---

### 🅐 **Marker Interface**

**Definition:**
An interface that has **no methods or fields** — completely empty.

**Purpose:**
Used to **mark** or **tag** a class to give it some special meaning to the JVM or framework.

**Example:**

```java
// Marker interface (no methods)
interface Serializable {}

// Implemented by a class
class Student implements Serializable {
    int id;
    String name;
}
```

**Examples in Java:**

* `Serializable`
* `Cloneable`
* `Remote`

📘 **Why used?**
Because JVM or other APIs check *if a class implements* that interface to decide how to treat it.

---

### 🅑 **Functional Interface (SAM Interface)**

**Definition:**
An interface that contains **exactly one abstract method**.
(Other default or static methods are allowed.)

**Purpose:**
Used in **lambda expressions** and **functional programming** (introduced in Java 8).

**Example:**

```java
@FunctionalInterface
interface Greeting {
    void sayHello(); // single abstract method
}

public class Demo {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello!");
        g.sayHello(); // prints: Hello!
    }
}
```

**Examples in Java:**

* `Runnable` → `run()`
* `Comparable` → `compareTo()`
* `ActionListener` → `actionPerformed()`

---

### 🅒 **Normal Interface (Regular Interface)**

**Definition:**
An interface with **more than one abstract method**.
This is the **standard type** of interface.

**Example:**

```java
interface Animal {
    void eat();
    void sleep();
}
```

**Purpose:**
To define **common behavior** that multiple classes must implement.

---

### 🅓 **Single Interface Implementation**

**Definition:**
A class implements **only one interface**.

**Example:**

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

**Used when:**
The class needs to follow one specific contract.

---

### 🅔 **Multiple Interface Implementation**

**Definition:**
A class implements **two or more interfaces**.

**Example:**

```java
interface A {
    void show();
}
interface B {
    void display();
}

class Demo implements A, B {
    public void show() { System.out.println("Show A"); }
    public void display() { System.out.println("Display B"); }
}
```

**Purpose:**
Used to achieve **multiple inheritance of type**, since Java doesn’t allow multiple class inheritance.

---

## 🧠 3️⃣ Bonus: Interface Inheritance

Just like classes, **one interface can extend another interface**:

```java
interface A {
    void show();
}
interface B extends A {
    void display();
}
```

**Class implementing B** must implement both `show()` and `display()`.

---

## ✅ Summary Table

| Type of Interface           | Description                          | Example                       |
| --------------------------- | ------------------------------------ | ----------------------------- |
| **Marker**                  | No methods — just a tag              | `Serializable`, `Cloneable`   |
| **Functional**              | One abstract method                  | `Runnable`, `Comparable`      |
| **Normal**                  | Two or more abstract methods         | `List`, `Set`                 |
| **Single Implementation**   | Class implements one interface       | `class Dog implements Animal` |
| **Multiple Implementation** | Class implements multiple interfaces | `class Demo implements A, B`  |

---

💡 **Remember:**

> An interface defines *what to do* — not *how to do it*.
> Classes provide the actual *implementation*.

---
 