package com.Shivam;

import java.util.Arrays;

public class SplitStringEqually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"i","am","very","smart"};
		String str=String.join("", s);
		int noofchar=5;
		if(str.length()%noofchar!=0) {
			int charadd=noofchar-(str.length()%noofchar);
			for(int i=0;i<charadd;i++) {
				str=str.concat("#");
			}

		}
		System.out.println(str);
		splitstring(str,noofchar);
	}

	public static void splitstring(String s, int noofchar) {
		int parts=s.length()/noofchar;
		System.out.println(parts);
		String ss[]= new String[parts];
		if(s.length()%parts!=0) {
			System.out.println("connot divide String equally");
		}
		else {
			int idx=0;
			for(int i=0;i<s.length();i=i+noofchar) {
				ss[idx]=s.substring(i,i+noofchar);
				idx++;
			}
		}
		System.out.println(Arrays.toString(ss));
	
	}

}
