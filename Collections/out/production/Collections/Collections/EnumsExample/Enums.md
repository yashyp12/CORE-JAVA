#  - Enums - 
 
## 1️⃣ What is an Enum?

**Enum** (short for **enumeration**) is a **special Java class** used to define a **fixed set of constants**.

* It represents a group of **related values** in a **type-safe way**.
* Example: Days of the week, Months, Directions (NORTH, SOUTH…), etc.

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

Here, `Day` is an enum type, and `MONDAY` … `SUNDAY` are **constants**.

---

## 2️⃣ Key Features of Enums

| Feature                     | Description                                                                      |
| --------------------------- | -------------------------------------------------------------------------------- |
| Type-safe                   | ✅ You can only assign predefined enum constants                                  |
| Fixed set of values         | ✅ Cannot add new values at runtime                                               |
| Enum constants are objects  | ✅ Each constant is a **public static final instance** of the enum class          |
| Can have fields and methods | ✅ Enums can have **variables, constructors, and methods**                        |
| Can implement interfaces    | ✅ But cannot extend other classes (all enums implicitly extend `java.lang.Enum`) |
| Used in switch statements   | ✅ Perfect for **clean code** with switch                                         |

---

## 3️⃣ Enum Syntax

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

* By default, enums extend `java.lang.Enum` class.
* Enum constants are **implicitly `public static final`**.

---

## 4️⃣ Using Enums

```java
Day today = Day.MONDAY;

if(today == Day.MONDAY){
    System.out.println("Start of the week!");
}
```

✅ This is **type-safe**. You cannot do:

```java
Day today = "MONDAY"; // ❌ Error
```

---

## 5️⃣ Enums with Methods and Fields

Enums can have **fields, constructors, and methods**:

```java
enum Day {
    MONDAY("Work"), 
    TUESDAY("Work"), 
    SATURDAY("Relax"), 
    SUNDAY("Relax");

    private String activity;

    // Constructor
    Day(String activity){
        this.activity = activity;
    }

    // Method
    public String getActivity() {
        return activity;
    }
}
```

**Using it:**

```java
Day today = Day.SATURDAY;
System.out.println(today.getActivity()); // Relax
```

---

## 6️⃣ Enum Methods

| Method                 | Description                                            |
| ---------------------- | ------------------------------------------------------ |
| `values()`             | Returns an array of all enum constants                 |
| `valueOf(String name)` | Converts a string to enum constant                     |
| `ordinal()`            | Returns the position of the constant (starting from 0) |
| `name()`               | Returns the name of the constant as String             |

**Example:**

```java
for(Day d : Day.values()){
    System.out.println(d + " at index " + d.ordinal());
}
```

**Output:**

```
MONDAY at index 0
TUESDAY at index 1
SATURDAY at index 2
SUNDAY at index 3
```

---

## 7️⃣ Enums in Switch Statements

```java
Day today = Day.MONDAY;

switch(today){
    case MONDAY -> System.out.println("Start work week");
    case SATURDAY, SUNDAY -> System.out.println("Weekend!");
    default -> System.out.println("Midweek");
}
```

✅ Much cleaner than using strings or integers for constants.

---

## 8️⃣ Why use Enums?

* ✅ Type safety — prevents invalid values
* ✅ Code readability — easy to understand and maintain
* ✅ Can have methods/fields — more powerful than `final static` constants
* ✅ Works perfectly with **switch statements**
* ✅ Cleaner than `public static final int` constants (old style)

---

## 9️⃣ Enum Example with All Features

```java
enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31);

    private int days;

    Month(int days){
        this.days = days;
    }

    public int getDays(){
        return days;
    }
}

public class EnumDemo {
    public static void main(String[] args){
        for(Month m : Month.values()){
            System.out.println(m + " has " + m.getDays() + " days.");
        }
    }
}
```

**Output:**

```
JANUARY has 31 days.
FEBRUARY has 28 days.
MARCH has 31 days.
```

---

## 🔟 Summary

| Concept     | Enum                                         |
| ----------- | -------------------------------------------- |
| Type        | Special class                                |
| Extends     | `java.lang.Enum` implicitly                  |
| Constants   | Fixed set of objects                         |
| Type safety | ✅ Yes                                        |
| Can have    | Fields, methods, constructors                |
| Can use in  | Switch statements                            |
| Typical use | Days, Months, Directions, Status codes, etc. |

---


Sure! Here’s the **proper, complete syntax** for using an enum in Java, step by step.

---

### 1️⃣ Define the Enum

You must **declare the enum first** (usually outside your class or as a static inner enum):

```java
enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

---

### 2️⃣ Declare a Variable of Enum Type

```java
Week week;  // declare a variable of type Week
```

---

### 3️⃣ Assign a Value to the Variable

```java
week = Week.FRIDAY;  // assign one of the enum constants
```

✅ `Week.FRIDAY` refers to the `FRIDAY` constant defined inside the `Week` enum.

---

### 4️⃣ Full Example Program

```java
public class EnumExample {
    // Step 1: define the enum
    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Step 2: declare a variable
        Week week;

        // Step 3: assign a value
        week = Week.FRIDAY;

        // Use it
        System.out.println("Today is " + week);
    }
}
```

**Output:**

```
Today is FRIDAY
```

---

### ✅ Key Points

1. **Enum type declaration** must be done **before** you use the constants.
2. Enum constants are accessed using **`EnumName.CONSTANT`**.
3. Enum variables **can only hold values from their enum type**.



💡 **Key Tip:**
Enums are **much better than constants** (`final static`) because they are type-safe, readable, and can have additional behavior.
 

 