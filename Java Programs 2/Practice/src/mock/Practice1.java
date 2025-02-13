package mock;

import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {
	
	System.out.println("Enter the first string");
	Scanner sc = new Scanner(System.in);
	String str1=sc.next();
	int str1count=0;
	int str2count=0;
	int str3count=0;

	
	System.out.println("Enter the Second string");
	String str2=sc.next();
	
	System.out.println("Enter the third string");
	String str3=sc.next();
	
	for(int i=0;i<str1.length();i++) {
	
		char c1 =str1.charAt(i);
		if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') {

			str1count++;
	}
		
		
		
	}
	
	for(int j=0;j<str2.length();j++) {
		
		char c2 =str2.charAt(j);
		if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u') {

			str2count++;
	}
	}
	for(int k=0;k<str2.length();k++) {
		
		char c3 =str3.toLowerCase()++++.charAt(k);
		if(c3=='a' || c3=='e' || c3=='i' || c3=='o' || c3=='u') {

			str3count++;
	}
	
	
	
	
	
	
	
	
	
	
	// emplyee eid,name,department,salary
//	name of employee and name of the dep whose salary is higest
	
	
//select name,department max(salary)  from emplyee 
	
	
	
	
	
	
	
}}
	
}
