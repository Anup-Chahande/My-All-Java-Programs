package Lambdaexpression;

public class I2dlass {
	public static void main(String[] args) {

//	I2 i1=(anyrefname)->{}; this also work
		I2 i1 = (String anyrefname) -> {

			System.out.println("hi this is way to call      "+ anyrefname);
		};

		i1.m1("Our Paramiter");
		
	}
}
