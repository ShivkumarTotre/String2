package com.demo;

public class EqualString {
	
	public static void divideEqually(String s1)
	{
		int iLength = s1.length();
		int iNo = 0;
		
		if(iLength % 2 != 0 && iLength % 3 == 0)
		{
			for(int i = 0; i < iLength; i+=3)
			{
				for(int j = i; j < ((iLength/3)+i); j++)
				{
					System.out.print(s1.charAt(j));
				}
				System.out.println();
			}
		}
		else
		{			
			if(iLength % 2 == 0)
			{
				iNo = iLength / 2;
			}
			
			for(int i = 0; i < iLength; i+=iNo)
			{
				for(int j = i; j < ((iLength/2)+i); j++)
				{
					System.out.print(s1.charAt(j));
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		String s = "Shivkuma";
		
		divideEqually(s);
	}

}
