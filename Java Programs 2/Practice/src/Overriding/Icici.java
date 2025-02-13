package Overriding;

public class Icici extends Rbi{

	@Override
	void withdraw() {
	balance=balance-4000;	
	System.out.println(balance);

	}
	
	
	public static void main(String[] args) {
		Icici ic = new Icici();
		ic.withdraw();
	}
	
}
