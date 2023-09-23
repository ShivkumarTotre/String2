package com.HomeworkString;

public class SumOfDigit {
	
	public static void sumDigit(String s1)
	{
		int iSum = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
			{
				iSum = iSum + (s1.charAt(i)-48);
			}
		}
		
		System.out.println("Sum of Digit using Ascii is : "+iSum);
	}

	public static void main(String[] args) {

		String s = "Shiv2912";
		
//		sumDigit(s);
//		sumDigit2(s);
		sumDigit3(s);
	}
	
	public static void sumDigit2(String s1)
	{
		int iSum = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(Character.isDigit(s1.charAt(i)))
//			if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
			{
				iSum = iSum + Character.getNumericValue(s1.charAt(i));
			}
		}
		
		System.out.println("Sum of Digit using getNumericValue is : "+iSum);
	}
	
	public static void sumDigit3(String s1)
	{
		int iSum = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
//			if(Character.isDigit(s1.charAt(i)))
			{
				String str = String.valueOf(s1.charAt(i));
				int x = Integer.parseInt(str);
				iSum = iSum + x;
			}
		}
		
		System.out.println("Sum of Digit using valueOf is : "+iSum);
	}

}
