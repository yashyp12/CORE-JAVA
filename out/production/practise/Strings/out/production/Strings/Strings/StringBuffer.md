 
 
# StringBuffer in Java

## 1. Overview
- `StringBuffer` is a **mutable** sequence of characters.
- Unlike `String`, which is **immutable**, `StringBuffer` objects can be **modified** after creation.
- Belongs to the `java.lang` package.

---


## Advantages
1 - mutable - we can add obj without creating new one
2 - more efficient - 
3 - thread safe - 
in java multiple threadsa (process) are works in java on same data 
- when thread 1 working on data it is prevent any other thread to wroking on this data
- that makes it slower
- BY DEFAULT ITS CAPASITY IS 16 but its dynamic doubles as per formula when grows

## dIFF between string buffer and builder 
- string builder is not thread safe
- if we working on single theead usee builder



## Constructor in String BuffER 
    //CONSTURCTOR 1
        StringBuffer sb = new StringBuffer();
        sb.append("dem44444444444444444444444o");
        // intial capacity of buffer is 16 but after adding data
        // it has formula (capacity*2) +2   - so it becoesmes 34
        System.out.println(sb.capacity());

//        constructor no 2
        StringBuffer sb2 = new StringBuffer("Yash Patil");

//        constructor no 3  - we can specify the capasity there
        StringBuffer sb3 = new StringBuffer(30);

## 2. Why StringBuffer?
- Every time you modify a `String`, a **new object** is created in memory.
- This is **inefficient** when you perform multiple modifications (e.g., concatenation in loops).
- `StringBuffer` avoids that — it changes the existing object instead of creating a new one.
- It is **synchronized**, meaning it is **thread-safe** (safe for multi-threaded environments).

---

## 3. Syntax
```java
StringBuffer sb = new StringBuffer();            // default capacity 16
StringBuffer sb2 = new StringBuffer("Boss");     // initialized with "Boss"
StringBuffer sb3 = new StringBuffer(50);         // custom capacity
````

---

## 4. Important Methods

| Method                                  | Description                    | Example                      |
| --------------------------------------- | ------------------------------ | ---------------------------- |
| `append(String s)`                      | Adds text to the end           | `sb.append("Java")`          |
| `insert(int offset, String s)`          | Inserts text at given index    | `sb.insert(2, "Hi")`         |
| `replace(int start, int end, String s)` | Replaces characters in range   | `sb.replace(1,3,"AA")`       |
| `delete(int start, int end)`            | Deletes characters in range    | `sb.delete(0,2)`             |
| `reverse()`                             | Reverses the characters        | `sb.reverse()`               |
| `length()`                              | Returns current length         | `sb.length()`                |
| `capacity()`                            | Returns total buffer capacity  | `sb.capacity()`              |
| `charAt(int index)`                     | Returns character at position  | `sb.charAt(2)`               |
| `setCharAt(int index, char ch)`         | Modifies character at position | `sb.setCharAt(0,'B')`        |
| `toString()`                            | Converts to `String`           | `String str = sb.toString()` |

---

## 5. Capacity and Growth

* Default capacity = **16** characters.
* When capacity exceeds, it grows as:

  ```
  new capacity = (old capacity * 2) + 2
  ```
* Example:

  ```java
  StringBuffer sb = new StringBuffer();
  System.out.println(sb.capacity()); // 16
  sb.append("abcdefghijklmnopqr");   // exceeds 16
  System.out.println(sb.capacity()); // (16*2)+2 = 34
  ```

---

## 6. String vs StringBuffer vs StringBuilder

| Feature       | String                | StringBuffer                  | StringBuilder                |
| ------------- | --------------------- | ----------------------------- | ---------------------------- |
| Mutability    | Immutable             | Mutable                       | Mutable                      |
| Thread Safety | Safe                  | Safe (synchronized)           | Not safe                     |
| Performance   | Slow                  | Slower (due to sync)          | Fast                         |
| Package       | `java.lang`           | `java.lang`                   | `java.lang`                  |
| Use Case      | When data is constant | When used by multiple threads | When used by a single thread |

---

## 7. Example Program

```java
public class Example {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        System.out.println(sb); // output: dlroW,iH
    }
}
```

---

## 8. Key Notes

* **Thread-safe:** Multiple threads can safely access the same `StringBuffer` object.
* **Slightly slower** than `StringBuilder` due to synchronization overhead.
* **Not part of the String Pool** — each object is created in the **Heap**.
* **Converts easily to String** using `.toString()`.

---

## 9. When to Use

* Use **`String`** → when text content never changes.
* Use **`StringBuffer`** → when string is modified frequently *and* thread safety matters.
* Use **`StringBuilder`** → when string is modified frequently *and* only one thread is used.

---

## 10. Interview Highlights

* **Mutable class**: Changes the existing object.
* **Capacity formula**: `(oldCapacity * 2) + 2`
* **Synchronized** (safe for multi-threading).
* Introduced in **JDK 1.0**.
* Can be converted to `String` using `.toString()`.

---
 Exactly. `StringBuffer` is **dynamic**, just like `ArrayList`.

When you first create it:

```java
StringBuffer sb = new StringBuffer();
```

its **default capacity** = 16 characters (that’s internal storage).

Now, when you append something longer than 16 characters, JVM silently expands that buffer:

```
new capacity = (old capacity * 2) + 2
```

Example:

 
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity()); // 16
sb.append("abcdefghijklmnopqr");   // 18 characters, exceeds 16
System.out.println(sb.capacity()); // (16 * 2) + 2 = 34
 

So yes — it behaves dynamically like `ArrayList`, but instead of holding *objects*, it holds *characters*.
Key difference: `ArrayList` doubles roughly every 50%–100% of capacity, while `StringBuffer` uses this precise formula `(old * 2) + 2`.

When the buffer grows, a **new larger char[]** is created internally, the old data is copied there, and the reference still points to the same object (no new `StringBuffer` instance).


