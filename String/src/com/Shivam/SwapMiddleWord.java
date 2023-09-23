package com.Shivam;

import java.util.Arrays;

public class SwapMiddleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="I am very Smart";
		swapword(ss);

	}

	public static void swapword(String ss) {
		// TODO Auto-generated method stub
		String str[]=ss.split(" ");
		String revmiddle=str[0]+" ";
		
			for(int j=str.length-2;j>0;j--) {
				revmiddle=revmiddle+str[j]+" ";
				
			}
			revmiddle=revmiddle+str[str.length-1];
		
		System.out.println(revmiddle);
		
	}

}
