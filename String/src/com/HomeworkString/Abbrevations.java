package com.HomeworkString;

public class Abbrevations {
	
	public static void display(String s)
	{
		String s1[] = s.split(" ");
		
		String s2 = "";
		
		for(int i = 0; i < s1.length-1; i++)
		{
			s2 = s2+s1[i].charAt(0)+".";
		}
		
		System.out.println(s2+s1[s1.length-1]);
	}
	
	public static void display1(String s)
	{
		String s2[] = s.split(" ");
		
		String s3 = "";
		
		for(int i = 0; i < s2.length-1; i++)
		{
			s3 = s3+s2[i].charAt(0)+". ";
		}
		
		System.out.println(s3+s2[s2.length-1]+".");
	}
	
	public static void display3(String s1)
	{
		String s[] = s1.split(" ");
		String str = "";
//		int k = (s[s.length-1]).length();
		String s2 = s[s.length-1];
		System.out.println(s2);
				
		for(int i = 0; i < s.length-1;i++)
		{
			str = str+s[i].charAt(0)+".";
		}
		
		for(int i = 0; i < (s[s.length-1]).length(); i++)
		{
			str = str+(s[s.length-1]).charAt(i);
		}
		
		System.out.println(str);
	}

	public static void main(String[] args) {

		String s1 = "Shivkumar Navnath Totre";
				
		display(s1);
		//display1(s1);
		//display3(s1);
	}

}
