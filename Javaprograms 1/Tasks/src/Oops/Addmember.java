package Oops;

public class Addmember extends LibraryMember{
public static void main(String[] args) {
	Addmember m1 = new Addmember();
	m1.setName("Anup");
	m1.setMemberID(1235);
	
	Addmember m2 = new Addmember();
	m2.setName("Sagar");
	m2.setMemberID(1232135);
	
	System.out.println("Member Name is ="+m1.getName() + " | Member ID is  =" + m1.getMemberID());
	System.out.println("Member Name is ="+m2.getName() + " | Member ID is  =" + m2.getMemberID());

}

}
