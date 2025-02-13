package NemapPrograms;

import java.util.Scanner;

public class Charectorcountstr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toLowerCase().toCharArray();
		int count[] = new int[ch.length];
		
		
		for (int i = 0; i <ch.length; i++) {
			count[i]=1;
			for(int j=1+i;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					count[i]++;
					ch[j]='0';
					
					
				}
			
				
			}
			
			
			
		}
		
		for(int k=0;k<ch.length;k++) {
			
			if(ch[k]!='0' && ch[k]!=' ') {
				
				System.out.print(ch[k]+""+count[k]);
			}
			
		}

	}
}
