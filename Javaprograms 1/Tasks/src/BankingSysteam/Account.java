package BankingSysteam;

public class Account {
int accountNumber;
String AccountHolder;
static double balance;
 Account(int accountNumber,String AccountHolder,double balance){
 this.accountNumber= accountNumber;
this.AccountHolder=AccountHolder;
this.balance=balance;



 
 
 }
 Account(){}


  void deposit(int add)
		  {
	  balance=add+balance;
	  System.out.println("Total balence is " + balance);
	  
	 
		  }
  void withdraw(double car) {
	  
	  balance= (balance-car);
	  System.out.println("remaining balnce after buying car "+balance);
  }
  void withdraw(int bike) {
	  balance=balance-bike;
	  System.out.println("remaining balnce after buying bike "+balance);
	  
  }
  void displayAccountinfo() {
	  
	  
	  System.out.println("Account Holder name is : " +AccountHolder + " | Account no : " +accountNumber + " balance : " + balance);
  }
  
  public static void main(String[] args) {
	  Account a= new Account(124213,"Anup",900000);
	  a.deposit(5000);
	  a.withdraw(400000);
	  a.withdraw(25000);
	  a.displayAccountinfo();
}
  
 
 
}
