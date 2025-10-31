# Arrays 

- arrays is a collection of data types - it can be either primtive or objects or complex data types 

**Syntax**
datatype [] varname = new datatype [size];
ElementType[] variableName = new ElementType[length];

- Array objects are in heap
- jls (heap object are not continous)
- arraay obj in java may not be continous

- for the int array by default all the elements are 0

null - special literal which can be assigned only to the non primitve 
- by default ref var is null
- we can cast null to any type as well

- each particular element in the array are object , which stores in diff parts of the memory and ref var pointing towards it
- Collection of ref variables , by default there value is null

// enhanced for loop 
used to iterate over an array
for(datatype : CollectionofArray);


//        he maximum valid index of any Java array is always array.length - 1.
//        int maxofArray = arr.length-1;
//        System.out.println(maxofArray);

//      array clas has tostring method which converts the arr converting it to string
        System.out.println(Arrays.toString(arr));

# Multi Dimensional Array 2D ARRAY
METRICS
- 1d array defined with []
- 2d array defined with [][]

[//]: # (  syntax int [][] arr = new int [rows][col];)

- its an Arrays of Arrays
- adding coluumn is not necessary 

- there are ways to print arrays 
- toString Arrays.toString()
- using for loop and using lengthof arr[row].len in 2d array when we dont know the num of col means size like it dynamic 

# DYNAMIC ARRAYS  [array list ] - 
- what you do when we dont know the size of the array , array has fixed size . 
- Array list is a part of collection

## **Syntax -** 
****ArrayList<Integer> list = new ArrayList<Integer>();

-- array list is a class because starts with capital letter
 - 
- A multi-dimensional ArrayList is an ArrayList that contains other ArrayLists as its elements, creating a nested structure similar to a multi-dimensional array

****Key features of ArrayList ****
 Dynamic and resizable: The most significant advantage is its ability to change size. When you add more elements than the internal array can hold, the ArrayList automatically creates a larger array and copies the elements over.

## Ordered collection: It maintains the order in which elements are inserted, which allows for predictable iteration.Allows duplicates and nulls: You can add the same element multiple times and can also store null values.

**Random access is fast:** Because it is internally backed by an array, accessing an element at a specific index is a very fast, constant-time operation (\(O(1)\)).

**Insertion and deletion can be slow:** Adding or removing an element from the middle of the list can be inefficient. This is because all elements after that position must be shifted to fill the new gap, which is a linear-time operation (\(O(n)\)).

**Not synchronized:** By default, an ArrayList is not thread-safe. This means if multiple threads are trying to modify it simultaneously, you must manually synchronize access to prevent data corruption.

**Part of the Collections Framework:** ArrayList implements the List interface, giving it access to a wide variety of methods and interoperability with other collections.

**Generics for type safety:** You can declare an ArrayList to hold a specific type of object, which allows the compiler to catch type-mismatch errors at compile-time instead of at runtime. 

**How resizing works behind the scenes**
* When you add an element to a full ArrayList, here is the general process that occurs: 
* A new, larger internal array (typically about 50% larger than the old one) is created.
* All elements from the old array are copied to the new, larger array.
* The reference to the old, smaller array is discarded for garbage collection.
* The new element is added to the new array.
* 

why we cant print arr by sout and why do we can pritn arraylsit using sout
1. [ ] The core reason you cannot print a plain array directly with System.out.println() is that arrays do not override the toString() method in a way that prints their contents.
2. ArrayList: An object with an overridden toString() 
An ArrayList is a class, and like any other class, it inherits the toString() method from the Object class.
However, the ArrayList developers overrode this method to provide a clear, formatted string representation of its contents (e.g., "[Apple, Banana, Cherry]").
When you pass an ArrayList to System.out.println(), the method internally calls the ArrayList's overridden toString() method to get this user-friendly string.

**3.Normal array: An object with the default toString()** 
* An array in Java is also an object, but it's not a standard class with an overridden toString() method for printing contents.
* When you pass an array to System.out.println(), it uses the default toString() method inherited from the Object class.
* This default toString() method doesn't know anything about the array's contents. Instead, it returns a string representing the object's type and its memory address (or hash code).
* For an int array, the output would look something like [I@5064571, where:
* [ indicates it's an array.
* I indicates the type is int.
* @5064571 is the hexadecimal representation of the object's hash code, which is related to its location in memory. 

**The solution: Using helper methods**
* To solve this, the java.util.Arrays class provides static helper methods to properly print the contents of arrays. 
* Arrays.toString(myArray): For one-dimensional arrays, this method formats the elements into a readable string.
* Arrays.deepToString(myMultiDimArray): For multi-dimensional arrays, this method works recursively to format nested array contents. 