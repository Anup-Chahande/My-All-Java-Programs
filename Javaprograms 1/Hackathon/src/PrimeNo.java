import java.util.Scanner;
public class PrimeNo {
public static void main(String[] args) {
	//7
	int count = 0;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
for(int i = 1;i<=num;i++)	{
	if(num%i==0) {
		
		count++;
	}
	
	
	
	
}
if(count==2) {
	
	System.out.println("its a  prime no");
}
else {
	System.out.println("Its a not prime no");
}
	
	
	
	
}
}
