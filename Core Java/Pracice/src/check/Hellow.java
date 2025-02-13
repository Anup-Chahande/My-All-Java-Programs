package check;

public class Hellow {
	Hellow (){
		
		
		
		System.out.println("1");
	}
	
	Hellow(int a , int b ) {
		
		System.out.println("2");

		
		
	}
	 
Hellow(int o , int n,int c ) {
		
	System.out.println("3");

		
		
	}
	 
 

public static void main(String [] args) { 
	
	Hellow o = new Hellow();

	
	Hellow c = new Hellow(2,2);

	Hellow p = new Hellow(3,3,3);  /* so according to input jvm will check paramiter input from () this
                                 and run that constructor  */
	
	
}
}