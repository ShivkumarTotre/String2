package com.MString;

import java.util.Arrays;

public class ReverseStringExcpetFirstLast {
	
	public static void reverseString(String s1[])
	{
		String rev = "";
		
		rev = rev + s1[0];
		
		rev = rev + " ";
		
		for(int i = 1; i < s1.length-1; i++)
		{
			for(int j = s1[i].length()-1; j >= 0; j--)
			{
				rev = rev + s1[i].charAt(j);
			}
			
			rev = rev + " ";
			//System.out.println(rev);
		}
		
		rev = rev + s1[s1.length-1];
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {

		String s = "India is Asian Country";
		
		String str[] = s.split(" ");
		//System.out.println(Arrays.toString(str));

		reverseString(str);

	}

}
