
public class Largest {
     
	int m1() {
		 int large;
		int a[]= {1,2,3,7,10,6,9};
		large = a[0];
	for(int i =0;i<a.length;i++) {
		if(large<a[i]) {
			large=a[i];
           
		}
	}
	return large;

	
	
  
  
  
     }public static void main(String[] args) {
    	 Largest l = new Largest();
    	System.out.println(l.m1());
	}
         }
