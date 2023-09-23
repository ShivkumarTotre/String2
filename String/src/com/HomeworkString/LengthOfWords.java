package com.HomeworkString;

public class LengthOfWords {
	
	public static void countWord(String s1)
	{
		String str[] = s1.split(" ");
		
		System.out.println("String Length Using String Array is : "+str.length);
	}

	public static void main(String[] args) {

		String s = "Java is Easy";
		
		countWord(s);
		countWord2(s);
	}
	
	public static void countWord2(String s1)
	{		
		char ch[] = s1.toCharArray();
		
		int iCnt = 0;
		
		for(int i = 0; i < ch.length; i++)
		{
			if(i == 0 || ch[i] == ' ')
			{
				iCnt++;
			}
		}
		
		System.out.println("String Length Using Character Array is : "+iCnt);
	}

}
