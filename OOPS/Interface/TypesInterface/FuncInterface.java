package Interface.TypesInterface;

@FunctionalInterface
public interface FuncInterface
{

    /*
    A functional interface sirf ek hi abstract method rakhta hai.
Iske alawa kitne bhi default, static, private methods ho sakte hain.
Ye basically ek contract hai lambda expressions ke liye.
     */



    void m1();
    String toString();
    int hashCode();



}
