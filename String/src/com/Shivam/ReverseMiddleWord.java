package com.Shivam;

import java.util.Arrays;

public class ReverseMiddleWord {
	public static void reverse(String s) {
		String rev[]=s.split(" ");
		String r="";
		
		for(int i=1;i<3;i++) {
			for(int j=rev[i].length()-1;j>=0;j--) {
				r=r+rev[i].charAt(j);
			}
			r=r+" ";			
		}
		String rev1[]=r.split(" ");
		int j=0;
		for(int i=1;i<rev.length-1;i++) {
				rev[i]=rev1[j];
				j++;
		}
	System.out.println(Arrays.toString(rev));

	}

	public static void reversemiddle(String s) {
		String ss[]=s.split(" ");
		for(int i=1;i<ss.length-1;i++) {
			String rev="";
			for(int j=ss[i].length()-1;j>=0;j--){
				rev=rev+ss[i].charAt(j);
			}
			ss[i]=rev;
		}
		for(String a:ss) {
			System.out.print(a+" ");
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "India is my Country";
		reverse(s);
		reversemiddle(s);
	}

}
