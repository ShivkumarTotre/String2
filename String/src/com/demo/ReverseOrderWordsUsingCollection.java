package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderWordsUsingCollection {

	public static void main(String[] args) {

// 		Type 1
		String text = "i like this program very much";
		
		String str[] = text.split(" ");
		
		Collections.reverse(Arrays.asList(str));
		System.out.println(String.join(" ", str));
		
// 		By Expanding above code it is be like 
//		String text1 = "i like this program very much";
//		
//		String str2[] = text1.split(" ");
//		
//		ArrayList<String> al = new ArrayList(Arrays.asList(str2));
//		//System.out.println(al);
//		
//		Collections.reverse(al);
//		System.out.println(al);
//		System.out.println(String.join(" ", al));

	}

}
