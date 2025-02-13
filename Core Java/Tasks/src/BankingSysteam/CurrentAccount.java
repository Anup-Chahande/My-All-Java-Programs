package BankingSysteam;

public class CurrentAccount extends Account {
	
		static int a=1;
		void withdraw(double car) {
		
			
			if(a<=10 ){
				
				System.out.println("your transaction is complete");
				a++; 
			}	
			else {System.out.println("you reached your daily limit");}
				
			}
			
			
		
		
		public static void main(String[] args) {
			CurrentAccount c = new CurrentAccount();
			c.withdraw(100.00);
			c.withdraw(200.00);
			c.withdraw(300.00);
			c.withdraw(400.00);
			c.withdraw(500.00);
			c.withdraw(600.00);
			c.withdraw(700.00);
			c.withdraw(800.00);
			c.withdraw(900.00);
			c.withdraw(10000.00);
			c.withdraw(2000.00);
			
		}
	}
