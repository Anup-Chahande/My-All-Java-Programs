package Pattrens;

public class Anup {
public static void main(String[] args) {
for(int i=1;i<=4;i++) {
	for(int c=3;c>=i;c--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		if(i==2 && k==2 || i==4 && k>1) {
			System.out.print(" ");
		}
		else {
		System.out.print("*");}
	}
	for(int j=2;j<=i;j++) {
		if(i==4 && j<4) {
			System.out.print(" ");
		}
		else {
		System.out.print("*");
	}}
	
	System.out.println();
	
}

System.out.println();

for(int i=1;i<=4;i++) {
	for(int j=1;j<=3;j++) {
		if(j==2 && i==2) {
			System.out.print("  ");
		}
		else if(i==3 && j==2) {
			System.out.print("  ");
		}
		else if(i==4 && j==2) {
			System.out.print("  ");
		}
		else {
			System.out.print(" *");
		}
	}
	
	
	System.out.println();
}
System.out.println();

for(int i=1;i<=4;i++) {
	for(int j=1;j<=3;j++) {
		if(j==2 && i==2) {
			System.out.print("  ");
		}
		else if(i==1 && j==2) {
			System.out.print("  ");
		}
		else if(i==2 && j==2) {
			System.out.print("  ");
		}
		else if(i==3 && j==2) {
			System.out.print("  ");
		}
		else {
			System.out.print(" *");
		}
	}
	
	
	System.out.println();
}

System.out.println();

for(int i=1;i<=4;i++) {
	for(int j=1;j<=3;j++) {
		
		
		 if(i==3 && j>1) {
			System.out.print("  ");
		}
		else if(i==4 && j>1) {
			System.out.print("  ");
		}
		
		else {
			System.out.print(" *");
		}
	}
	 System.out.println();

}





}
}