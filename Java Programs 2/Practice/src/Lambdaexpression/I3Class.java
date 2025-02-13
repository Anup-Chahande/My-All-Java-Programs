package Lambdaexpression;

public class I3Class {
	public static void main(String[] args) {

		I3 i3 = (a, b) -> {
			int c = a + b;
			System.out.println(" this is a = " + a + " this is b =" + b + "addition = " + c);
		};
		i3.m1(4, 5);

	}
}
