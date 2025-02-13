package Student;
import java.util.ArrayList;
public class Y {
	
	ArrayList<Student> m2() {Student s1 = new Student();
	s1.Setname("Anup");
	s1.Setage(22);
	s1.SetBranch("CS");
	s1.Setsid(12321);
	
	Student s2 = new Student();
	s2.Setname("rucha");
	s2.Setage(22);
	s2.SetBranch("CS");
	s2.Setsid(123121);
	
	Student s3 = new Student();
	s3.Setname("Sagar");
	s3.Setage(24);
	s3.SetBranch("It");
	s3.Setsid(12321);
	
	Student s4 = new Student();
	s4.Setname("Shankar");
	s4.Setage(25);
	s4.SetBranch("IT");
	s4.Setsid(12321);
	
	
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);

	ArrayList<Student> temp = new ArrayList<>();

	    for (Student a : al) {
        if(a.getSage()==22) {
        temp.add(a);

        
}
}
	return temp;
	
	
}
}
	
	
