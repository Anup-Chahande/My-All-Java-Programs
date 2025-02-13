package Overriding;

public class Rbi {
static int balance= 10000;

 void withdraw() {
	 balance = balance-2000;
	 System.out.println(balance);
	 
 }
 public static void main(String[] args) {
	 Rbi rs = new Rbi();
	 rs.withdraw();
}


}
