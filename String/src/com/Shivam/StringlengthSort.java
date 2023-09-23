package com.Shivam;

import java.util.Arrays;

public class StringlengthSort {
	
	public static void stringLengthSort(String []st) {
		for (int i=0;i<st.length;i++) {
			for (int j=i+1;j<st.length;j++) {
				if(st[i].length()>st[j].length()){
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
		System.out.println("After sort");
		System.out.println(Arrays.toString(st));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"java","c++","php","c#","c","Angular"};
		System.out.println("before sort");
		System.out.println(Arrays.toString(s));
		StringlengthSort.stringLengthSort(s);
		

	}

}
