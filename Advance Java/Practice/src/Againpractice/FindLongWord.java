package Againpractice;

import java.util.Scanner;

public class FindLongWord {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Sentense"); 
	
	String str =sc.nextLine();
	str=str+" ";
	String word="";
	String lgword="";
	
	for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		
		if(ch!= ' ') {
			
			word=word+ch;
			
			
		}
		else {
			
			if(word.length()>lgword.length()) {
				lgword=word;
				
			}
			word="";
		}
		
		
	}
	
	
	System.out.println("Largest word is " + lgword);
	
}
}
