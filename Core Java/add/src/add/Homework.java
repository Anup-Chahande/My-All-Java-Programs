package add;

public class Homework {

	void add(int x, int y) {

		int c = x + y;
		System.out.println("Addition = " + c);
	}

	void mul(int x, int y) {

		int c = x * y;
		System.out.println("Multiplication = " + c);
	}

	void rectangle(int length, int bredth) {

		int Area = length * bredth;
		System.out.println("area of rectangle is " + Area);
	}

	void substraction(int x, int y) {

		int c = x - y;
		System.out.println("Substraction = " + c);
	}

	void division(int x, int y) {

		int c = x / y;
		System.out.println("Division = " + c);
	}

	void Square(int side1, int side2) {

		int Area = side1 * side2;
		System.out.println("area of square  is " + Area);
	}

	void Parallelogram(int base, int heaight) {

		int Area = base * heaight;
		System.out.println("area of parallelogram  is " + Area);
	}

	void modular(int a, int b) {

		int mod = a % b;
		System.out.println("area of reminder  is " + mod);
	}

	void circle(int r, int r2) {
		int radius = r * r2;
		double area = 3.14 * radius;
		System.out.println("area of circle  is " + area);

	}

	public static void main(String[] args) {

		Homework h = new Homework();
		h.add(10, 4);
		h.mul(10, 3);
		h.rectangle(10, 2);
		h.substraction(10, 4);
		h.division(10, 2);
		h.Square(2, 2);
		h.Parallelogram(2, 6);
		h.circle(3, 3);
		h.modular(2, 4);

	}

}
