package ArrayListobj;

import java.util.ArrayList;

public class Arralistobj {
public static void main(String[] args) {
	//first way
	
//	Students s1 = new Students("Anup",22,"C.E");
//	Students s2 = new Students("Sagar",29,"ENTC");
//	Students s3 = new Students("Kiran",39,"C.E");
//
//	ArrayList <Students> al  = new ArrayList<>();
//	al.add(s1);
//	al.add(s2);
//	al.add(s3);
//	
//	for (Students students : al) {
//		System.out.println(students);
//	}
	
	//second way
	
	
	ArrayList <Students> al2  = new ArrayList<>();
	al2.add(new Students("Anup",22,"C.E"));
	al2.add(new Students("Sagar",26,"Mech"));
	al2.add(new Students("Kiran",29,"C.E"));

	for (Students students : al2) {
		System.out.println(students);
	}
	
	
	
}
}
