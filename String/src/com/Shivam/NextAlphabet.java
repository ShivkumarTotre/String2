package com.Shivam;

public class NextAlphabet {
	
	public static void nextaplha(String str) {
		char ch []= str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			ch[i]=(char) (ch[i]+1);
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "shivam";
		nextaplha(s);
	}

}
