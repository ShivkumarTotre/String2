package com.MString;

public class PallindromeString {
	
//	For Case insensitive
	
	public static void displayI(String s1)
	{
		int iLength = s1.length();
		boolean bFlag = true;
		
		for(int i = 0; i < iLength/2 /*(s1.length()/2)*/; i++)
		{
			if(s1.charAt(i) != s1.charAt(iLength - i - 1))
			{
				bFlag = false;
				break;
			}
		}
		
		System.out.println("String "+s1+" Pallindrome : "+bFlag);
	}
	
//	For Case Sensitive
	
	public static void displayS(String s1)
	{
		int iLength = s1.length();
		boolean bFlag = true;
		
		for(int i = 0; i < iLength/2 /*(s1.length()/2)*/; i++)
		{
			if(s1.charAt(i) != s1.charAt(iLength - i - 1))
			{
				char b = (char) (s1.charAt(i)+32);
				
				char c = (char) (s1.charAt(iLength-i-1));
				
				if(b != c)
				{
					bFlag = true;
					break;
				}
			}
		}
		
		System.out.println("String "+s1+" Pallindrome : "+bFlag);
	}

	public static void main(String[] args) {

		String s = "Shiv";
		String s1 = "radar"; // s1 = "level";
		String s2 = "radaR";
		
		//display(s);
		displayI(s1);
		
		displayS(s2);

	}

}
