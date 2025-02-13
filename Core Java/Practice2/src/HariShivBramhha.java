
public class HariShivBramhha extends Thread{
        void m1() {
        	for(int i = 1;i<=10;i++) {
        		System.out.println("Hari");
        	}
        	
        }
        void m2 () {
        	for(int i = 1;i<=10;i++) {
        		System.out.println("Shiv");
        	}
        }
        void m3() {
        	
        	for(int i = 1;i<=10;i++) {
        		System.out.println("Brammha");
        	}
        	
        }
        @Override
   	 public void run() {
        	this.m1();
        	
        	
        }

	public static void main(String[] args) {
		HariShivBramhha h = new HariShivBramhha();
		h.start();
		h.m2();
		h.m3();
	}
	
}
