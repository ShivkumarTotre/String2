package com.Shivam;

public class EqualSpilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="shivam";
		spiltequally(s);

	}

	private static void spiltequally(String s) {
		
		String spiltString[]=new String[2];
		spiltString [0]=s.substring(0, 3);
		spiltString[1]=s.substring(3);
		for (String str:spiltString) {
			System.out.println(str);
			
		}
	
	}

}
