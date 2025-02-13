import java.util.Scanner;
public class Compstring {
public static void main(String[] args) {
	
	String one;
	String two = "hihihihi";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String");
	one = sc.next();
	System.out.println("Enter the Second String");
    two = sc.next();
	if(one.length()<two.length()) {
		
		
		System.out.println(two + " is greter");
	}
	else {System.out.println(one + " is greter");}
}
}
