package com.HomeworkString;

import java.util.Arrays;

public class CommonCharacterFromString {
	
	public static void displayCommonCharAlphabetWise(char s1[], char s2[])
	{
		int iCnt = 0;
		boolean isVisited = false;
				
		for(int i = 0; i < s1.length; i++)
		{
			if(s1[i] == ' ')
			{
				continue;
			}
			
			for(int k = i+1; k < s1.length; k++)
			{
				if(s1[i] == s1[k])
				{
					s1[k] = '0';
				}
			}
			
			isVisited = false;
			
			for(int j = 0; j < s2.length; j++)
			{
				if(s1[i] == s2[j] && isVisited == false)
				{
					iCnt++;
					isVisited = true;
				}
			}
		}
		
		char ch[] = new char[iCnt];
		
		for(int i = 0, k = 0; i < s1.length; i++)
		{
			if(s1[i] == ' ')
			{
				continue;
			}
			
			isVisited = false;
			
			for(int j = 0; j < s2.length && k < ch.length; j++)
			{
				if(s1[i] == s2[j] && isVisited == false)
				{
					ch[k] = s1[i];
					k++;
					isVisited = true;
				}
			}
		}
		
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {

		String s1 = "thick sticks";
		String s2 = "thin bricks";
		
		char ch[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
//		displayCommonCharAlphabetWise(ch, ch2);
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		char ch3[] = s1.toCharArray();
		char ch4[] = s2.toCharArray();
		
		displayCommonCharAlphabetWise2(ch3, ch4);
		
	}
	
	public static void displayCommonCharAlphabetWise2(char s1[], char s2[])
	{
		int iCnt = 0;	
		String s3 = "";
				
		for(int i = 0; i < s1.length; i++)
		{	
			iCnt = 1;

			for(int j = 0; j < s2.length; j++)
			{				
				if(s1[i] == s2[j])
				{
//					System.out.println(s2[j]);
					iCnt++;
					s2[j] = '\0';
				}
			}
			if(iCnt > 1)
			{
				s3 = s3+s1[i];
			}
		}
		
		System.out.println(s3);
		
		char ch[] = s3.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					int temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char) temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ch));
	}

}
