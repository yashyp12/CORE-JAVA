- we can achieve multiple inheritance using interface
- Interfaces contains abstract functions , like a class only not completely
by default functions are public and abstratc in the interface, variables are static and by final by default in interfaces
- specifies wht class is doing not about how is doing 
- Think of an interface as a “contract” or blueprint for classes.

It only tells what to do, not how to do it.

- Interface Rules (very important)

All methods in an interface are public and abstract by default.

All variables in an interface are public, static, final (constants).

You cannot create an object of an interface.

A class must implement all abstract methods of an interface, else mark it abstract.

A class can implement multiple interfaces:

class SmartTV implements Remote, Bluetooth { }


An interface can extend another interface (yes, extends, not implements).