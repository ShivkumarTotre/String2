package com.Critical;

public class ReverseStringDemo2 {
	
	public static void checkSort(String str) {
		String str2[] = str.split(" ");

		int count = 0;
		int count1 = 0;
		boolean flag = false;

		for (int i = 0; i < str2.length; i++) {
			count = 0;
			count1 = 0;

			// int slen = str2[i].length();

			char ch[] = str2[i].toCharArray();
			// biopsy
			for (int j = 0; j < ch.length; j++) {
				for (int k = j + 1; k < ch.length; k++) {

					count1++;

					if ((ch[k] > ch[j] || ch[k] == '.') && str2[i].length() > 3) {

						count++;

					}

				}

				if (count1 == count) {

					flag = true;
					break;
				}

			}
//			System.out.println("coynt1 "+count1);
//			System.out.println("count  "+count);
//			System.out.println();

		}

		if (flag == false)
			System.out.println("false");
		else
			System.out.println("True");

	}

	public static void main(String[] args) {

		checkSort("The biopsy returned negative results");
	}
	
}
