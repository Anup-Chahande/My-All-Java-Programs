
public class Try {
int i = 0;
	void check(){
	
	for(int a=1;a<=100;a++) {
		
		if(a%7==0) {
			i=a+i;
			
		}
		

	}
	System.out.println(i);

}
public static void main(String[] args) {
	Try t = new Try();
	t.check();
	
	
}
}
