package com.MString;

public class CountCharacter {
	
	public static void count(String s1)
	{
		int iCnt = 0;		
		char ch[] = s1.toCharArray();
		String str = "";
		
		for(int i = 0; i < ch.length; i++)
		{
			iCnt = 1;
			
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					iCnt++;
					ch[j] = '\0';
				}
			}
			if(ch[i] != '\0')
			{
				str = str+ch[i]+iCnt;
			}
		}
		
		System.out.println(str);
	}

	public static void main(String[] args) {

		String s = "aaaabbbccdabcd";
		
//		count(s);
		count2(s);
	}

	public static void count2(String s1)
	{
		char ch[] = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == '\0') 
			{
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1; j < ch.length; j++) 
			{
				if(ch[i] == ch[j]) 
				{
					count++;
					ch[j] = '\0';
				}
			}
			if(count > 0) 
			{
				System.out.print(ch[i]);
				System.out.print(count);
			}
		}
	}
}
