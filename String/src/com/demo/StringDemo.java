package com.demo;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String args[])
	{
		String s = "ThinkQuotient Softwere Private Limited";

		char ch = 't';
		char ch1 = 'T';

		display(s, ch, ch1);
	}

	public static void display(String s1, char ch1, char ch2)
	{
		char ch3[] = s1.toCharArray();

		for(int i = 0; i < ch3.length; i++)
		{
			if(ch3[i] == ch1)
			{
				ch3[i] = (char)(ch3[i]-32);
			}
			else if(ch3[i] == ch2)
			{
				ch3[i] = (char)(ch3[i]+32);
			}
 		}

		System.out.println(Arrays.toString(ch3));
	}

}
