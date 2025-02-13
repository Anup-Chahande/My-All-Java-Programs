package Newexplorelogic;

import java.util.Scanner;

public class Numberornot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		  try {int a=  Integer.parseInt(str);
		  
		        System.out.println(a + " is number");
		  }
		  catch(Exception c) {
			  
			  System.out.println("given input is string not a no");
		  }
		

	}
}
