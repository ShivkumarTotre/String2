package com.Shivam;

public class CountWord {
	
	public static void countwords(String s) {
		String str[]= s.split(" ");
		
		System.out.println("total number of words :"+str.length);
	}
	
	public static void countword(String s) {
		int count=0;
		for (int i=0;i<s.length();i++){
			
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("total number od words :"+(count+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is Easy";
		countwords(s);
		countword(s);

	}

}
