package com.Shivam;

public class DuplicateCharFrequency {
	
	public static void dupLiCharFreq(char ch[]) {
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>=1) {
				System.out.print(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		String s="Concatenate";	
		char ch[]=s.toCharArray();
		dupLiCharFreq(ch);

	}

}
