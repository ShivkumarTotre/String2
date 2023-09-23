package com.MString;

import java.util.Arrays;

public class ReverseOneByOneString {
	
	public static void reverseString(String s1[])
	{
		String rev = "";
		
		for(int i = 0; i < s1.length; i++)
		{
			for(int j = s1[i].length()-1; j >= 0; j--)
			{
				rev = rev + s1[i].charAt(j);
			}
			
			rev = rev + " ";
			//System.out.println(rev);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		String s = "India is Asian Country";
		
		String str[] = s.split(" ");
		//System.out.println(Arrays.toString(str));

		reverseString(str);
		
		//reverseByBuffer(str);
	}
	
	public static void reverseByBuffer(String str[])
	{
		for(int i = 0; i < str.length; i++)
		{
			StringBuffer st = new StringBuffer(str[i]);
			System.out.print(st.reverse()+" ");
		}
	}
	// This method is of Guru
}
