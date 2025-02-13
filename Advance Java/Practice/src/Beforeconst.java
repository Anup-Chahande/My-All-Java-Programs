
public class Beforeconst {
void m1() {
	System.out.println("hiii");
}
	Beforeconst(){
		System.out.println("cons");
	}
	Beforeconst(int a){
		System.out.println("cons par");
	}
	public static void main(String[] args) {
		Beforeconst bs2 = new Beforeconst();
		bs2.m1();

		Beforeconst bs = new Beforeconst(1);
		bs.m1();

		
	}
	
}
