`ArrayList` is a **resizable (dynamic) array** implementation of the `List` interface in Java.
It allows **duplicate elements**, maintains **insertion order**, and provides **random access** to elements using indexes.

It is part of the **`java.util`** package and is one of the most commonly used classes in the Java Collections Framework.


- internally arraylist is implements as array of Object references . 
- when you add elemtns to arrylist we are essentially storing elements in this internal array

- DIFF IN capacity and size of array list
1. Size (list.size())
What it is: The actual number of elements currently stored in the ArrayList.
2. -What it is: The total maximum number of elements the ArrayList can hold in its internal array without needing to allocate a new, larger array. This property is an internal detail you cannot directly access with a method (though you can use ensureCapacity() to increase it or trimToSize() to reduce it).


Before Adding elements - the following steps are occur
1 Check capacity :  before adding arraylist checks if there enough space in the internal array . if the array is full ,it needs to be resized

2 Resize if necessary - 
if internal aray is full, arraylist will create a new array with larger capacity 1.5 times , 

3 - Add the element - new element is added in teh appropriate index , size is incremented


* **Initial Capacity:** By default, the initial capacity is 10. This means the internal array can hold 10 elements before it needs to grow.

* **Growth Factor:** When the internal array is full, a new array is created with a size 1.5 times the old array. This growth factor balances memory efficiency and resizing cost.

* **Copying Elements:** When resizing occurs, all elements from the old array are copied to the new array, which is an O(n) operation, where n is the number of elements in the ArrayList.


- TIME COMPLEXITY IS O(N) 


### Removing Elements

- **Check Bounds:** The ArrayList first checks if the index is within the valid range.

- **Remove the Element:** The element is removed, and all elements to the right of the removed element are shifted one position to the left to fill the gap.

- **Reduce Size:** The size is decremented by 1.



### Shrinking ArrayList
### Does ArrayList Automatically Shrink?

No, an `ArrayList` does **not automatically shrink** its capacity when elements are removed.  
While the `size()` of the list decreases when you call `remove()`, the underlying `Object[]` array retains its larger capacity.

This behavior is intentional — Java developers designed it this way for performance reasons.  
Repeatedly resizing the array (both growing and shrinking) during frequent add/remove operations would be inefficient and computationally expensive.

---

### How to Manually "Shrink" an ArrayList

You can manually trigger the shrinking process to free up unused memory using the `trimToSize()` method:

```java
list.trimToSize();


Current Capacity: You start with a capacity of 1000.
Calculation Formula: newCapacity = oldCapacity + (oldCapacity / 2) (or oldCapacity * 1.5).
The new capacity will be 1500.


