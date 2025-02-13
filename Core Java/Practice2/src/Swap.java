
public class Swap {
	int a = 3;
	int b =5;
	
	void before() {
		
		
		System.out.println("before swaping a = " + a);
	}
	
	
	void swapa() {
		for(int a=10;a>=5;a--) {
            if(a==5) {
            	
            	this.a=a;
        		System.out.println("After Swaping a value is "+this.a);
            }
		}}
	
		void swapb() {
			for(int b=1;b<=3;b++) {
				if (b==3) {
					this.b=b;
					System.out.println("After Swaping b value is "+this.b);
				}
			}}	
			
		
	
	
	public static void main(String[] args) {
		
		Swap s = new Swap();
		
		s.before();

		s.swapa();
		s.swapb();
	
}
}
