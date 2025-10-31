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
- 

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
 
