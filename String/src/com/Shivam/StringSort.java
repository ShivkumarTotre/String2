package com.Shivam;

import java.util.Arrays;

public class StringSort {
	
	public void stringsorting(String str[]) {
		
		for (int i=0;i<str.length;i++) {
			for (int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])<0) {
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("After sort");
		System.out.println(Arrays.toString(str));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"shivam","uday","Prajwal","rohan","ayush"};
		
		System.out.println("before sort");
		System.out.println(Arrays.toString(str));
	
		StringSort ss= new StringSort();
		ss.stringsorting(str);

	}

}
