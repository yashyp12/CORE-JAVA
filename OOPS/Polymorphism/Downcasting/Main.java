/*
 * Ramesh r = new Suresh();  // Upcasting (ok)
Suresh s = (Suresh) r;    // Downcasting (safe)


Downcasting only works if the object was originally of the child class.

just the actual obj hass to be same as casting type - 
You can upcast freely, but you can downcast only if the original object was of that child type.”
 */

class Ramesh {
}

class Suresh extends Ramesh {
}

class Ganesh extends Suresh {
}

public class Main {

    public static void main(String[] args) {
        Suresh obj = new Ganesh(); // upcasting
        Ramesh obj1 = obj;  // upcasting
        Suresh obj2 = (Suresh) obj1; // downcasting
        Ganesh obj3 = (Ganesh) obj2; //downcasting

    }
}
