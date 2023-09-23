package com.HomeworkString;

import java.util.Arrays;

public class DivideStringEqually {
	
	public static void divide(String s1)
	{
		int length = s1.length();
		int iCnt = 1;
		
		char ch[] = s1.toCharArray();
		
		for(int i = 0; i < ch.length-1; i++)
		{
			if(ch[i] != ch[i+1])
			{
				iCnt++;
			}
		}
		
		char ch2[] = new char[ch.length];
		int iCnt2 = iCnt;
		
		for(int i = 0; i < ch.length; i+=3)
		{		
			for(int j = i, k = i; j < i+iCnt2 && k < i+iCnt2; j++, k++)
			{
				ch2[k] = ch[j];
				System.out.print(ch2[k]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		String s = "aaaabbbbcccc";
		
		divide(s);
	}

}
