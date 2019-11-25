
public class SubClass extends SuperClass {
     
	String s = "Subclass variable";
	
	public SubClass() {
		super();
		System.out.println("Sub class constructor");
	}
	
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("******************************");
		super.superClassMethod();
		superClassMethod();
	}
}
