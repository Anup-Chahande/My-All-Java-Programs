package Multithreding;

public class Class1 extends Thread{
	
	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println("sagar");
		}
		
		
	}
}
