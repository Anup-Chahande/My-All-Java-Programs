
public class Helloow {
public static void main(String[] args) {
	String a = "Hello";
	int c=0;
	char ch[] = a.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(i==0) {System.out.println(ch[0]);}
		System.out.print(ch[1]);
		
		for(int j=0;j<1;j++) {
			if(i!=0) {
			System.out.println(ch[1]);
			}
		}
	}
}
}
