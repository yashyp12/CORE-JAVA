# object class

- contains inside the lang package
- root of the class hierarchy

- Java classes do not extend both another class and Object directly because it would violate single inheritance, which is a core Java principle. Instead


- HashCode - gives number representation of an object
- unqiue representation of an obj via number
- hashcode jsut give us the random unqiue num to identify whether the obj is same obj or diff obj


instanceof ->
The instanceof operator tests whether an object is an instance of a specified type or a subtype. This is the main distinction: it considers the entire inheritance hierarchy

# Key characteristics:
# Syntax: objectName instanceof className.
Behavior with inheritance: If Child extends Parent, an instance of Child will return true for instanceof Child as well as instanceof Parent.
# Null check: If the object variable is null, instanceof will always return false.
# Purpose: The most common use case is to check an object's type before safely casting it to a more specific type (downcasting), which prevents a ClassCastException. 

getClass() 
-> is a method we got the data about the class
getClass()
The getClass() method returns a Class object representing the exact runtime type of the object. It does not consider the inheritance hierarchy. 
Key characteristics:
Syntax: objectName.getClass().
Behavior with inheritance: If Child extends Parent, an instance of Child will have getClass() return Child.class, never Parent.class. It is not concerned with parent classes.

Null check: Calling getClass() on a null object will throw a NullPointerException, so you must perform a null check beforehand.
Purpose: It is often used in the equals() method to ensure that two objects are not only logically equivalent but also of the exact same runtime class