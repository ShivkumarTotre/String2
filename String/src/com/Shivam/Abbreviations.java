package com.Shivam;

public class Abbreviations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shivam Shrimant Kumbhar";
		show(name);

	}

	public static void show(String name) {
		String s[]=name.split(" ");
		String abb="";
		for (int i=0;i<s.length-1;i++) {
			abb=abb+s[i].charAt(0)+ ". ";
			
		}
		System.out.println(abb+s[s.length-1]+".");

	}

}
