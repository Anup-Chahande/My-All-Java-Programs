
public class Return {
	static void m1(int a)
	{
		if(a<0)
		{
			return; // ok
			// return 20 ; // NOT ok
		}
		
		
		System.out.println("Hello World");
	}

	public static void main(String[] args)
	{	
		m1(10) ; // it will print Hello World
		m1(-10) ; // it will NOT print Hello World as method execution will get over as a<0 condition will get true
	                  // and return statement will execute which will stop execution of method
	}
}


