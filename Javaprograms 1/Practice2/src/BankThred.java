
public class BankThred extends Thread{
    static int balance = 1000;
	
    
    @Override
    public void run() {
    	for(int i =1;i<=5;i++)
    		this.withdraw(100);
    	
    }
	
	
	
	 synchronized void withdraw(int amt) {
System.out.println(Thread.currentThread().getName());
if(balance>150) {
		balance = balance - amt;
		System.out.println(balance);
		
		
		}
		else {
			System.out.println("Insufficiant balance");
		}
	}
	
	public static void main(String[] args) {
		BankThred b1 = new BankThred();
		b1.setName("b1");
		b1.start();
		BankThred b2 = new BankThred();
		b2.setName("b2");

		b2.start();
	}
	
}
