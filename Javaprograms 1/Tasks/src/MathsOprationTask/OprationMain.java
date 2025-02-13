package MathsOprationTask;

public class OprationMain {
	MathOprations m  = new MathOprations();
	int sum =   m.add(1,10);
	
	
	public static void main(String[] args) {
		
		OprationMain m1 = new OprationMain();
		System.out.println("Addition of two numbers is " + m1.sum );
	}
}
