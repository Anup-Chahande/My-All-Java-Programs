package Custom;
import java.util.ArrayList;
public class Student {
 String Sname;
 int age;
 int ID;
 String Branch;
 
 
 Student(String Sname,int age,int ID,String Branch){
	 this.Sname= Sname;
	  this.age=age;
	  this.ID=ID;;
	  this.Branch=Branch;
 }
 

 
 @Override
public String toString() {
return Sname+ " " + age +  " " + ID +  " " + Branch;
		}



public static void main(String[] args) {
	

 Student s1= new Student("anup",22,13221,"CS");
 Student s2= new Student("sagar",21,1315221,"CS");
 Student s3= new Student("rucha",21,1322121,"it");
 Student s4= new Student("shankar",22,133221,"it");

     ArrayList<Student> al = new ArrayList<>();
     
     al.add(s1);
     al.add(s2);
     al.add(s3);
     al.add(s4);
    	 for (Student a : al) {
			if(a.Branch == "CS") {
				System.out.println(a);
			}
		}
     
}
}