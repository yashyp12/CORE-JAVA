class Parent{
	public void m1(){
		System.out.println("hello from Parent");
	}
}


abstract class Child extends Parent{
	public abstract void m1();
}

class GrandChild extends Child{
	@Override 
	public void m1(){
		System.out.println("hello from grandChild");
	}
}


public class DriverExampleAbstraction{
	public static void main(String[] args) {
		Parent obj = new GrandChild();
		obj.m1();
	}
}