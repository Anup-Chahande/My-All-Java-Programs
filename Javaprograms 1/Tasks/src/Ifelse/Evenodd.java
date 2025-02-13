package Ifelse;

public class Evenodd {
	
		void evenOddNo(int no) {
			if(no%2==0 ) {
				System.out.println(no + " is even number");
				
			}
			
			else {
				System.out.println(no + " is odd no");
			}
			
			
			
		}
	public static void main(String[] args) {
		Evenodd i1 = new Evenodd();
		i1.evenOddNo(5);
		i1.evenOddNo(4);

	}
	}


