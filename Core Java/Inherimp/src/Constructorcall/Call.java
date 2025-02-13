package Constructorcall;
import Constructor.C1;
public class Call  extends C1{

	
	
	 void call () {
			
			super.m1();
		}

	public static void main(String[] args) {
	
    C1 c2 = new C1();
    c2.m1();
		Call c = new Call();
		c.call();
         
         
}
}