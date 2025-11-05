
## 🌳 What is the **Java Collection Framework (JCF)?**

The **Java Collection Framework** is a **set of classes and interfaces** that help you store and manage **groups of objects** easily.

👉 Think of it like a **toolbox** full of different containers:
Each container (class) stores data differently depending on your needs (ordered, unique, sorted, etc.).


## 🧩 Structure of the Collection Framework

At the top level, JCF has **interfaces** and **classes**.
Let’s see the big picture first:

```
Iterable
  └── Collection
        ├── List
        ├── Set
        └── Queue
  (Map is separate but part of framework)
```

---

## 🧱 1. Iterable (root interface)

Every collection in Java can be **looped through** (using `for-each` or an iterator).
That’s because they all extend the **Iterable** interface.

---
## 📦 2. Collection Interface

This is the **base interface** for most data structures.
It defines common methods like:

* `add()`
* `remove()`
* `size()`
* `clear()`
* `contains()`
* `iterator()`

## 🧰 3. Subinterfaces of Collection

### 🔹 **List** — Ordered, Allows Duplicates

* Keeps elements in order (by index)
* You can access elements by their index
* Duplicates allowed

**Common Classes:**

* `ArrayList` → Fast for reading, slower for adding/removing in middle
* `LinkedList` → Fast for inserting/removing, slower for random access
* `Vector` (old, not much used)

**Example:**

```java
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // duplicate allowed
System.out.println(fruits); // [Apple, Banana, Apple]
```

### 🔹 **Set** — Unordered, No Duplicates

* Does **not** allow duplicates
* No index (you can’t say `get(0)`)

**Common Classes:**

* `HashSet` → No order, fastest
* `LinkedHashSet` → Keeps insertion order
* `TreeSet` → Sorted order (ascending)

**Example:**

```java
Set<String> names = new HashSet<>();
names.add("John");
names.add("Mary");
names.add("John"); // duplicate ignored
System.out.println(names); // [John, Mary]
```

### 🔹 **Queue** — Follows FIFO (First In, First Out)

* Used when you need to process elements in a specific order
* Add to the **end**, remove from the **front**

**Common Classes:**

* `LinkedList` (also implements Queue)
* `PriorityQueue` (orders elements by priority)

**Example:**
```java
Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
q.add(30);
System.out.println(q.remove()); // removes 10 (first element)
```

## 💡 4. Map Interface (not under Collection but part of JCF)

* Stores data as **key–value pairs**
* Each key is **unique**, but values can repeat

**Common Classes:**

* `HashMap` → Unordered
* `LinkedHashMap` → Keeps insertion order
* `TreeMap` → Sorted by key

**Example:**
```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "B");
map.put(1, "C"); // replaces old value for key 1
System.out.println(map); // {1=C, 2=B}
```
## ⚙️ 5. Utility Classes

Java also provides helper classes:
* **Collections** (note the ‘s’) → contains static methods like:

  * `Collections.sort(list)`
  * `Collections.reverse(list)`
  * `Collections.max(list)`
  * `Collections.min(list)`

## 🧠 Summary Diagram
```
Iterable
 └── Collection
       ├── List
       │     ├── ArrayList
       │     ├── LinkedList
       │     └── Vector
       │
       ├── Set
       │     ├── HashSet
       │     ├── LinkedHashSet
       │     └── TreeSet
       │
       └── Queue
             ├── PriorityQueue
             └── LinkedList

 Map (separate)
   ├── HashMap
   ├── LinkedHashMap
   └── TreeMap
```

## 🧾 Why Use the Collection Framework?

✅ Saves time — built-in data structures
✅ Reusable — same methods for all collections
✅ Flexible — you can switch between different implementations easily
✅ Powerful — supports sorting, searching, iteration, etc.

 