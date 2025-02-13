package Againpractice;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		char ch[]=str.toCharArray();
		int count[] = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			count[i]++;
			for (int j = i + 1; j < str.length(); j++) {

				
				if(ch[i]==ch[j]) {
					count[i]++;
					ch[j]='0';
					
					
					
					
				}
			}

		}
		
		for(int c=0;c<ch.length;c++) {
			
			if(ch[c]!='0' && ch[c]!=' ') {
			System.out.println(ch[c] + " = " + count[c]);
			
			}
		}

	}

}
