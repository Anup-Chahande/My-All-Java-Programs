package Multithreding;

public class Job2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Shiva");
	}
	

}
}