package com.HomeworkString;

import java.util.Arrays;

public class CountLengthCharacter {
	
	public static void countCharacterLength(String s1)
	{
		int iCnt = 0;
		
		String str[] = s1.split(" ");
		
		System.out.println("String length is : "+str.length);
		
		System.out.println(Arrays.toString(str));
		
		for(int i = 0; i < str.length; i++)
		{
			for(int j = 0; j < str[i].length(); j++)
			{
				if(str[i].charAt(j) != ' ' && str[i].charAt(j) != '\n')
				{
					iCnt++;
//					System.out.println(str[i].charAt(j));
				}
			}
		}
		
		System.out.println("Character Length is : "+iCnt);
	}

	public static void main(String[] args) {

		String s = "Shiv is a Good Boy he\n is a Student";
		
		System.out.println(s);
		
		countCharacterLength(s);
//		countCharacterLength2(s);
	}
	
	public static void countCharacterLength2(String s1)
	{
		String s[] = s1.split(" ");
		System.out.println("String length is : "+s.length);
		
		int iCnt = 0;
		
		char str[] = s1.toCharArray();
		
		for(int i = 0; i < str.length; i++)
		{
			if(str[i] != ' ' && str[i] != '\n')
			{
				iCnt++;
			}
		}
		
		System.out.println(iCnt);
	}

}
