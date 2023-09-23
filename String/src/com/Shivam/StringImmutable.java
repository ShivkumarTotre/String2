package com.Shivam;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		s1.concat(" programs");
		System.out.println(s1);
		
		String s2=new String("java");
		//s2=s2.concat(" programs");
		System.out.println(s2);
		
		System.out.println(s1==s2);				//check the both reference object is same or not
		System.out.println(s1.equals(s2));      //check the value in the String is same or not
		System.out.println(s1.compareTo(s2));  //return int value
		
//		s1>s2   positive value
//		s1<s2   negative value
//		s1==0   0
		

	}

}
