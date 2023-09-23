package com.demo;

import java.util.Arrays;

public class Encrypted2 {
	
	public static void display(String s1)
	{
		char ch[] = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			if((ch[i] >= 121 && ch[i] <= 122) || (ch[i] >= 89 && ch[i] <= 90))
			{
				ch[i] = (char)(ch[i] - 24);
			}
			else if((ch[i] >= 97 && ch[i] <= 120) || (ch[i] >= 65 && ch[i] <= 88))
			{
				ch[i] = (char)(ch[i] + 2);
			}
		}
		
		System.out.println(Arrays.toString(ch));
		
		String s2 = "";
		
		for(int i = 0; i < ch.length; i++)
		{
			s2 = s2 + ch[i];
		}
		
		System.out.println(s2);
		
	}

	public static void main(String[] args) {

		String s = "zbyc";
		
		display(s);
	}

}
