# Strings - collection of sequence of characters

- strings are immutable in java
- strings objects are stored inside the heap - string pool 

### **STRING POOL -** 
- String pool is a part of heap memory , its a seperate memory structure inside the heap 
- similar types of values are not recreated inside the string pool
- makes code optimis
- we cannot change the object in the string pool ,because strings are immutable for the security reasons
- String pool are in the method area in the heap memory
- the new objects of string are not stored in string pool 
- string pool only contains the literals and the .intern strings 
- the string literal automatically added to the pool when class is loaded (main)
- each entry in the string pol is internally stored in hash table (newwr jvm its a string table)
- string pool is exists for the performance and memory optimisation
- compiler time concatenation goes to pool
- new String() never uses the pool
- intern() can force heap strings into the pool



### **How the String Pool (SCP) Works**

- The String Constant Pool is a special area within the Java Heap memory where the JVM stores String literals efficiently. It follows the principle of interning: 
**Efficiency**: When you use a String literal, the JVM first checks the pool to see if a String with that exact value already exists.
**Reuse**:
- If it exists, the JVM simply reuses the existing object's reference.
- If it doesn't exist, a new object is created in the pool.
**Result:** This saves memory because multiple variables can point to the same String object if they have the same value. 



- (==) is used to compare the value and  references in the heap memeory 
- check whethe the refernces are pointing to the same obj in the heap
- if w e create an diff obj using new keywrod it will point the sepearate obj in teh heap
- String a = new ("Yash);
- but this creates this val outside the string pool in the heap

- whatver we write in the whatever we are putting in println its prining string only .
- its call toString() internally for every type , or checking whter its null or not 

**- NullPointer exception** - A NullPointerException (NPE) is one of the most common and frustrating runtime errors in Java. It happens when your program tries to use an object reference that currently points to nothing (null), as if it were a valid, existing object

**When ?** 
The NullPointerException occurs the moment you try to perform an operation on a variable that is null. You are trying to ask for a method or a field from an object that isn't there. 

**3. How to Prevent NullPointerExceptions**
The key to preventing an NPE is always to check if a reference is null before trying to use it. 


- in java for every object java has a string representation of the object
- thats why if want to print something 
- 

**Concatenation in Strings** 
//        when an integer concatenated in the string its converted
        // into its wrapep clas Integer that will call toString()
        System.out.println("a" + 1);

- 
//        it will throw an error because
        // the + opearator in java only defined for primitves and
//         for any one of its value is String below entire thing is expression
//        System.out.println(new Integer(15) + new ArrayList<>());
//we can use + with any objects but any one has to be String entire result will be of String type


# String Performance 
 - whenever we cincatenate every time the new obj is created
 - it every time creates new obj and copies old one to new and discard reference from old one 
 - these create lots of unused obj with not pointng to anything 
 - this causes time complexity O(Nsquare)


# Solution for these  - 
- we need dataype which allows us to modify the val ofa string without creating an new object

# String Builder -
_The StringBuilder class is used when you need to perform many modifications to a string of characters efficiently. It is the direct opposite of the immutable String class._

**1. The Core Purpose: Mutability**

- The main reason StringBuilder exists is that it is mutable.
- **Mutable**: You can change its contents and length without creating a new object in memory every time.
- **Efficiency**: This makes StringBuilder much faster and more memory-efficient than performing repeated operations on a standard String object.


**4. Key Methods and How They Work**
Instead of the + operator used for strings, StringBuilder uses methods that modify the object in place.

**Method	Example	Description**
append()	sb.append(" World");	- Adds text to the end.
insert()	sb.insert(5, " Java");	- Inserts text at a specific index.
delete()	sb.delete(0, 5);	 - Removes characters within a range (start index is inclusive, end is exclusive).
reverse()	sb.reverse();	       - Reverses the entire sequence of characters.
toString()	String finalText = sb.toString();- Converts the builder back into a standard (immutable) String object.
Example in Action

`StringBuilder sb = new StringBuilder("Start");
sb.append(" Middle"); // sb is now "Start Middle"
sb.insert(5, " and");   // sb is now "Start and Middle"
sb.delete(0, 5);        // sb is now "and Middle"
String result = sb.toString(); // Converts to standard String "and Middle"

`
- StringBuilder directly inherits from the Object class.
- Both String and StringBuilder ultimately inherit from the fundamental Object class (the root of all Java classes).



# Methods in Strings
 - 


**Regex -** 
- Regular Expressions (Regex) in Java are a powerful tool used for pattern matching and text manipulation. They are essentially a specialized mini-language used to define search patterns.
 - sIn Java, you primarily use the Pattern and Matcher classes from the java.util.regex package to work with Regex.



## toString()
The String class overrides the equals() method from the Object class.
It does not check memory — it checks whether the sequence of characters inside both strings is the same.

Excellent — this is the **exact** confusion that almost everyone has when learning Java strings.
Let’s clear it once and for all — no shortcuts, no tricks, just logic.

---

## 💡 The Root of Confusion

You know that:

```java
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2);      // true
System.out.println(s1.equals(s2)); // true
```

Both are true here — so people think `"=="` and `"equals"` are the same.

But then:

```java
String s3 = new String("Hello");
String s4 = new String("Hello");
System.out.println(s3 == s4);      // false
System.out.println(s3.equals(s4)); // true
```

Now suddenly `"=="` gives `false` but `"equals"` gives `true`.
Let’s explain **why** this happens.

---

## 🧩 Step 1: What `"=="` does

`==` checks **whether both variables refer to the exact same memory address** (same object).

---

## 🧩 Step 2: What `equals()` does for Strings

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

## 💥 Step 3: Why `==` sometimes works for Strings

Because of **String constant pool**.

### When you write:

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

### But when you use `new`:

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

## 🔍 Step 4: So what’s the rule?

| Comparison Type | Checks                              | When True                                 | Best Used For                            |
| --------------- | ----------------------------------- | ----------------------------------------- | ---------------------------------------- |
| `==`            | Reference equality (memory address) | When both references point to same object | Primitives, object identity              |
| `equals()`      | Content equality                    | When text/data is same                    | Strings, wrapper classes, custom classes |

---

## 🧠 In Short (Write This in Notes)

* `"=="` → checks **object reference** (same memory or not)
* `.equals()` → checks **string content** (same characters or not)
* String literals are stored in **String Constant Pool**, so `"=="` *might* return true if both refer to same literal.
* But with `new String()`, `"=="` will always be false (different objects).
* Always use `.equals()` when comparing string **values**.

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
 
