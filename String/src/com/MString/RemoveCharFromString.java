package com.MString;

public class RemoveCharFromString {
	
//	Type 1
	
	public static void removecharacter(String s1, char b)
	{
		s1 = s1.replaceAll(String.valueOf(b), "");
		
		System.out.println(s1);
		System.out.println("-------------------------------------------");
	}
	
//	Type 2
	
	public static void removecharacterr(String s1, char b)
	{
		s1 = s1.replaceAll(String.valueOf(b), String.valueOf('c'));
		
		System.out.println(s1);
		System.out.println("-------------------------------------------");
	}

	public static void main(String[] args) {

		String s = "This is Mike";
		
// 		Type 3
		
//		s = s.replaceAll(String.valueOf('i'), "");	
//		System.out.println(s);

		removecharacter(s, 'i');
		removecharacterr(s, 'i');
		replacecharacter(s, 'i');
	}
	
	// This is additional method use which is of string
	
	public static void replacecharacter(String s1, char b)
	{
		s1 = s1.replace('h', b);
	
		System.out.println(s1);
	}
	// replace method work like replaceAll but in replaceAll argument is String & String
	// but in case of replace argument is character old value & character new value
}
