package com.Shivam;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="shivama";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(1, 3)); //printing only 1st and 2nd index
		
		System.out.println(s.contains("hi"));
		
		System.out.println(s.indexOf('v'));
		
		System.out.println(s.indexOf('a', 5));  //given index of char a after 5 index
		
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.toLowerCase()+" "+s.toUpperCase());
		
		System.out.println(s.isEmpty());
		
		//String s1=null;
		//System.out.println(s1.isEmpty()); //gives null pointer exception
		
		String s2="";
		System.out.println(s2.isEmpty());
		
		System.out.println(s.replace('a', 'k'));
		
		System.out.println(s.replace('k', 'a'));
		
		String s3="Shivam";
		
		System.out.println(s.equalsIgnoreCase(s3));
		
		char ch[]=s.toCharArray();
		
		System.out.println(Arrays.toString(ch));

	}

}
