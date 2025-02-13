package Ifelse;

public class Evenoddadd {
     
	void addoddeven(int even,int odd) {
		
		if(even%2==0 && odd%2!=0 ) {
			
			int addition = even+odd;
			System.out.println(" addition of even and odd no is " + addition);
		}
		
		 else if (even%2==0 && odd%2==0) {
		System.out.println(  " both " +even + " and " +odd + " are even number ");
	}
		 else if (even%2!=0 && odd%2!=0) {
				System.out.println(  " both " +even + " and " +odd + " are odd number ");
			}} // why extra curly brackets
	
	public static void main(String[] args) {
		Evenoddadd e = new Evenoddadd();
		e.addoddeven(4, 3);
		e.addoddeven(4, 4);
		e.addoddeven(3, 3);

       	
	}
}
