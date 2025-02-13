package SuperThis;

public class Subclass extends Superclass{
	
	Subclass(){
		super(); //hidden always
		super.m1();	
		this.m1();
		
	}
	
	@Override
	void m1() {

  	  System.out.println("Method get called of sub");

 }
	
	
	public static void main(String[] args) {
		Subclass ss = new Subclass();
	
	}

}
