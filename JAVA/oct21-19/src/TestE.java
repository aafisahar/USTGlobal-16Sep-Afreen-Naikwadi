
public class TestE {
    public static void main(String[] args) {
		Student.clgName = "SGBIT";
		Student s1 = new Student();
		s1.name = "Afreen";
		s1.usn = "2bu14ee050";
		System.out.println("College name = "+Student.clgName);
		System.out.println("Student name ="+s1.name);
		System.out.println("Student USN ="+s1.usn);
	}
}
