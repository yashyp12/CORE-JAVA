# methods of arraylist


Perfect bhai 👊 — this is exactly how top learners build a solid Java foundation —
**clear, clean, well-structured notes** you can revise daily.

Here’s your **complete `ArrayList` notes in Markdown format**, ready to drop straight into your `.md` notes file (you can use in VS Code, Notion, Obsidian, etc.).

It’s clean, covers **all major methods**, their purpose, syntax, and example — in the simplest way possible.

---

# 📘 **ArrayList in Java — Complete Notes**

---

## 🧩 **Definition**

`ArrayList` is a **resizable array** that allows storing elements dynamically.
It’s part of the **Collection Framework** and implements the `List` interface.

---

## ⚙️ **Key Features**

* Dynamic in size (grows or shrinks automatically)
* Maintains insertion order
* Allows duplicate elements
* Allows `null` values
* Provides random access via index
* Not synchronized (not thread-safe)

---

## 📦 **Class Declaration**

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
```

---

## 🧠 **Constructors**

| Constructor                            | Description                                               |
| -------------------------------------- | --------------------------------------------------------- |
| `ArrayList()`                          | Creates an empty list with default capacity (10).         |
| `ArrayList(int initialCapacity)`       | Creates list with a specific capacity.                    |
| `ArrayList(Collection<? extends E> c)` | Creates list by copying elements from another collection. |

---

## 🧩 **Commonly Used Methods**

---

### 1. `add(E e)`

Adds an element at the end of the list.

```java
list.add("Java");
```

---

### 2. `add(int index, E element)`

Inserts an element at a specific position.

```java
list.add(1, "Python");
```

---

### 3. `addAll(Collection<? extends E> c)`

Adds all elements of another collection.

```java
list.addAll(otherList);
```

---

### 4. `get(int index)`

Returns the element at a specific index.

```java
String name = list.get(0);
```

---

### 5. `set(int index, E element)`

Replaces the element at a specific index.

```java
list.set(2, "C++");
```

---

### 6. `remove(int index)`

Removes element at given index.

```java
list.remove(1);
```

---

### 7. `remove(Object o)`

Removes first occurrence of the object.

```java
list.remove("Python");
```

---

### 8. `removeAll(Collection<?> c)`

Removes all elements that are also in another collection.

```java
list.removeAll(anotherList);
```

---

### 9. `clear()`

Removes all elements from the list.

```java
list.clear();
```

---

### 10. `size()`

Returns the total number of elements.

```java
int count = list.size();
```

---

### 11. `isEmpty()`

Checks if the list is empty.

```java
if (list.isEmpty()) { ... }
```

---

### 12. `contains(Object o)`

Checks if the list contains a particular element.

```java
if (list.contains("Java")) { ... }
```

---

### 13. `indexOf(Object o)`

Returns the first index of the element, or -1 if not found.

```java
int index = list.indexOf("C++");
```

---

### 14. `lastIndexOf(Object o)`

Returns the last index of the element.

```java
int index = list.lastIndexOf("Java");
```

---

### 15. `clone()`

Creates a shallow copy of the list.

```java
ArrayList<String> copy = (ArrayList<String>) list.clone();
```

---

### 16. `toArray()`

Converts the list into an `Object[]` array.

```java
Object[] arr = list.toArray();
```

---

### 17. `toArray(T[] a)`

Converts list into a typed array.

```java
String[] arr = list.toArray(new String[0]);
```

---

### 18. `subList(int fromIndex, int toIndex)`

Returns a part of the list (view).

```java
List<String> part = list.subList(1, 3);
```

---

### 19. `ensureCapacity(int minCapacity)`

Increases internal capacity if needed.

```java
list.ensureCapacity(20);
```

---

### 20. `trimToSize()`

Shrinks internal array size to match list size.

```java
list.trimToSize();
```

---

### 21. `retainAll(Collection<?> c)`

Keeps only common elements in both lists.

```java
list.retainAll(anotherList);
```

---

### 22. `removeIf(Predicate<? super E> filter)` *(Java 8+)*

Removes elements that match the condition.

```java
list.removeIf(n -> n.length() < 3);
```

---

### 23. `forEach(Consumer<? super E> action)` *(Java 8+)*

Performs an action for each element.

```java
list.forEach(System.out::println);
```

---

### 24. `iterator()`

Returns an iterator to loop through elements.

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

### 25. `listIterator()`

Returns a bidirectional iterator.

```java
ListIterator<String> it = list.listIterator();
while (it.hasNext()) System.out.println(it.next());
while (it.hasPrevious()) System.out.println(it.previous());
```

---

### 26. `sort(Comparator<? super E> c)` *(Java 8+)*

Sorts the list using a custom comparator.

```java
list.sort(Comparator.naturalOrder());
```

---

### 27. `Collections.sort(List<T> list)`

Sorts the list in ascending order.

```java
Collections.sort(list);
```

---

### 28. `Collections.reverse(List<T> list)`

Reverses the order of elements.

```java
Collections.reverse(list);
```

---

### 29. `Collections.shuffle(List<T> list)`

Randomly shuffles the list elements.

```java
Collections.shuffle(list);
```

---

### 30. `Collections.frequency(Collection<?> c, Object o)`

Counts how many times an element appears.

```java
int freq = Collections.frequency(list, "Java");
```

---

## 🧠 **ArrayList Important Points**

* Access elements → O(1)
* Insert/remove in middle → O(n) (because of shifting)
* Implements **RandomAccess**, **Cloneable**, **Serializable**
* **Not synchronized** — for thread safety use `CopyOnWriteArrayList` or `Collections.synchronizedList(list)`
* Allows **duplicates** and **nulls**

---

## 🧩 **Example Summary**

```java
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");

        System.out.println("Original List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'Python'? " + list.contains("Python"));

        list.remove("C++");
        System.out.println("After remove: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
```

**Output:**

```
Original List: [Java, Python, C++, Java]
Size: 4
Contains 'Python'? true
After remove: [Java, Python, Java]
Sorted List: [Java, Java, Python]
Reversed List: [Python, Java, Java]
```

---

## 💬 **In Short**

| Action          | Method                                        |
| --------------- | --------------------------------------------- |
| Add elements    | `add()`, `addAll()`                           |
| Access elements | `get()`, `set()`                              |
| Remove elements | `remove()`, `clear()`                         |
| Check status    | `size()`, `isEmpty()`, `contains()`           |
| Convert         | `toArray()`, `clone()`                        |
| Compare         | `retainAll()`, `removeAll()`                  |
| Sort/Reverse    | `Collections.sort()`, `Collections.reverse()` |
| Iterate         | `iterator()`, `listIterator()`, `forEach()`   |

---

### 🧩 **Recommended Practice**

* Create your own `ArrayList` programs for:

  * Sorting names
  * Removing duplicates
  * Merging two lists
  * Reversing elements manually
  * Counting word frequency

---

Would you like me to make the **next one (LinkedList)** in the same clean `.md` format next so you can continue the Collection series smoothly?


