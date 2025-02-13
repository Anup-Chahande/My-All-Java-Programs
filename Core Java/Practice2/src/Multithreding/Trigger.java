package Multithreding;

public class Trigger {

public static void main(String[] args) {
	
	Job1 j1 = new Job1(); 
	Job2 j2 = new Job2(); 
	Job3 j3 = new Job3(); 
	j1.start();
	j2.start();
    j3.start();
	
}
}
