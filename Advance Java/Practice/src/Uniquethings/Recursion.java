package Uniquethings;

public class Recursion {
//public static void main(String[] args) {
//	
//	main(args);
//	
//}
	int s=0;
	void m1(){
		System.out.println("hii");
//		m1(); calling same method
		m2();
	}
	void m2() {
		m1();
		System.out.println("hello");
	}
	
  public static void main(String[] args) {
	  Recursion a = new Recursion();
	  a.m1();
//	  int a2 = a.s;   while calling ver store in another ver
	  
}
	
}
