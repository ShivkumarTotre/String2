package com.MString;

public class ReverseString {
	
//	Using StringBuilder & Store in same
	public static void display(String s1)
	{
		StringBuilder sb = new StringBuilder(s1);
		
		sb = sb.reverse();
		
		System.out.println("Reverse String : "+sb);
	}
	
//	Using StringBuilder & but not Store in same. Store in String
	public static void displayy(String s1)
	{
		StringBuilder sc = new StringBuilder(s1);
		
		String str = sc.reverse().toString();
		
		System.out.println("Reverse String : "+str);
	}

	public static void main(String[] args) {

		String s = "Shivkumar Navnath Totre";
		
		System.out.println("Original String : "+s);

		display(s);
		displayy(s);
	}

}
