package com.TString;

import java.util.Arrays;
import java.util.Scanner;

public class CommonCharacterStringSort {
	
	public static void commonCharacters(String str1, String str2)
	{
		String cs = "";
		
		for(int i = 0; i < str1.length(); i++)
		{
			for(int j = 0; j < str2.length(); j++)
			{
				if(str1.charAt(i) == (str2.charAt(j)))
				{
					//check elements in string already present
					if(!checkChar(cs, str1.charAt(i)))
					{
						cs = cs + str1.charAt(i);
					}	
					
					break;
				}
			}
		}
		
		System.out.println(cs);
		
		char ch1[] = cs.toCharArray();
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		
	}

	public static boolean checkChar(String s,char ch)
	{
		boolean status = false;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ch)
			{
				status = true;
				break;
			}
		}
		return status;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
     
		System.out.println("Enter First string:");
     
		String st1 = sc.nextLine();
		System.out.println(st1);
     
		System.out.println("Enter Second string:");
     
		String st2 = sc.nextLine();
		System.out.println(st2);
     
		commonCharacters(st1, st2);
	   
	}
}