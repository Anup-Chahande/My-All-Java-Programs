package Againpractice;

import java.util.Scanner;

public class Stringpalidrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str =sc.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
		
		
	}
	if(str.equals(rev)) {
		
		System.out.println(str + " is a palidrome string");
	}
	else {
		
		System.out.println(str + " it is not a palidrome string");

	}
	
	
	
}
}
