package com.demo;

import java.util.Arrays;

public class ReverseOrderWords {
	
	public static void display(String s1)
	{
		String str[] = s1.split(" ");
		
//		Type 1
		String str2[] = new String[str.length];
		
		int j = 0;
		
		for(int i = str.length-1; i >= 0; i--)
		{
			str2[j] = str[i];
			j++;
		}
		
		System.out.println(Arrays.toString(str2));
		System.out.println("------------------------------------------");

		
		String s2 = "";
				
// 		Type 2
		for(int i = 0; i < str2.length; i++)
		{
			s2 = str2[i]+" ";
			System.out.print(s2);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
// 		Type 3
		
		String s3 = "";
		
		for(int i = str.length-1; i >= 0; i--)
		{
			s3 = s3+str[i]+" ";
		}
		
		System.out.println(s3.substring(0, s3.length()-1));
	}

	public static void main(String[] args) {

		String s = "geeks quiz practice code";
		
		display(s);
	
	}

}
