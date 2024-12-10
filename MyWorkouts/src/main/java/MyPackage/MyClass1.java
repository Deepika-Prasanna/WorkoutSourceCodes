package MyPackage;

public class MyClass1 {

	public static void main(String[] args) {
		B b = new B();
		b.xyz();
	}
	
}

class A{
	public A() {
		System.out.println("A con");
	}
	public void xyz() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B con");
	}
public void xyz() {
		System.out.println("B");
	}
}


