package com.Critical;

import java.util.Arrays;

public class ReverseStringDemo3 {
	
	public static void revString(String str)
	{
		String strCpy = str;
		
		str.toLowerCase();
		
		char[] str2 = str.toCharArray();
		
		String str3 = "";
		
		for(int i = str2.length-1; i >= 0; i--)
		{
			if(str2[i] > 'A' && str2[i] < 'Z')		
			{
				str3 = str3 + (char)(str2[i]+32);
			}
			else 
			{
				str3 = str3 + (char)(str2[i]);
			}
		}
				
		str3 = str3.toLowerCase();
				
		char str4[] = str3.toCharArray();
				
		for(int i = 0; i < str2.length; i++)
		{
			if(str2[i] >= 'A' && str2[i] <= 'Z')
			{
				str4[i] = (char)(str4[i]-32);
			}
		}

		System.out.println(str);

		System.out.println(str4);
			
	}
	
	public static void main(String[] args) {
		
		revString("UPPER lower");
		System.out.println("----------------------------------------");
		revString1("Edabit");

	}
	
	public static void revString1(String str)
	{
		String strCpy = str;
		
		str.toLowerCase();
		
		char[] str2 = str.toCharArray();
		
		String str3 = "";
		
		for(int i = str2.length-1; i >= 0; i--)
		{
			if(str2[i] > 'A' && str2[i] < 'Z')		
			{
				str3 = str3 + (char)(str2[i]+32);
			}
			else 
			{
				str3 = str3 + (char)(str2[i]);
			}
		}
		
		str3 = str3.toLowerCase();
		
		char str4[] = str3.toCharArray();
		
		for(int i = 0; i < str2.length; i++)
		{
			if(str2[i] >= 'A' && str2[i] <= 'Z')
			{
				str4[i] = (char)(str4[i]-32);
			}
		}

		System.out.println(str);

		System.out.println(str4);
			
	}
}
