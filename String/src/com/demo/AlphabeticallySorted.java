package com.demo;

import java.util.Arrays;

public class AlphabeticallySorted {
	
	public static void display(String s1[])
	{
		int iCnt = 0;
		
		for(int i = 0; i < s1.length; i++)
		{
			iCnt = 0;
			
			for(int j = 0, k = j+1; j < s1[i].length() && k < s1[i].length(); j++, k++)
			{
				if(s1[i].charAt(j) <= s1[i].charAt(j+1))
				{
					iCnt++;
				}
				else
				{
					break;
				}
			}
			if(iCnt >= 3)
			{
				System.out.println(s1[i]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "She sells sea shells by the sea shore";
		
		str = str.toLowerCase();
		
		String str2[] = str.split(" ");
		
		display(str2);
	}

}
