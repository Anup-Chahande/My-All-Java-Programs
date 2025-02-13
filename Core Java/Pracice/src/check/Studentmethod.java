package check;

public class Studentmethod {
 public void Student(String name, int age,String id )  {
	 System.out.println("Student name is " +name);
	 System.out.println("Student Id is " +id);
	 System.out.println("Student age is " +age);

 }
 
 public void check2(String name, int age,String id ) {
	 
	 System.out.println("Student name is " +name);
	 System.out.println("Student Id is " +id);
	 System.out.println("Student age is " +age);

	 
 }
 public static void main (String [] args) {
 Studentmethod asp = new Studentmethod();
       asp.Student("Anup",22,"1173");
       asp.check2("Sagar",22,"1173");
 
 }        
 
 
}