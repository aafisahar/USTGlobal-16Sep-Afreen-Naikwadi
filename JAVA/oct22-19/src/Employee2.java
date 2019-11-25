
public class Employee2 {
	String name;
	int id;
	long aadharno;
	
	public Employee2(String name , int id , long aadharno) {
      this.name = name;
      this.id = id;
      this.aadharno = aadharno;
      
	}
	
	public Employee2(String name , int id) {
		this.name = name;
	      this.id = id;
	}
	
	void printDetails() {
		System.out.println("Hi "+name+" Welcome to Ust Global");
	}
}
