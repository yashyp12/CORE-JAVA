# Arrays 

- arrays is a collection of data types - it can be either primtive or objects or complex data types 

**Syntax**
datatype [] varname = new datatype [size];

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
