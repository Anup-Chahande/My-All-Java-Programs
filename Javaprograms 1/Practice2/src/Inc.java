
public class Inc {
 static int a;
	
	Inc(){
		++a;
		
		
	}
	
	public static void main(String[] args) {
		Inc i = new Inc();
		Inc i2 = new Inc();
		Inc i3 = new Inc();

		System.out.println(i.a);

	}
}