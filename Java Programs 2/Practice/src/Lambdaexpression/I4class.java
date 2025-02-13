package Lambdaexpression;

public class I4class {
public static void main(String[] args) {
	I4 i4 = (a,b)->{
		return a+b;
	
		};
		
		I4 i5 = (a,b)->a+b ;
		
		
		int c =i4.m1(5, 5);
		int d =i5.m1(4, 4);

		System.out.println(c);
		System.out.println(d);

	
	
}
}
