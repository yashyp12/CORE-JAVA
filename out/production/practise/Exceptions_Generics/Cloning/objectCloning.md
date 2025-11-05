
# 🧠 Java Cloneable Interface & Object Cloning — Full Notes

---

## 📘 What is Object Cloning?

**Object Cloning** means creating an **exact copy of an existing object** —  
same values (state), but **different memory reference**.

> 💡 In simple terms:  
> **Cloning = copy of object (same data, different memory).**

---

## 🧩 Why Do We Need Cloning?

Sometimes we already have an object fully initialized and want another one with the same data —  
but we don’t want to initialize all fields again manually.

✅ **Example:**  
Imagine a `Student` object with many fields — cloning saves time.

---

## ⚙️ Cloneable Interface

`Cloneable` is a **marker interface** (no methods inside it) in the `java.lang` package.

```java
public interface Cloneable { }
````

It tells the **JVM** that this class’s objects are allowed to be cloned.

> ⚠️ If a class does *not* implement `Cloneable` and you call `clone()` →
> `CloneNotSupportedException` will be thrown.

---

## 🧩 The `clone()` Method

Defined in class **Object** (the superclass of all classes):

```java
protected Object clone() throws CloneNotSupportedException
```

### 🧠 What it does:

* Creates a **new object**.
* Copies all **field values** from the original to the new one.
* Returns the **reference to the new object**.

---

## ✅ Steps to Perform Cloning

1️⃣ **Implement `Cloneable` interface**
2️⃣ **Override `clone()` method** (make it `public`)
3️⃣ **Call `clone()`** using the existing object

---

### 🔍 Example Code

```java
class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // override clone()
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Yash");
            Student s2 = (Student) s1.clone();  // cloning object

            System.out.println(s1.id + " " + s1.name);
            System.out.println(s2.id + " " + s2.name);
            System.out.println(s1 == s2); // false → different objects
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

### ⚡ Output

```
1 Yash
1 Yash
false
```

🧩 **Meaning:**
Same data, different object → ✅ **Clone Successful**

---

## 🧠 Why `clone()` Isn’t a Normal Method

* `clone()` is defined in the base `Object` class but is **protected**.
* You **cannot** call `someObject.clone()` directly unless you override it in your class.

### ✅ To Use Cloning in a Custom Class:

**Step A: Implement `Cloneable` Interface**

> A marker interface (no methods).
> It’s just a “permission slip” to JVM saying:
> *"It’s okay to clone objects of this class."*

If you skip this step → `CloneNotSupportedException`.

**Step B: Override the `clone()` Method**

Make it `public` so you can access it outside the class.

```java
public class Car implements Cloneable {
    String brand;
    int year;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}
```

---

## 🚗 Using the Clone Method

```java
public static void main(String[] args) {
    Car originalCar = new Car("Toyota", 2020);

    try {
        Car clonedCar = (Car) originalCar.clone(); // Copy made here

        System.out.println("Original Car Brand: " + originalCar.brand);
        System.out.println("Cloned Car Brand:   " + clonedCar.brand);
        System.out.println(originalCar == clonedCar); // false

    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
}
```

---

## 🧩 Shallow vs. Deep Copy

| Type                | Description                                                                             | Example Behavior                                              |
| ------------------- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| 🪞 **Shallow Copy** | Copies **top-level fields** only. Object references are copied, not the nested objects. | Modifying nested object in clone also changes it in original. |
| 🌊 **Deep Copy**    | Copies **entire object graph** — including nested mutable objects.                      | Modifications in clone don’t affect original.                 |

---

### 🪞 Example: Shallow Copy  shallowCopy.png
 
```java
class A {
    int a;
    B obj; // reference type
}
```

If `A` is cloned → new `A` object created,
but `obj` still points to the **same** `B` object.

---

### 🌊 Example: Deep Copy

```java
class Address implements Cloneable {
    String city;
    Address(String city){ this.city = city; }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    int id;
    Address addr;

    Student(int id, Address addr){ this.id = id; this.addr = addr; }

    public Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.addr = (Address) addr.clone();  // deep copy
        return s;
    }
}
```

---

## ⚙️ `clone()` vs Copy Constructor

| Feature                | `clone()`                    | Copy Constructor                       |
| ---------------------- | ---------------------------- | -------------------------------------- |
| **Method Type**        | From `Object` class          | Custom constructor                     |
| **Interface Required** | Yes (`Cloneable`)            | No                                     |
| **Shallow / Deep**     | Shallow by default           | Customizable                           |
| **Exception**          | `CloneNotSupportedException` | None                                   |
| **Control**            | Less flexible                | More control (preferred in real-world) |

---

## 🚫 When *Not* to Use Cloning

❌ When your class has complex reference chains
❌ When using frameworks like Spring / Jackson (they handle object creation)
✅ Prefer **Copy Constructors** for better readability and control

---

## 🔥 Common Interview Points

| Question                                                             | Answer                                        |
| -------------------------------------------------------------------- | --------------------------------------------- |
| ❓ What happens if we don’t implement `Cloneable` and call `clone()`? | `CloneNotSupportedException`                  |
| ❓ Is `clone()` shallow or deep by default?                           | Shallow                                       |
| ❓ Can we override `clone()`?                                         | Yes, usually public and calls `super.clone()` |
| ❓ Return type of `clone()`?                                          | `Object` (needs downcasting)                  |
| ❓ Why is `Cloneable` empty?                                          | It’s a marker interface                       |
| ❓ `clone()` belongs to which class?                                  | `java.lang.Object`                            |

---

## 🧩 Quick Recap Summary

| Keyword / Concept     | Meaning / Purpose                   |
| --------------------- | ----------------------------------- |
| **Cloneable**         | Marker interface – allows cloning   |
| **clone()**           | Creates and returns object copy     |
| **Default clone**     | Shallow copy                        |
| **Deep clone**        | Manual copy of nested objects       |
| **super.clone()**     | Actual copy logic from Object class |
| **Without Cloneable** | `CloneNotSupportedException`        |
| **Alternative**       | Use Copy Constructor                |

---

## 🎯 One-Liner for Interview

> “**Cloneable** is a marker interface that allows object duplication using the `clone()` method from the `Object` class.
> By default, it performs **shallow copying**. To make deep copies, we override `clone()` and manually clone reference fields.”

---

✨ *End of Notes* ✨

` 