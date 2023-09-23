package com.Shivam;

public class DuplicateWord {

	public static void countdupliwords(String s) {
		String s1 = s.toLowerCase();
		String str[] = s1.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("visited")) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = "visited";

				}
			}
			if (count > 1) {
				System.out.println(str[i]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is Easy and Java is oop langauge";
		countdupliwords(str);

	}

}
