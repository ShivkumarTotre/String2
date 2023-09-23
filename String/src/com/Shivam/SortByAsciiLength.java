package com.Shivam;

public class SortByAsciiLength {

	public static void main(String[] args) {
		// sort by length and if words having same length then sort by its ascii value
		String s = "India is my country";
		lengthsorting(s);

	}

	public static void lengthsorting(String s) {
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				else if (str[i].length()==(str[j].length())) {
					String tempe= str[i];
					str[i] = str[j];
					str[j] = tempe;
				}

			}
			System.out.print(str[i]+" ");
		}

	}

}
