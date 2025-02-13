package BankingSysteam;

public class SavingAccount extends Account {
 
	
	static int a=1;
	void withdraw(double car) {
		  
		  if( a==1 ^ a==2 ^a==3) {
			   
			System.out.println("your withdrawing " +  a + " time");
			a++; 
			}
			
			else {
				
				System.out.println("you reached you limit");
			}
		 
	  }
	  
public static void main(String[] args) {
	SavingAccount s = new SavingAccount();
     s.withdraw(10000.0);
     s.withdraw(20000.0);
     s.withdraw(10000.0);
     s.withdraw(1000.0);
}
}
