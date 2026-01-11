# Java Strings – Internals & Performance (Clean, Correct Notes)

These notes are **corrected, structured, and interview-ready**. All misconceptions are fixed. You can safely use this as your **primary reference**.

---

## 1. What is a String?

* A **String** in Java is a **sequence of characters**.
* In Java, `String` is a **class**, not a primitive.
* Strings are **immutable** — once created, their content **cannot be changed**.

```java
String s = "Hello";
```

---

## 2. Why Strings Are Immutable

Immutability means:

* The **content of a String object cannot be modified** after creation.

### Reasons Java made Strings immutable:

1. **String Constant Pool (SCP) reuse**
2. **Thread safety** (no synchronization needed)
3. **Security** (passwords, URLs, class loading)
4. **Hash-based collections safety** (`HashMap`, `HashSet`)

> If Strings were mutable, SCP, HashMap keys, and multi-threaded safety would break.

---

## 3. String Constant Pool (SCP)

### Definition

* SCP is a **special memory structure inside the Heap** (Java 7+).
* It stores:

  * String **literals**
  * Strings added using `.intern()`

### Key Properties

* Duplicate values are **not recreated** in SCP
* Multiple references can point to **one shared String object**
* Improves **memory efficiency** and **performance**

---

## 4. Where Strings Are Stored

| Creation Method | Memory Location    |
| --------------- | ------------------ |
| String literal  | SCP (inside Heap)  |
| `new String()`  | Heap (outside SCP) |
| `.intern()`     | SCP                |

---

## 5. String Creation Examples

### Literal Creation

```java
String a = "Yash";
String b = "Yash";
```

* Only **one object** created in SCP
* `a` and `b` point to the **same object**

```java
a == b      // true
a.equals(b) // true
```

---

### Using `new` Keyword

```java
String a = new String("Yash");
String b = new String("Yash");
```

* Two **different objects** in Heap

```java
a == b      // false
a.equals(b) // true
```

---

## 6. `==` vs `equals()`

| Operator / Method | Checks                     |
| ----------------- | -------------------------- |
| `==`              | Reference (memory address) |
| `equals()`        | Content (characters)       |

### Important Rule

> **Always use `equals()` for String comparison**

`String` overrides `equals()` from `Object` class to compare **content**, not memory.

---

## 7. `intern()` Method

### What `intern()` Does

* Checks SCP for the same content
* If found → returns SCP reference
* If not found → adds to SCP and returns reference

```java
String b = new String("Java");
String c = b.intern();
```

* `b` → Heap
* `c` → SCP

---

## 8. `hashCode()` in Strings

### Important Facts

* `String` **overrides `hashCode()`**
* Hash code is calculated from **characters**, not memory

### Rule (Object Contract)

> If `a.equals(b)` is true → `a.hashCode() == b.hashCode()` must be true

```java
String a = "yash";
String b = new String("yash");

// true
System.out.println(a.hashCode() == b.hashCode());
```

---

## 9. String Concatenation

### Compile-Time Concatenation (FAST)

```java
String s = "Hello" + "World";
```

* Happens at **compile time**
* Stored in SCP
* Only **one object** created

---

### Runtime Concatenation (SLOW)

```java
String s = "Hello";
s = s + "World";
```

Internally converted to:

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append("World");
s = sb.toString();
```

* Creates **new object**
* Old object becomes **eligible for GC**

---

### Loop Concatenation (VERY BAD)

```java
String s = "";
for(int i = 0; i < 10000; i++) {
    s = s + i;
}
```

* Creates **new object every iteration**
* Copies old data repeatedly
* Time Complexity: **O(n²)**
* Causes memory waste and GC pressure

---

## 10. Why Unused Objects Are Created

* Strings are immutable
* Cannot modify existing object
* JVM must create a **new object**
* Old object loses reference
* Becomes **eligible for Garbage Collection**

---

## 11. StringBuilder (Solution)

### Why StringBuilder Exists

* StringBuilder is **mutable**
* Same object is modified
* No unnecessary object creation

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append("World");
String result = sb.toString();
```

---

## 12. String vs StringBuilder

| Feature     | String          | StringBuilder    |
| ----------- | --------------- | ---------------- |
| Mutability  | ❌ Immutable     | ✅ Mutable        |
| Thread-safe | ✅ Yes           | ❌ No             |
| Performance | ❌ Slow in loops | ✅ Fast           |
| Memory      | ❌ High usage    | ✅ Efficient      |
| Use case    | Constants, keys | Dynamic building |

---

## 13. `toString()` Behavior

* `println()` internally calls `toString()`
* `String` overrides `toString()` to return itself

```java
System.out.println("Hello"); // already String
```

---

## 14. NullPointerException (NPE)

### When NPE Occurs

* When a method or field is accessed on a `null` reference

```java
String s = null;
s.length(); // NPE
```

### Prevention

```java
if(s != null) {
    s.length();
}
```

---

## 15. Final Summary (Must Remember)

* Strings are **immutable**
* SCP avoids duplicate literals
* `==` compares references
* `equals()` compares content
* `hashCode()` depends on content
* Runtime concatenation creates new objects
* Loop concatenation is **O(n²)**
* Use `StringBuilder` for performance

---

## Interview One-Liner

> Repeated String concatenation creates multiple immutable objects causing performance overhead; StringBuilder solves this by modifying a single mutable object.

---

**End of Notes**
