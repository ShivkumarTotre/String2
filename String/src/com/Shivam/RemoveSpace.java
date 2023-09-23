package com.Shivam;

public class RemoveSpace {

	public static void removespaces(String s) {

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				ch[i] = (char) (ch[i] - 1);
			}
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	public static void replaceFirstLetterCase(String s) {
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				if (ch[i + 1] >= 97 && ch[i + 1] <= 122) {
					ch[i + 1] = (char) (ch[i + 1] - 32);
				}
			} 
			else if (ch[0] >= 97 && ch[0] <= 122) {
				ch[0] = (char) (ch[0] - 32);
			}
			System.out.print(ch[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i love my India";
		removespaces(s);
		replaceFirstLetterCase(s);

	}

}
