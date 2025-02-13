import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int a = sc.nextInt();
		System.out.println("Enter the Second no");

		int b = sc.nextInt();
		System.out.println("Enter what you want to do *, /,-,+ ");
		String oprator = sc.nextLine();

		if( oprator == "*");{
                c = a*b;
                System.out.println("Your multiplication is" + c);
		  
	}
		 if(oprator == "-") {
                	c = a-b;
                    System.out.println("Your substraction is" + c);
                }
		 if(oprator == "/") {
         	c = a/b;
             System.out.println("Your Division is");
         }
		 if(oprator == "+") {
	         	c = a/b;
	             System.out.println("Your Addition  is" + c);
	         }
		 

	}
}
