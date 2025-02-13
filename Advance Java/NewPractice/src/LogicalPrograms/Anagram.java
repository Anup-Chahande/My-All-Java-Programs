package LogicalPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
public static void main(String[] args) {

	String s1= "sill";
	String s2= "isll";

	char arr1[]=s1.toLowerCase().toCharArray();
	char arr2[]=s2.toLowerCase().toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println(arr1);
	System.out.println(arr2);
if(	Arrays.equals(arr1, arr2)) {
	
	System.out.println("both are anagram string");
}
else {
	System.out.println("both are not anagram string");
}

	
}
}
