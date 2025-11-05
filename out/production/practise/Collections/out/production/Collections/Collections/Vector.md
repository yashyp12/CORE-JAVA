
## 🧩 What is a `Vector` in Java?

A **Vector** is a **class** in Java that implements the **`List` interface**,
just like `ArrayList` and `LinkedList`.

📦 It is part of the **Java Collection Framework**, and it stores **a list of elements in order**, allowing **duplicates**.

---

## 🧱 Basic Definition

```java
Vector<E>
```

* `E` = type of element (like `Integer`, `String`, etc.)
* It is a **dynamic array**, meaning its size grows automatically when needed.

Example:

```java
Vector<Integer> v = new Vector<>();
v.add(10);
v.add(20);
System.out.println(v); // [10, 20]
```

---

## ⚙️ Key Points About `Vector`

| Feature                        | Description                                         |
| ------------------------------ | --------------------------------------------------- |
| **Implements**                 | `List`, `RandomAccess`, `Cloneable`, `Serializable` |
| **Package**                    | `java.util`                                         |
| **Allows duplicates**          | ✅ Yes                                               |
| **Maintains insertion order**  | ✅ Yes                                               |
| **Null elements allowed**      | ✅ Yes                                               |
| **Synchronized (Thread-safe)** | ✅ Yes — main difference from ArrayList              |
| **Growable**                   | ✅ Automatically increases size when full            |

---

## 🔒 Difference Between `ArrayList` and `Vector`

| Feature         | `ArrayList`                  | `Vector`                     |
| --------------- | ---------------------------- | ---------------------------- |
| Synchronization | ❌ Not synchronized           | ✅ Synchronized (thread-safe) |
| Performance     | 🚀 Faster (no sync overhead) | 🐢 Slower (because of sync)  |
| Growth Rate     | 50% of current size          | Doubles its size when full   |
| Introduced in   | Java 1.2 (modern)            | Java 1.0 (legacy class)      |

So nowadays, **`Vector` is rarely used**, because synchronization can be done in better ways.
But it still works perfectly fine and is part of legacy Java.

---

## 🧱 Class Hierarchy

```
List (interface)
   ↑
AbstractList (abstract class)
   ↑
Vector (class)
      ↑
     Stack (class)
```

So:

* `Vector` implements `List`
* `Stack` extends `Vector`

---

## 🧰 Common Constructors

```java
Vector()                     // Default capacity = 10
Vector(int initialCapacity)  // Set initial capacity
Vector(int size, int incr)   // Custom capacity and growth rate
Vector(Collection c)         // Create Vector21 from another collection
```

Example:

```java
Vector<String> names = new Vector<>(5); // initial capacity 5
```

---

## 🧩 Common Methods

| Method                | Description                               |
| --------------------- | ----------------------------------------- |
| `add(E e)`            | Adds an element                           |
| `add(int index, E e)` | Inserts at specific position              |
| `get(int index)`      | Returns element at index                  |
| `set(int index, E e)` | Replaces element                          |
| `remove(int index)`   | Removes element at index                  |
| `size()`              | Returns number of elements                |
| `capacity()`          | Returns internal capacity of vector       |
| `contains(Object o)`  | Checks if element exists                  |
| `clear()`             | Removes all elements                      |
| `firstElement()`      | Returns first element                     |
| `lastElement()`       | Returns last element                      |
| `elements()`          | Returns `Enumeration` (old iterator type) |

---

### 🧠 Example Program

```java
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector21: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        v.remove(2);
        System.out.println("After removal: " + v);

        v.add(2, 99);
        System.out.println("After insertion: " + v);

        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());
    }
}
```

**Output:**

```
Vector: [10, 20, 30, 40]
Size: 4
Capacity: 10
After removal: [10, 20, 40]
After insertion: [10, 20, 99, 40]
First Element: 10
Last Element: 40
```

---

## 🧠 In Summary

| Concept               | Explanation                                        |
| --------------------- | -------------------------------------------------- |
| **Vector**            | A dynamic array like `ArrayList`, but synchronized |
| **Implements**        | `List` interface                                   |
| **Allows duplicates** | Yes                                                |
| **Thread-safe**       | Yes                                                |
| **Used for**          | Legacy multi-threaded programs                     |
| **Extends**           | `AbstractList`                                     |
| **Parent of**         | `Stack`                                            |

---

💡 **Remember:**

* Use **`ArrayList`** for modern programs (faster, non-synchronized).
* Use **`Vector`** only if you specifically need a thread-safe list.