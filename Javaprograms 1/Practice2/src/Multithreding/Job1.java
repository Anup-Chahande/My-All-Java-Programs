package Multithreding;

public class Job1 extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++) {
		
		System.out.println("Vishnu");
		
		
	}
	
	}

}
