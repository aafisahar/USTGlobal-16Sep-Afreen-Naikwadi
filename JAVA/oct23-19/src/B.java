
public class B extends A {

	private void m1() {
		System.out.println("BB");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		
		A a = new A();
		
	}
}
