
public class Student {
    String name;
    int rollno;
    final String cname = "Shaikh PU College";
     final int cid;
     Student(String name , int rollno , int cid){
    	 this.name = name;
    	 this.rollno = rollno;
    	 this.cid = cid;
     }
     
     public Student() {
    	 this.cid = 50;
	}
     
     final void printDetails() {
    	 System.out.println("Hi "+name+" Welcome to "+cname);
     }
     
     final void printDetails(String name) {
    	 System.out.println("Hi "+name+" Welcome to "+cname);
     }
}
