import java.util.Scanner;
public class Reversenumber {
public static void main(String[] args) {
	//876
	
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b;
	while(a>0) 
	
	{
		
		
		b = a%10;
		System.out.print(b);
		
		 a = a/10;
		
	}
	
	
	}
	
	
	
	
	

}
