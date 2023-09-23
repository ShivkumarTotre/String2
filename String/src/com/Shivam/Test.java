package com.Shivam;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s[]= {"i","am","very","samrt"};
		int length=s.length;
		String s1="";
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				s1=s1+s[i].charAt(j);
			}
		}
		System.out.println(s1);
		
		int divide=s1.length()/s.length;

	}

}
