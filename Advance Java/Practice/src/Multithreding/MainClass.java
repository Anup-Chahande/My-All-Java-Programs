package Multithreding;

public class MainClass {
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();

		c1.start();
		c2.start();
		for(int i=0;i<10;i++) {
			
			System.out.println("Anup");
		}	}


}
