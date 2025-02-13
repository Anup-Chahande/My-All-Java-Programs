package Execption;

public class Finally {
public static void main(String[] args) {
	
	try {
		System.out.println(10/0);
	}
	catch(Exception e){
		System.out.println("catch works");
	}
	finally {
		System.out.println("finally works");
	}
	
   throw new CustomExecption();	
	
	
	
	
	
	
	
}
	
}
