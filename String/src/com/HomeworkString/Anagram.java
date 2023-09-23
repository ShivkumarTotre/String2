package com.HomeworkString;

public class Anagram {
	
	public static void checkAnagram(String s2, String s3)
	{
		char ch[] = s2.toCharArray();
		char ch2[] = s3.toCharArray();
		
		int iCnt = 0;
		
		if(ch.length == ch2.length)
		{
			for(int i = 0; i < ch.length; i++)
			{
				for(int j = 0; j < ch2.length; j++)
				{
					if(ch[i] == ch2[j])
					{
						iCnt++;
					}
					if(ch[i] != ch2[j])
					{
						continue;
					}
				}
			}
			if(iCnt == ch.length)
			{
				System.out.println("Given 2 Strings are Anagram");
			}
			else
			{
				System.out.println("Given 2 Strings are not Anagram");
			}
		}
		else
		{
			System.out.println("Length is Different of 2 Given Strings");
		}
	}
	
	public static void checkAnagramUsingString(String s2, String s3)
	{
		if(s2.length() == s3.length())
		{
			int iCnt = 0;
			
			for(int i = 0; i < s2.length(); i++)
			{
				for(int j = 0; j < s3.length(); j++)
				{
					if(s2.charAt(i) != s3.charAt(j))
					{
						continue;
					}
					else
					{
						iCnt++;
					}
				}
			}
			if(iCnt == s2.length())
			{
				System.out.println("Given 2 Strings are Anagram");
			}
			else
			{
				System.out.println("Given 2 Strings are not Anagram");
			}
		}
		else
		{
			System.out.println("Length is Different of 2 Given Strings");
		}
	}

	public static void main(String[] args) {

		String s = "Shivam";
		String s1 = "avshim";
		
		//checkAnagram(s, s1);
		checkAnagramUsingString(s, s1);
	}

}
