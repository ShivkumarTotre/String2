package com.MString;

import java.util.Arrays;

public class DivideString {
	
	public static void display(String s1, int iValue)
	{
		int iLength = s1.length();
		
		int iNo = iLength / iValue;
		
		if(iLength % iNo != 0)
		{
			System.out.println("Cannot divide into Equal Parts");
		}
		else
		{
			String str[] = new String[iNo];
			
			int index = 0;
			
			for(int i = 0; i < iLength; i+= iValue)
			{
				System.out.println(i);
				str[index] = s1.substring(i, i+iValue);
				index++;
			}
			
			System.out.println(Arrays.toString(str));
		}
	}

	public static void main(String[] args) {

		String s = "IamVerySmart1";
		
		int iNo = 3;
		
		// calculating the no. of characters to be added
		
		if(s.length() % iNo != 0)
		{
			int x = iNo - (s.length() % iNo);
			System.out.println(x);
			
			for(int i = 0; i < x; i++)
			{
				s = s.concat("#");
			}
		}
		System.out.println(s);
		
		display(s, iNo);

	}

}
