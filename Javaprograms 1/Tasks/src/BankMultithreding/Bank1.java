package BankMultithreding;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Bank1 extends Thread{

	

	
	static int Balance = 10000;
	static int generatedOTP = 0;

	public static long generateID() {
		Random rnd = new Random();
		return 10000000000L + ((long) rnd.nextInt(900000000) * 100) + rnd.nextInt(100);
	}

	public static int generateOTP() {
		Random rand = new Random();
		return rand.nextInt(10000);
	}

	@Override

	public void run() {

		withdraw(5000);
	}

	 void withdraw(int amt) {

		generatedOTP = Bank.generateOTP();
		System.out.println("Your New OTP = " + Bank.generatedOTP);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your OTPtoProceed ....");
		
		int insertedOTP = sc.nextInt();
		 

		if (generatedOTP == insertedOTP) {
			System.out.println("Kam Zale");
			if (Balance > 200) {
				Balance = Balance - amt;
				System.out.println("Transaction ID = " + Bank.generateID());
				 Date d1 = new Date();
				 System.out.println("Transaction on - "+d1);
				System.out.println("Remaning Balance is " + Balance);
			}

			else {

				System.out.println("Insuficiant Balance ");
			}

		}

		else {

			System.out.println("Plsese Enter Valid OTP ");
		}

	}

	public static void main(String[] args) {

		Bank1 amazon = new Bank1();  
		amazon.start();

	}
}



