package com.Shivam;

public class ChangeVowelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I like Java Programming";

		changecase(s);

	}

	public static void changecase(String s) {
		char ch[] = s.toCharArray();

		char vow1[] = { 'a', 'e', 'i', 'o', 'u' };
		char vow2[] = { 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < vow1.length; j++) {
				if (ch[i] == vow1[j]) {
					ch[i] = (char) (ch[i] - 32);
				} else if (ch[i] == vow2[j]) {
					ch[i] = (char) (ch[i] + 32);
				}
			}
			System.out.print(ch[i]);
		}

	}

}
