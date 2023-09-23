package com.Shivam;

public class DivideEqually {
	
	public static void dividestringequally(String s) {
		String str[]= new String[4];
		str[0]=s.substring(0,3);
		str[1]=s.substring(3,6);
		str[2]=s.substring(6,9);
		str[3]=s.substring(9);
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void dividestring(String s) {
		
		char ch[]= s.toCharArray();
		int parts=4;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="aaaabbbbcccc";
		dividestringequally(word);
		dividestring(word);

	}

}
