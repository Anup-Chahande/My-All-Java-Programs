package WhileLoop;

public class Sixth {
public static void main(String[] args) {
	int a=1;
	int sum=0;
	while(a<=50) {
		
		
		if(a%2==0) {
			
			sum=a+sum;
			
		}
		a++;
	}
System.out.println(sum);
}

}
