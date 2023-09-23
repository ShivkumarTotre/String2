package com.Shivam;

public class ReverseStringWbW {
	public static void reverseStringWords(String s[]) {

		String rev = "";
		for (int i = 1; i < s.length-1; i++) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				rev = rev + s[i].charAt(j);
			}
			rev = rev + " ";
		}
		System.out.println(rev);

	}

	public static void reverseString(String s[]) {
		
		String rev = "";

		for (int j = s.length - 1; j >= 0; j--) {
			rev = rev + s[j] + ".";
		}
		System.out.print(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "i love India";
		String str[] = s.split(" ");
		reverseStringWords(str);
		reverseString(str);

	}

}
