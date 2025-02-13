package routput;

public class output {

	int add(int x, int y) {

		int c = x + y;
		System.out.println("Addition = " + c);
		return c;
	}

	int mul(int x, int y) {

		output o = new output();
		int java = o.add(x, y);
		int value = java / y;
		System.out.println("Mul = " + value);
		return value;

	}

	void div(int x, int y) {

		output o = new output();
		int value = o.mul(x, y);
		
		
		
		System.out.println("division = " + value);

	}

	public static void main(String[] args) {

		output ox = new output();
		ox.add(10, 20);
		ox.mul(2, 4);
		ox.div(8, 4);
	}

}