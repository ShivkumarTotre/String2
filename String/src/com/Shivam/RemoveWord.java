package com.Shivam;

public class RemoveWord {

	public static void main(String[] args) {
		// core and advanced
		String s = "core java and advanced java";
		uniqueword(s);
		removeDuplicateWord(s);

	}

	public static void uniqueword(String s) {
		//method 1 using frequency count
		String str = s.toLowerCase();
		String[] ss = str.split(" ");

		for (int i = 0; i < ss.length; i++) {
			if (ss[i].equals("")) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < ss.length; j++) {
				if (ss[i].equals(ss[j])) {
					count++;
					ss[j] = "";
				}
			}
			if (count < 2) {
				System.out.print(ss[i] + " ");
			}

		}
	}

	public static void removeDuplicateWord(String s) {
		//method 2 using remove duplicate word
		String[] ss = s.split(" ");

		for (int i = 0; i < ss.length; i++) {
			for (int j = i + 1; j < ss.length; j++) {
				if (ss[i].equals(ss[j])) {
					ss[i] = "";
					ss[j] = "";
				}
			}
			System.out.print(ss[i] + " ");
		}

	}

}
