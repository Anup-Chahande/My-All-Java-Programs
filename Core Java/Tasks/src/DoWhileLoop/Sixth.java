package DoWhileLoop;

public class Sixth {
public static void main(String[] args) {
	int a=1;
	int sum =0;
	do {
		
		if(a%2==0) {
			
			sum=a+sum;
			
			
		}
		a++;
		
	}
	while(a<=50);
System.out.println(sum);
}

}
