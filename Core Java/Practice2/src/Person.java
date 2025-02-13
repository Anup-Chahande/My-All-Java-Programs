
public class Person {
String name;
int age;


Person(String name,int age){
	this.name=name;
	this.age=age;

	
}







 public static void main(String [] args) {  
	 
	 Person person1 = new Person("Anup",22);
	 Person person2 = new Person("Sagar",22);
	

	 System.out.println("Person name is :- " +person1.name + " age is :- " +person1.age);
	 System.out.println("Person name is :- " +person2.name + " age is :- " +person2.age);

}
} 
 