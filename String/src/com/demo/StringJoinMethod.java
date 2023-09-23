package com.demo;

public class StringJoinMethod {
	
	public static void main(String[] args) {

		String s1 = String.join(" < ", "Four", "Five", "Six", "Seven");
		  
        System.out.println(s1);
        
        String s2 = String.join("  ", "My", "name", "is", "Niraj", "Pandey");
        
		System.out.println(s2);
        
		String s3 = String.join("-> ", "Wake up", "Eat","Play", "Sleep", "Wake up");

		System.out.println(s3);
	}

}
