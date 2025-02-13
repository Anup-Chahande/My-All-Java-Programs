package NUmberpattren;

public class Eight {
public static void main(String[] args) {
	
	int count =5;
	
	for(int  i=1;i<=5;i++) {
		for(int j=1;j<=1;j++) {
			System.out.print(i);
		}
		for(int k=2;k<=i;k++) {
			count++;
			System.out.print(count);
		}
		
		
		
		System.out.println();
	}
	
}
}
