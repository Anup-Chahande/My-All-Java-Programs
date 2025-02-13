package Advancehardorogram;

import java.util.Scanner;

public class Nextprime {
	int num;

	void input() {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();

	}

	void opration() {

		int count = 0;

		for (int i = 1; i <= num+1; i++) {
			if (num % i == 0) {
				count++;
System.out.println(num);
			}

		}
		if (count == 2) {
			System.out.println(num + "is prime no");
		} else {
			num = num + 1;
			Nextprime ns = new Nextprime();
			ns.opration();

		}
	}

	public static void main(String[] args) {
		Nextprime ns = new Nextprime();
		ns.input();
		ns.opration();

	}

}
