Alright bhai — let’s make it *crystal clear*, no fancy words, just logic.

---

## 💡 **Comparable — Simple Definition**

**Comparable** is an **interface** in Java that is used to define the **default (natural) sorting order** for the objects of a class.

It tells **how one object should be compared with another object of the same type.**

---

### 🧠 **Why It Is Used**

When you store **custom objects** (like `Student`, `Employee`, `Book`) in a list or array,
Java doesn’t know **how to sort them** — by ID? by name? by salary?

So, if you want your class to be **sortable naturally**,
you make it **implement `Comparable`** and define the comparison logic inside the class.

---

### ✅ **Example**

```java
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Defines how to compare two Student objects
    public int compareTo(Student s) {
        return this.id - s.id; // Sort by ID (ascending)
    }
}
```

Now Java knows how to sort it:

```java
Collections.sort(listOfStudents);
```

---

### 🔹 **In one line:**

> **Comparable** = used to define the *natural (default)* way to compare and sort objects of a class.

---

Would you like me to now explain the same way for **Comparator** (what it is and why it’s used)?


Comparable is used for single sorting of objects
Comparator is used for multiple sorting of objects