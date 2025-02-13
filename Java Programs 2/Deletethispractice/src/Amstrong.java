import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int copy=num;
	int rem=0;
	int sum=0;
	while(num!=0) {
		
	   rem=num%10;
	   sum=(rem*rem*rem)+sum;
	   num=num/10;
		
		
	}
	if(sum==copy) {
		System.out.println("it is amstrong no");
	}
	else {
		System.out.println("it is not amstrong no");
	}
}
}
