
public class Employee {
	String name;
	int id;

	public Employee(String ename , int eid) {
		name = ename;
		id = eid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+id);
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
