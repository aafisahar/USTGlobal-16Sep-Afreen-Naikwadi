
public class TestB {
	
	static int a = 25;
	static TestB t;
	int x;
	
	public static void add() {
		// only final access modifier is supported for local modifier
		final int a;
		int b;
		a = 10;
		b = 40;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is "+t.x);
	}
}
