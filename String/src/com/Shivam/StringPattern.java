package com.Shivam;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is my country";
		pattrn(s);

	}

	public  static void pattrn(String str) {
		
		String s[]=str.split(" ");
		for (int i=0;i<s.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s[j]+" ");
			}
			System.out.println();
		}
		
	}

}
