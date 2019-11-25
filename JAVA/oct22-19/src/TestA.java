
public class TestA {
     public static int add(int a, int b) {
		System.out.println("add(int a ,int b) method");
		return a + b;
	}
     
     public static long add(long a, int b) {
 		System.out.println("add(long a ,int b) method");
 		return a + b;
 	}
     
     public static void add(int a, byte b) {
 		System.out.println("add(int a ,byte b) method");
 	}
     
     public int mul(int a, int b) {
 		System.out.println("mul(int a ,int b) method");
 		return a * b;
 	}
     
     public int mul(byte a, int b) {
  		System.out.println("mul(byte a ,int b) method");
  		return a * b;
  	}
     
     public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10, 20);
		add(12l, 24);
		add(24, 42);
		TestA t = new TestA();
		t.mul(12, 24);
		t.mul(2, 44);
	}
     
     public static void main(int a) {
 		System.out.println("main(int a)");
 	}
}
