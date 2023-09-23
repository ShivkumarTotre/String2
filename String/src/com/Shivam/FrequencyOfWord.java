package com.Shivam;

import java.util.Arrays;

public class FrequencyOfWord {
	
	public static void eachWordFrequency(String s[]) {
		for (int i=0;i<s.length;i++) {
			if(s[i]=="visited") {
				continue;
			}
			int count=1;
			for (int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					count++;
					s[j]="visited";
				}
			}
			System.out.println(s[i]+" "+count);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is Easy and Java is Copmlex";
		String str1=str.toLowerCase();
		String st[]=str1.split(" ");
		System.out.println(Arrays.toString(st));
		eachWordFrequency(st);

	}

}
