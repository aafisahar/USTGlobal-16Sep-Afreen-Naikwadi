
public class Student {
    String name;
    int id;
    String clgName;
    String branch;
    double perc;
    
    public Student(String name , int id, String clgName , String branch , double perc) {
    	this.name = name;
    	this.id = id;
    	this.clgName = clgName;
    	this.branch = branch;
    	this.perc = perc;
    	this.display();
	}
    
    void display() {
    	System.out.println("Student name is "+name);
		System.out.println("Student id is "+id);
		System.out.println("Student college name is "+clgName);
		System.out.println("Student branch is "+branch);
		System.out.println("Student perc is "+perc);
    }
    
    public static void main(String[] args) {
		Student s1 = new Student("Afreen", 50, "SGBIT", "EEE", 80);
//		s1.display();
		Student s2 = new Student("Ayan", 44, "GIT", "ME", 79);
//		s2.display();
		Student s3 = new Student("Sufiya", 66, "Shaikh", "Commerce", 80);
//		s3.display();
		Student s4 = new Student("Shifa", 23, "Anjuman", "Arts", 60);
//		s4.display();

		
	}
}
