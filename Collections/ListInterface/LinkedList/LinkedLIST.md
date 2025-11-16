# LinkedList

- accept null values 
- follow insertion order
- linked list faster than arraylist due to shifting
- 
- part of collection framework implements list inetrface
- store elemetns in double linekd list
- implementation class of list interface
- stores data at non contingous memory
- best insertion adn removal operations O(1)

- linked list is a linear data structure where each elemetn is a seperate object called node , 
each node contains two parts
- 1 - Data - value stored in ndoe
- 2 -Pointers - two pointers , one pointing to then next and other pointing previous node (previous)


# Performance Consideration 
1 - Insertion deletions - better due to does not requires shifting

2 - Random Access - linked list has slower random access comapre to arraylist 

3 - Memory overhead - requires more memory than arraylit because each node stores references of previous and next node

 
## 🧩 **Definition**

`LinkedList` is a **class in Java’s Collection Framework** that stores elements in a **doubly linked list** structure.
It can act as both a **List** and a **Queue** because it implements both interfaces:
`List`, `Deque`, `Cloneable`, and `Serializable`.

---

## ⚙️ **Class Declaration**

```java
public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
```

---

## 💡 **Key Points**

* Allows **duplicate elements** and **null values**
* **Maintains insertion order**
* **Dynamic in size** — no resizing like ArrayList
* **Efficient in insertion/deletion** (no shifting like ArrayList)
* **Slower in random access** (because traversal is sequential)
* Internally implemented using **Doubly Linked List**
* **Not synchronized** (not thread-safe)

---

## 🧠 **When to Use LinkedList**

| Situation                        | Use LinkedList                        |
| -------------------------------- | ------------------------------------- |
| Frequent insertions or deletions | ✅ Yes                                 |
| Frequent random access by index  | ❌ No (use ArrayList instead)          |
| Need a Queue/Deque behavior      | ✅ Yes                                 |
| Low memory overhead matters      | ❌ No (each node holds extra pointers) |

---

## 🧩 **Constructors**

| Constructor                             | Description                                                      |
| --------------------------------------- | ---------------------------------------------------------------- |
| `LinkedList()`                          | Creates an empty LinkedList                                      |
| `LinkedList(Collection<? extends E> c)` | Creates a LinkedList containing elements of the given collection |

---

## 🧰 **Important Methods**

### 🔹 **1. Add Elements**

| Method                | Description                          | Example                  |
| --------------------- | ------------------------------------ | ------------------------ |
| `add(E e)`            | Adds element at the end              | `list.add("A")`          |
| `add(int index, E e)` | Adds element at specified index      | `list.add(1, "B")`       |
| `addFirst(E e)`       | Adds element at the beginning        | `list.addFirst("Start")` |
| `addLast(E e)`        | Adds element at the end              | `list.addLast("End")`    |
| `offer(E e)`          | Adds element at the end (like queue) | `list.offer("X")`        |
| `offerFirst(E e)`     | Adds element at the beginning        | `list.offerFirst("Y")`   |
| `offerLast(E e)`      | Adds element at the end              | `list.offerLast("Z")`    |

---

### 🔹 **2. Access Elements**

| Method           | Description                           | Example            |
| ---------------- | ------------------------------------- | ------------------ |
| `get(int index)` | Returns element at index              | `list.get(2)`      |
| `getFirst()`     | Returns first element                 | `list.getFirst()`  |
| `getLast()`      | Returns last element                  | `list.getLast()`   |
| `peek()`         | Returns first element (null if empty) | `list.peek()`      |
| `peekFirst()`    | Returns first element                 | `list.peekFirst()` |
| `peekLast()`     | Returns last element                  | `list.peekLast()`  |

---

### 🔹 **3. Remove Elements**

