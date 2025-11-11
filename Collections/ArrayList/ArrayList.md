# 🧩 **ArrayList in Java**

## 🔹 **Definition**

`ArrayList` is a **resizable (dynamic) array** implementation of the `List` interface in Java.
It allows **duplicate elements**, maintains **insertion order**, and provides **random access** to elements using indexes.

It is part of the **`java.util`** package and is one of the most commonly used classes in the Java Collections Framework.

---

## 🔹 **Declaration**

```java
ArrayList<Type> list = new ArrayList<>();
```

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();
```

---

## 🔹 **Internal Working**

* Internally uses a **dynamic array** to store elements.
* **Default capacity:** 10 (when the first element is added).
* When the array becomes full, it **increases capacity by 50%** (oldCapacity + oldCapacity/2).
* Elements are stored in a **contiguous memory** (like a normal array).
* Accessing elements by index is **O(1)** (constant time).
* Insertion/removal in the middle of the list can be **slow (O(n))** because elements need shifting.

---

## 🔹 **Important Points**

| Property                  | Description                                           |
| ------------------------- | ----------------------------------------------------- |
| Package                   | `java.util`                                           |
| Implements                | `List`, `RandomAccess`, `Cloneable`, `Serializable`   |
| Duplicates allowed        | ✅ Yes                                                 |
| Maintains insertion order | ✅ Yes                                                 |
| Thread-safe               | ❌ No (Use `Collections.synchronizedList()` if needed) |
| Null elements             | ✅ Allowed                                             |
| Grows dynamically         | ✅ Automatically resizes                               |
| Type of data              | Objects only (use wrapper classes for primitives)     |

---

## 🔹 **Common Constructors**

| Constructor               | Description                                   |
| ------------------------- | --------------------------------------------- |
| `ArrayList()`             | Creates empty list with default capacity (10) |
| `ArrayList(int capacity)` | Creates list with custom initial capacity     |
| `ArrayList(Collection c)` | Creates list from another collection          |

Example:

```java
ArrayList<Integer> list = new ArrayList<>(20);
```

---

## 🔹 **Common Methods**

| Method                  | Description                                   |
| ----------------------- | --------------------------------------------- |
| `add(E e)`              | Adds element at end                           |
| `add(int index, E e)`   | Inserts element at index                      |
| `get(int index)`        | Returns element at index                      |
| `set(int index, E e)`   | Replaces element at index                     |
| `remove(int index)`     | Removes element at index                      |
| `remove(Object o)`      | Removes first occurrence of specified element |
| `size()`                | Returns number of elements                    |
| `clear()`               | Removes all elements                          |
| `isEmpty()`             | Checks if list is empty                       |
| `contains(Object o)`    | Checks if element exists                      |
| `indexOf(Object o)`     | Returns index of first occurrence             |
| `lastIndexOf(Object o)` | Returns index of last occurrence              |
| `toArray()`             | Converts list to array                        |
| `sort(Comparator c)`    | Sorts list based on comparator                |

---

## 🔹 **Example**

```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicates allowed

        System.out.println(fruits); // [Apple, Banana, Orange, Apple]

        fruits.remove("Banana");
        System.out.println(fruits); // [Apple, Orange, Apple]

        System.out.println(fruits.get(1)); // Orange

        fruits.set(1, "Mango");
        System.out.println(fruits); // [Apple, Mango, Apple]

        Collections.sort(fruits);
        System.out.println(fruits); // [Apple, Apple, Mango]
    }
}
```

---

## 🔹 **Time Complexity (Big O)**

| Operation         | Complexity     | Description                   |
| ----------------- | -------------- | ----------------------------- |
| Access (get/set)  | O(1)           | Constant time (index-based)   |
| Add (end)         | O(1) amortized | Increases capacity if needed  |
| Add (middle)      | O(n)           | Requires shifting elements    |
| Remove (by index) | O(n)           | Shifts elements after removal |
| Search            | O(n)           | Linear search                 |

---

## 🔹 **Advantages**

* ✅ Fast random access using index (like an array)
* ✅ Automatically resizes
* ✅ Easy to iterate using for-each or iterator
* ✅ Supports generic type (type-safe)
* ✅ Rich utility methods (sort, shuffle, reverse)

---

## 🔹 **Disadvantages**

* ❌ Slower insertion/deletion in middle (due to shifting)
* ❌ Consumes more memory than arrays
* ❌ Not synchronized (not thread-safe)
* ❌ Only holds objects (not primitives directly)

---

## 🔹 **When to Use ArrayList**

| Situation                                  | Use ArrayList?                           |
| ------------------------------------------ | ---------------------------------------- |
| You need fast random access                | ✅ Yes                                    |
| You frequently insert/delete in the middle | ❌ No (Use LinkedList instead)            |
| You need to maintain order                 | ✅ Yes                                    |
| You need duplicates                        | ✅ Yes                                    |
| You need thread safety                     | ❌ Use `CopyOnWriteArrayList` or `Vector` |

---

## 🔹 **ArrayList vs LinkedList**

| Feature                | ArrayList     | LinkedList                   |
| ---------------------- | ------------- | ---------------------------- |
| Storage                | Dynamic array | Doubly linked list           |
| Access speed           | Fast (O(1))   | Slow (O(n))                  |
| Insert/Delete (middle) | Slow (O(n))   | Fast (O(1))                  |
| Memory                 | Less          | More (extra node references) |
| Random access          | Supported     | Not supported                |
| Use case               | Read-heavy    | Insert/delete-heavy          |

---

## 🔹 **Thread Safety**

`ArrayList` is **not synchronized**.
If multiple threads modify it at the same time → **ConcurrentModificationException** may occur.

To make it thread-safe:

```java
List<Integer> safeList = Collections.synchronizedList(new ArrayList<>());
```

or use:

```java
CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
```

---

## 🔹 **Summary Notes**

| Property               | ArrayList                                           |
| ---------------------- | --------------------------------------------------- |
| Implements             | `List`, `RandomAccess`, `Cloneable`, `Serializable` |
| Allows duplicates      | ✅ Yes                                               |
| Maintains order        | ✅ Yes                                               |
| Allows nulls           | ✅ Yes                                               |
| Synchronized           | ❌ No                                                |
| Grows dynamically      | ✅ Yes                                               |
| Access time            | O(1)                                                |
| Insert/Delete (middle) | O(n)                                                |
| Internal structure     | Dynamic array                                       |

---

 
| Feature                        | `Arrays.asList()`                      | `List.of()`                              |
| ------------------------------ | -------------------------------------- | ---------------------------------------- |
| Available Since                | Java 1.2                               | Java 9                                   |
| Mutability                     | Fixed-size but elements can be changed | Fully immutable (cannot change anything) |
| Add/Remove                     | ❌ Not allowed                          | ❌ Not allowed                            |
| Modify existing elements (set) | ✅ Allowed                              | ❌ Not allowed                            |
| Backed by Array                | ✅ Yes                                  | ❌ No (it’s its own list)                 |
| Allows `null`                  | ✅ Yes                                  | ❌ No (throws `NullPointerException`)     |
| Syntax                         | `Arrays.asList("A", "B", "C")`         | `List.of("A", "B", "C")`                 |

