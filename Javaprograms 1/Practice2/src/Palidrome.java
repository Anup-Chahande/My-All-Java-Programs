
public class Palidrome {
public static void main(String[] args) {
	int s=0;
	int v = 4664;
	int c = v;
	int r;
	
	while(v>0) {

		r=v%10;
		s=(s*10)+r;
		v=v/10;
		
	}
	if(s==c) {
		System.out.println("no is palidrome");
		
	}
	else {System.out.println("no is not paliderome");}
	
}
}
