package com.Critical;

public class ReverseStringNumber {
	
	public static void display(String s)
	{
		String s1 = "";
		
		char ch[] = s.toCharArray();
		int j = ch.length-1;
		
		for(int i = 0; i < ch.length; i++)
		{
			s1 = s1 + ch[j];
			j--;
		}
		
		System.out.println(s1);
	}

	public static void main(String[] args) {

		String no = "1 23 456";
		
		display(no);
	}

}
