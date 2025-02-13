package SuperThis;

public class Superclass {
      int globalver = 7;
    
      Superclass(){

    	  System.out.println("Cons get called");
    	  
      }
      Superclass(int a){
    	  
    	  this();
    	  System.out.println("hi");

      }
      
      void m1() {

    	  System.out.println("Method get called");
    	  System.out.println(this.globalver);

   }
      
public static void main(String[] args) {
	Superclass ss = new Superclass(2);
}      
      
}

