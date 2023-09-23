package com.SSMCodes;

import java.util.Arrays;

public class LeftRightRotation {
	
	public static void leftRotate(String s1)
	{
		int iLength = s1.length();
		int iCnt = 0;
		
		String ch[] = s1.split("");
		
		String s = "";
		
		for(int i = 0; i < ch.length; i++)
		{
			s = s + ch[i];
		}
		s = s + " ";
		
		for(int i = 1; i < ch.length; i++)
		{
			iCnt++;
			s = s + ch[i];
		}
		s = s + ch[ch.length-iCnt-1];
		s = s + " ";
		
		iCnt = 0;
		for(int i = 2; i < ch.length; i++)
		{
			iCnt++;
			s = s + ch[i];
		}
		s = s + ch[ch.length-iCnt-2];
		s = s + ch[ch.length-iCnt-1];
		s = s + " ";
	
	}
	
	public static void rightRotate(String s1)
	{
		int iLength = s1.length();
		int iCnt = 0;
		
		String ch[] = s1.split("");
		
		String s = "";
		
		for(int i = 0; i < ch.length; i++)
		{
			s = s + ch[i];
		}
		s = s + " ";
		
		for(int i = 1; i < ch.length; i++)
		{
			iCnt++;
			s = s + ch[i];
		}
		s = s + ch[ch.length-iCnt-1];
		s = s + " ";
		
		iCnt = 0;
		for(int i = 2; i < ch.length; i++)
		{
			iCnt++;
			s = s + ch[i];
		}
		s = s + ch[ch.length-iCnt-2];
		s = s + ch[ch.length-iCnt-1];
		s = s + " ";
	}

	public static void main(String[] args) {

		String s = "abc";
		
		leftRotate(s);
//		rightRotate(s);
	}

}
