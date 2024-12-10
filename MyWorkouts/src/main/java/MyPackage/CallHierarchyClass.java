package MyPackage;

class Parent{
	void walk(){
		System.out.println("Inside Parent walk");
	}
	void run(){
		System.out.println("Inside Parent run");
		walk();
	}
}
class Child extends Parent{
	void walk(){
		System.out.println("Inside Child walk");
		super.walk();
		
	}
	void run(){
		System.out.println("Inside child run");
		super.run();
	}
}

public class CallHierarchyClass {

	public static void main(String[] args) {
		Parent p = new Child();
		p.run();
	}

}
