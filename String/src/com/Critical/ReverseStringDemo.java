package com.Critical;

public class ReverseStringDemo {
	
	public static void display(String s1)
	{
		String s[] = s1.split(" ");
		char ch[] = s1.toCharArray();
		
		String s2 = "";
		int iCnt = 0;
		
		int iNo = s.length;
		
		if(iNo == 1)
		{
			for(int j = ch.length-1; j >= 0; j--)
			{
				if(j == ch.length-1)
				{
					s2 = s2 + ch[j];
				}
				else if(j == 0)
				{
					s2 = s2 + ch[j];
				}
				else
				{
					s2 = s2 + ch[j];
				}
			}
			
			s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1).toLowerCase();
			System.out.println(s2);
		}
	}

	public static void main(String[] args) {
		
		String s = "Edabit";
		String s1 = "UPPER lower";
				
//		display(s);
		display1(s1);

	}
	
	public static void display1(String s1)
	{
		s1 = s1.toLowerCase();
		String s[] = s1.split(" ");
		char ch[] = s1.toCharArray();
		
		String s2 = "";
		int iCnt = 0;
		int iCnt2 = 0;
		
		int i = 0;
		int iNo = s[i].length();
		
		for(int j = 0; j < ch.length; j++)
		{
			if(iCnt < iNo)
			{
				iCnt++;
			}
			
			if(ch[j] == ' ')
			{
				iCnt2++;
			}
			
			if(iCnt2 >= 1)
			{
				iCnt2++;
			}
		}
				
		if(iNo >= 1)
		{
			for(int j = ch.length-1; j >= 0; j--)
			{
				s2 = s2 + ch[j];
			}
			
			s2 = s2.substring(0, iCnt).toUpperCase() + s2.substring(iCnt).toLowerCase();
			System.out.println(s2);
		}
	}

}
