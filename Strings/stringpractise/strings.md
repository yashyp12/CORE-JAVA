# Strings - Collection of Sequence of Characters

- Strings are immutable in Java
- String objects are stored inside the heap - String Pool

---

## **STRING POOL**

- String pool is a part of heap memory, it's a separate memory structure inside the heap
- Similar types of values are not recreated inside the String Pool
- Makes code optimized
- We cannot change the object in the String Pool, because strings are immutable for security reasons
- String Pool is in the method area in the heap memory
- The new objects of string are not stored in String Pool
- String Pool only contains the literals and the `.intern()` strings
- The string literal is automatically added to the pool when class is loaded (main) 
- Each entry in the String Pool is internally stored in a hash table (newer JVM: it's a String Table)
- String Pool exists for performance and memory optimization
- Compiler-time concatenation goes to pool
- `new String()` never uses the pool
- `intern()` can force heap strings into the pool

---

## **How the String Pool (SCP) Works**

The String Constant Pool is a special area within the Java Heap memory where the JVM stores String literals efficiently. It follows the principle of interning:

**Efficiency**: When you use a String literal, the JVM first checks the pool to see if a String with that exact value already exists.

**Reuse**:
- If it exists, the JVM simply reuses the existing object's reference
- If it doesn't exist, a new object is created in the pool

**Result**: This saves memory because multiple variables can point to the same String object if they have the same value.

--- 

## **String Comparison**

- `==` is used to compare the value and references in the heap memory
- Checks whether the references are pointing to the same object in the heap
- If we create a different object using `new` keyword, it will point to a separate object in the heap
- Example: `String a = new String("Yash");`
- But this creates this value outside the String Pool in the heap

---

## **String Representation**

- Whatever we write in the `println()` is printing String only
- It calls `toString()` internally for every type, or checks whether it's null or not

---

## **NullPointer Exception**

A `NullPointerException` (NPE) is one of the most common and frustrating runtime errors in Java. It happens when your program tries to use an object reference that currently points to nothing (`null`), as if it were a valid, existing object.

**When Does It Occur?**

The `NullPointerException` occurs the moment you try to perform an operation on a variable that is `null`. You are trying to ask for a method or a field from an object that isn't there.

**How to Prevent NullPointerExceptions**

The key to preventing an NPE is always to check if a reference is `null` before trying to use it.

---

## **Concatenation in Strings**

```java
// When an integer is concatenated in the string, it's converted
// into its wrapper class Integer that will call toString()
System.out.println("a" + 1);
```

- The `+` operator in Java is only defined for primitives and for any one of its value is String
- Below entire thing is an expression:

```java
// It will throw an error because
// the + operator in Java is only defined for primitives and
// for any one of its value is String below entire thing is expression
// System.out.println(new Integer(15) + new ArrayList<>());
```

- We can use `+` with any objects, but any one has to be String
- Entire result will be of String type

---
## **String Performance**

- Whenever we concatenate, every time a new object is created
- It every time creates a new object and copies the old one to the new one and discards reference from the old one
- This creates lots of unused objects with nothing pointing to them
- This causes time complexity of **O(N²)**

---

## **Solution: String Builder**

We need a datatype which allows us to modify the value of a string without creating a new object.

---

## **StringBuilder**

The `StringBuilder` class is used when you need to perform many modifications to a string of characters efficiently. It is the direct opposite of the immutable `String` class.

### **1. The Core Purpose: Mutability**

- The main reason `StringBuilder` exists is that it is **mutable**
- **Mutable**: You can change its contents and length without creating a new object in memory every time
- **Efficiency**: This makes `StringBuilder` much faster and more memory-efficient than performing repeated operations on a standard `String` object

---

### **4. Key Methods and How They Work**

Instead of the `+` operator used for strings, `StringBuilder` uses methods that modify the object in place.

| Method       | Example                              | Description                                                                                           |
|--------------|--------------------------------------|-------------------------------------------------------------------------------------------------------|
| `append()`   | `sb.append(" World");`               | Adds text to the end                                                                                  |
| `insert()`   | `sb.insert(5, " Java");`             | Inserts text at a specific index                                                                      |
| `delete()`   | `sb.delete(0, 5);`                   | Removes characters within a range (start index is inclusive, end is exclusive)                        |
| `reverse()`  | `sb.reverse();`                      | Reverses the entire sequence of characters                                                            |
| `toString()` | `String finalText = sb.toString();`  | Converts the builder back into a standard (immutable) String object                                   |

### **Example in Action**

```java
StringBuilder sb = new StringBuilder("Start");
sb.append(" Middle");   // sb is now "Start Middle"
sb.insert(5, " and");   // sb is now "Start and Middle"
sb.delete(0, 5);        // sb is now "and Middle"
String result = sb.toString(); // Converts to standard String "and Middle"
```

**Note:**
- `StringBuilder` directly inherits from the `Object` class
- Both `String` and `StringBuilder` ultimately inherit from the fundamental `Object` class (the root of all Java classes)

---

## **Methods in Strings**

---

## **Regular Expressions (Regex)**

Regular Expressions (Regex) in Java are a powerful tool used for pattern matching and text manipulation. They are essentially a specialized mini-language used to define search patterns.

In Java, you primarily use the `Pattern` and `Matcher` classes from the `java.util.regex` package to work with Regex.

---

## **toString() Method**

The `String` class overrides the `equals()` method from the `Object` class. It does not check memory — it checks whether the sequence of characters inside both strings is the same.

---

## **Understanding String Comparison: `==` vs `.equals()`**

This is the **exact** confusion that almost everyone has when learning Java strings. Let's clear it once and for all — no shortcuts, no tricks, just logic.

---

### **💡 The Root of Confusion**

You know that:

```java
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2);      // true
System.out.println(s1.equals(s2)); // true
```

Both are true here — so people think `==` and `.equals()` are the same.

But then:

```java
String s3 = new String("Hello");
String s4 = new String("Hello");
System.out.println(s3 == s4);      // false
System.out.println(s3.equals(s4)); // true
```

Now suddenly `==` gives `false` but `.equals()` gives `true`. Let's explain **why** this happens.

---

### **🧩 Step 1: What `==` Does**

`==` checks **whether both variables refer to the exact same memory address** (same object).

---

### **🧩 Step 2: What `equals()` Does for Strings**

The `String` class **overrides** the `equals()` method from the `Object` class.
It does **not** check memory — it checks whether the *sequence of characters* inside both strings is the same.

Here’s roughly how it’s implemented inside Java’s String class:

```java
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj instanceof String) {
        String other = (String) obj;
        return this.value.equals(other.value); // compares characters
    }
    return false;
}
```

So `equals()` checks **content**, not **reference**.

---

### **💥 Step 3: Why `==` Sometimes Works for Strings**

Because of **String Constant Pool**.

#### When you write:

```java
String s1 = "Hello";
String s2 = "Hello";
```

→ Java stores `"Hello"` only once in a special memory area called the **String Constant Pool (SCP)**.
Both `s1` and `s2` point to that same literal.

So:

```java
s1 == s2 → true  (same address)
s1.equals(s2) → true (same characters)
```

---

#### But when you use `new`:

```java
String s3 = new String("Hello");
String s4 = new String("Hello");
```

→ Each `new` creates a new object in **heap memory**, not in the pool.
They both contain the same text, but live in different memory locations.

So:

```java
s3 == s4 → false  (different objects)
s3.equals(s4) → true (same text)
```

---

### **🔍 Step 4: So What's the Rule?**

| Comparison Type | Checks                              | When True                                 | Best Used For                            |
| --------------- | ----------------------------------- | ----------------------------------------- | ---------------------------------------- |
| `==`            | Reference equality (memory address) | When both references point to same object | Primitives, object identity              |
| `equals()`      | Content equality                    | When text/data is same                    | Strings, wrapper classes, custom classes |

---

### **🧠 In Short (Write This in Notes)**

- `==` → checks **object reference** (same memory or not)
- `.equals()` → checks **string content** (same characters or not)
- String literals are stored in **String Constant Pool**, so `==` *might* return true if both refer to same literal
- But with `new String()`, `==` will always be false (different objects)
- Always use `.equals()` when comparing string **values**

---

### ✅ Quick Example Summary

```java
String s1 = "Boss";
String s2 = "Boss";
String s3 = new String("Boss");

System.out.println(s1 == s2);      // true  → both point to same literal in SCP
System.out.println(s1.equals(s2)); // true  → same content

System.out.println(s1 == s3);      // false → s3 is in heap
System.out.println(s1.equals(s3)); // true  → same content
```
 
