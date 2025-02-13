package FiightBooking;
import java.util.Random;
public class Book_a_ticket implements Booking {
	String name;
	int mob;
	int age;
static int tickit;
static int pay;
	@Override
	public void Booktickit(String name, int mob, int age,int pay) {
		this.name = name;
		this.mob = mob;
		this.age = age;
		Random rr = new Random();
		 tickit =rr.nextInt(20000);
		 Paymentss p = new Paymentss();
		System.out.println("payement sucessful"  + "Your name is = " + this.name + " | your mob is = " + this.mob +  " | your age is = " + this.age+ "| tickit no = " + this.tickit);
	}
public static void main(String[] args) {
	
}
}
