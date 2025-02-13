
public class Twenty {
public static void main(String[] args) {
	int a =475;
	int sum=0;
	while(a>0) {
		
		int c = a%10;
		sum = c+sum;
		a=a/10;
	}
	
	System.out.println(sum);
}
}
