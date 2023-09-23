package com.Shivam;

public class CountLines {

	public static void main(String[] args) {
		// Count the number of lines, word, characters from a string
		String a="shivam is good boy\n and he is student";
		System.out.println(a);
		
		countall(a);

	}

	public static void countall(String a) {
		// TODO Auto-generated method stub
		String s[]=a.split(" ");
		int word=s.length;
		System.out.println(word);
		
//		System.out.println(a.lines().count());

		char ch[]=a.toCharArray();
		int countchar=0;

		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i] !='\n') {
				countchar++;
			}
		}
		System.out.println(countchar);
		
	}

}
