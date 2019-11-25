
public class Employee1 {

	String name;
	int id;

	public Employee1(String name , int id) {
		this.name = name;
		this.id = id;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+id);
		
	}
	
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to UST Global company");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Sufiya" , 643);

		Employee e2 = new Employee("Afreen" , 444);

		Employee e3 = new Employee("Ayan" , 246);
		
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();

	}
}

