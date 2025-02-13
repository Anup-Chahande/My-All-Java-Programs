package BankMultithreding;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Bank extends Thread {
	static int Balance = 10000;
	static int generatedOTP = 0;

	static int amt;
	static long mob;

	public static int getAmt() {
		return amt;
	}

	public static void setAmt(int amt) {
		Bank.amt = amt;
	}

	public static long getMob() {
		return mob;
	}

	public static void setMob(long mob) {
		Bank.mob = mob;
	}

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

		int amt = Bank.getAmt();
		long mb = Bank.getMob();
		withdraw(amt, mb);
	}

	void withdraw(int amt, long mob) {

		if (mob == Bank.sendSMS(Bank.mob)) {
			generatedOTP = Bank.generateOTP();
			System.out.println("Your New OTP = " + Bank.generatedOTP);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your OTPtoProceed ....");
			
			
			for (int i = 1; i <= 3; i++) {
				int insertedOTP = sc.nextInt();
				if (generatedOTP == insertedOTP ) {
					i = 3;
				} else if (i == 2 || i == 1 && generatedOTP != insertedOTP) {
					System.out.println("Try Again");

				} else {
					System.out.println("You Reached Your Daily Limit");
				}

				if (generatedOTP == insertedOTP) {
					System.out.println("Kam Zale");
					if (Balance > 200) {
						Balance = Balance - amt;
						System.out.println("Transaction ID = " + Bank.generateID());
						Date d1 = new Date();
						System.out.println("Transaction on - " + d1);
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
		} else {
			System.out.println(" mobile number is incorrect");
		}

	}

	private static long sendSMS(long mob2) {
		
		return 0;
	}

	public static void main(String[] args) {

		Bank amazon = new Bank();
		Bank.setAmt(4000);
		Bank.setMob(1234567890);
		amazon.start();

	}
}
