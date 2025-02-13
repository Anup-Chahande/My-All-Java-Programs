
public class Swaporignal {
int a =3;
int b =5;

 void Swap(){
	 
	 
	 int temp=a;
	  a=b;
	  b=temp;
	  
	  System.out.println("after swaping a is "+a+" and b is " + b );

	 
 } 
	
      public static void main(String[] args) {
    	  
    	  
    	  
    	  Swaporignal s = new Swaporignal();
  		 System.out.println("A value before is "+s.a+" b value before is "+s.b);

    	  s.Swap();
	}

}
