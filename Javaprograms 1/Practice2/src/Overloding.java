
public class Overloding {
  void oved() {
	  
	  System.out.println("1st");
 
  }


void oved(int a) {
	  
	  System.out.println("2nd");
 
  }
public static void main(String[] args) {
	Overloding s = new Overloding();
	s.oved(1);
	s.oved();
}

}



