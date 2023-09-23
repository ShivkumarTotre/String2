package com.Shivam;

public class ReplaceFirstLetterCase {

	public static void main(String[] args) {
		// Replace first letter of every word with capital
		String s = "java is a programming Languague";
		replaceCase(s);

	}

	private static void replaceCase(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				if (ch[i+1] >= 97 && ch[i+1] <= 122) {
					ch[i + 1] = (char) (ch[i + 1] - 32);
				}
			}
			else if(ch[0]>=97 && ch[0]<=122) {
				ch[0]=(char) (ch[0]-32);
			}
			System.out.print(ch[i]);
		}
		
	}

}
