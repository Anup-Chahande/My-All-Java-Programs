package Uniquethings;

public class Finealobject {
	
	int a=2;
	Finealobject(int a) {
		System.out.println(a);

	}

	public static void main(String[] args) {
		final Finealobject f1= new Finealobject(8);
//		f1= new Finealobject(9); new object not created
		 Finealobject f2= new Finealobject(8);
		 f2=new Finealobject(9);
		 

		
	}

}