| Method                       | Description                          | Example                              |
| ---------------------------- | ------------------------------------ | ------------------------------------ |
| `remove()`                   | Removes first element                | `list.remove()`                      |
| `remove(int index)`          | Removes element at index             | `list.remove(2)`                     |
| `remove(Object o)`           | Removes first occurrence of object   | `list.remove("A")`                   |
| `removeFirst()`              | Removes first element                | `list.removeFirst()`                 |
| `removeLast()`               | Removes last element                 | `list.removeLast()`                  |
| `poll()`                     | Removes and returns first element    | `list.poll()`                        |
| `pollFirst()`                | Removes and returns first            | `list.pollFirst()`                   |
| `pollLast()`                 | Removes and returns last             | `list.pollLast()`                    |
| `removeIf(Predicate filter)` | Removes element if condition matches | `list.removeIf(x -> x.length() < 3)` |

---

### 🔹 **4. Utility Methods**

| Method                  | Description                | Example                                                        |
| ----------------------- | -------------------------- | -------------------------------------------------------------- |
| `size()`                | Returns number of elements | `list.size()`                                                  |
| `isEmpty()`             | Checks if empty            | `list.isEmpty()`                                               |
| `clear()`               | Removes all elements       | `list.clear()`                                                 |
| `contains(Object o)`    | Checks if element exists   | `list.contains("A")`                                           |
| `indexOf(Object o)`     | Returns first index        | `list.indexOf("A")`                                            |
| `lastIndexOf(Object o)` | Returns last index         | `list.lastIndexOf("A")`                                        |
| `clone()`               | Creates shallow copy       | `LinkedList<String> copy = (LinkedList<String>) list.clone();` |

---

### 🔹 **5. Iteration**

| Method                 | Description            | Example                                    |
| ---------------------- | ---------------------- | ------------------------------------------ |
| `iterator()`           | Forward iteration      | `Iterator it = list.iterator();`           |
| `descendingIterator()` | Reverse iteration      | `Iterator it = list.descendingIterator();` |
| `listIterator()`       | Bidirectional iterator | `ListIterator it = list.listIterator();`   |
| `forEach()`            | Lambda-based loop      | `list.forEach(System.out::println);`       |

---

### 🔹 **6. Conversion**

| Method                      | Description        |
| --------------------------- | ------------------ |
| `toArray()`                 | Convert to array   |
| `Collections.sort(list)`    | Sort LinkedList    |
| `Collections.reverse(list)` | Reverse LinkedList |

---

## 🔁 **Difference Between ArrayList and LinkedList**

| Feature        | ArrayList            | LinkedList                       |
| -------------- | -------------------- | -------------------------------- |
| Data Structure | Dynamic Array        | Doubly Linked List               |
| Access time    | Fast (O(1))          | Slow (O(n))                      |
| Insert/Delete  | Slow (shifting)      | Fast (relinking nodes)           |
| Memory         | Compact              | Extra memory for pointers        |
| Random Access  | Supported            | Not supported                    |
| Implements     | List                 | List, Deque                      |
| Best Use       | When frequent access | When frequent insertion/deletion |

---

## 🧠 **Internal Working (Conceptually)**

Each node of LinkedList contains:

```
[prev] [data] [next]
```

* Every element (node) stores data and references to **previous** and **next** nodes.
* The first node’s `prev` is `null`, and the last node’s `next` is `null`.
* Java’s LinkedList automatically manages these links internally.

---

## 🧩 **Mini Example**

```java
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.addFirst("C");
        list.addLast("Python");
        list.add("C++");

        System.out.println("List: " + list);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("After removal: " + list);

        list.removeIf(lang -> lang.startsWith("C"));
        System.out.println("After removeIf: " + list);
    }
}
```

✅ **Output:**

```
List: [C, Java, Python, C++]
First: C
Last: C++
After removal: [Java, Python]
After removeIf: [Java, Python]
```

---

## 🧠 **Big Picture Summary**

| Concept           | Meaning            |
| ----------------- | ------------------ |
| Class             | `LinkedList`       |
| Type              | Doubly Linked List |
| Interfaces        | `List`, `Deque`    |
| Stores            | Objects            |
| Allows Duplicates | ✅ Yes              |
| Null Elements     | ✅ Yes              |
| Order Maintained  | ✅ Yes              |
| Thread Safe       | ❌ No               |

---

### 🧩 **In One Line:**

> **LinkedList** = A doubly linked list that can work as both a **List** and a **Queue**,
> offering **fast insertion/deletion** but **slow random access**.
 