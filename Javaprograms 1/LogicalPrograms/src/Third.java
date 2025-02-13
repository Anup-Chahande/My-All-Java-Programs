
public class Third {
	 int a=3;
	 int b = 4;
	 

	 void m1() {
		
    a=a+b;
    b=a-b;
    a=a-b;
    
    System.out.println("After swapping values are a is  " + a + " And b Is " + b) ;
	 
	 
 
 }
public static void main(String[] args) {
	Third t = new Third();
	t.m1();
}
}
