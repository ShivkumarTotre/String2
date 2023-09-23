package com.SSMCodes;

public class ReverseOdd {
	
	public static void reverseOddString(String s1)
	{
		String str = "";
		
		char ch[] = s1.toCharArray();
		
		if(s1.length()%2 != 0)
		{
			for(int i = ch.length-1; i >= 0; i--)
			{
				str = str + ch[i];
			}
			
			System.out.println(str);
		}
		else
		{
			System.out.println("Given String is Not Odd : "+s1);
		}
		
	}

	public static void main(String[] args) {

		String s = "Banana";
		
		reverseOddString(s);
	}

}
