# Generics 
- generics help us to providing an paramterised type 
* Generics in Java are a powerful feature that allows you to write flexible, reusable code while ensuring type safety. They enable classes, interfaces, and methods to operate on different types of data without needing to be written specifically for each type


- Stronger type checks at compile time.
A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

https://docs.oracle.com/javase/tutorial/java/generics/types.html


        // WE CANNOT CREATE AN INSTANCE OF TYPE PARAMETER

        // W CANNOT CREATE STATIC FIELDS OF TYPE PARAMETERS 
        //  CANNOT USE INSTANCE OF VARIABLE 



- Key Points about Generics
**Type Parameters:** Generics use placeholder names (like <T>, <E>, <K>, <V>) within angle brackets to represent a type that will be specified later when the object is actually used.
- 
**Code Reusability:** You can write a single class or method blueprint that works for Integers, Strings, or your own custom User objects, without writing duplicate code for each type.
- 
**No Casting Required:** Once you define the type using generics, the compiler knows what type you will get back, eliminating the need for manual type casting every time you retrieve an element.

**Generics and Primitives:** Generics only work with reference types (objects), not primitive types (int, char, double). You must use the corresponding wrapper classes instead (e.g., Integer, Character, Double).

**Type Erasure:** This is a technical detail where the compiler removes the generic type information after checking everything. At runtime, an ArrayList<String> is just an ArrayList. The safety checks only happen during compilation to ensure backward compatibility with older Java versions. 


* 
* Before generics, collections stored objects using the universal Object type. This meant the compiler couldn't know what type of data was actually inside the collection until the program was running, leading to potential runtime errors _(ClassCastException_). 
* Generics solve this by:
* Type Safety at Compile Time: The compiler enforces that only objects of a specific type can be added to a generic collection. If you try to add the wrong type, the code won't compile.
* No Explicit Casting: You don't need to manually cast the retrieved objects back to their original type. 
