import java.util.Scanner;
public class Palidrome {
//121
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int d=num;
	int rev=0;
	while(num>0) {
		int c = num%10;
          rev = rev*10+num;
		d =d /10;
		
		
		
	}
	
	if(rev==d ) {
		System.out.println("number is palidrome");
	}
	else {
		System.out.println("Numbeer is not pali");
	}
	
	
}
}
