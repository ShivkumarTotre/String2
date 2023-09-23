package com.demo;

public class HashCodeDemo {

	public static void main(String[] args) {

		String str1 = new String("Java");
		String str2 = new String("Java");
		
		String s = "Angular";
		String s2 = "Angular";
		String s1 = "JavaScript";
		String s3 = "Python";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println("-------------------------------------");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("--------------------------------------");
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("===============================================");
		
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("---------------------------------------");

		System.out.println(str1.hashCode() == str2.hashCode());
		
		System.out.println(str1.hashCode() == s1.hashCode());
	}

}
