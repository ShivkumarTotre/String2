package com.Shivam;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is progamming language";
		reverseword2word(s);
		reversemiddle(s);

	}
	
	public static void reverseword2word(String s) {
		// TODO Auto-generated method stub
		String str[]=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	
	}

	public static void reversemiddle(String s) {
		// TODO Auto-generated method stub
		String str[]=s.split(" ");
		String reverse="";
		for(int i=1;i<str.length-1;i++ ) {
			for(int j=str[i].length()-1;j>=0;j--) {
				reverse=reverse+str[i].charAt(j);
			}
			str[i]=reverse;
		}
		for(String rev:str) {
			System.out.print(rev+" ");
		}
		
		
	}
	
	

}
