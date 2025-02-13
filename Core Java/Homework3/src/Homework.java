
public class Homework {
	int a;
	float b;
	char c;
	double d;
	byte e;
	short f;
	long g;
	boolean h;

	public static void main(String[] args) {

		Homework h = new Homework();

		int intvalue = h.a;
		float floatvalue = h.b;
		char charvalue = h.c;
		double doublevalue = h.d;
		byte bytevalue = h.e;
		short shortvalue = h.f;
		long longvalue = h.g;
		boolean booleanvalue = h.h;

		System.out.println("integer value is " + intvalue);
		System.out.println("float value is " + floatvalue);
		System.out.println("char value is " + charvalue);
		System.out.println("double value is " + doublevalue);
		System.out.println("byte value is " + bytevalue);
		System.out.println("short value is " + shortvalue);
		System.out.println("long value is " + longvalue);
		System.out.println("boolean value is " + booleanvalue);

	}
}