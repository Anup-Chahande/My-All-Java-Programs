
public class Recursion {
 void m1() {
	System.out.println("M1");

	Recursion rs5 = new Recursion();
	rs5.m2();
}

 void m2() {
	
System.out.println("M2");
Recursion rs6 = new Recursion();
rs6.m1();

}




public static void main(String[] args) {
	
	Recursion rs = new Recursion();
	rs.m1();
	
}
}
