package Lambdaexpression;

public class classofmain {
	public static void main(String[] args) {
		// syntax 1

		I1 i = () -> {
			System.out.println("Hii bro1");
			System.out.println("Hii bro2"); // syntax for Multiple line

		};

		i.m1(); // calling is necessary

		// syntax 2

		I1 i2 = () -> System.out.println("Hi bro3"); // syntax for single line

		i2.m1();

	}
}
