package com.Shivam;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="shivam";
		String s2="amshim";
		anagramstring(s1,s2);

	}

	public static void anagramstring(String s1,String s2) {
		int count=0;

		for (int i=0;i<s1.length();i++) {
			for (int j=0;j<s2.length();j++) {
				if(s1.length()==s2.length()) {
					if(s1.charAt(i)==s2.charAt(j)) {
						count++;
						
					}
				}
			}
		}
		if(count==s1.length()) {
			System.out.println("s1 and s2 are anagram of each other");
		}
		else {
			System.out.println("not anagram");
		}
		
	}

}
