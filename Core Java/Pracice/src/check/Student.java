package check;

public class Student {
 String name;
 String Id;
 int age;
 Hi hi;
 
 
 
 
 
 Student (String name,String Id,int age ){
	 this.name = name;
	 this.Id = Id;
	 this.age=age;
	
	 System.out.println("Student name is " +name);

	 System.out.println("Student age is " +age);

	 System.out.println("Student Id is " +Id);
	 System.out.println("Student Id is " +hi);

	 
 }
 

 

public static void main (String [] args) {
	Student s = new Student("Anup","1173",22);
System.out.println("************************");

Student s1 = new Student("Sagar","1172",21);
}
}
