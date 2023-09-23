package com.Shivam;

public class DigitSum {
	
	public static void sumofdigit(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i)))
		{
			sum=sum+Character.getNumericValue(s.charAt(i));		
			}
		}
		System.out.println(sum);
	}
	
	public static void digitsum(String s) {
		int sum=0;
		
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				String str =String.valueOf(s.charAt(i));
				int y=Integer.parseInt(str);
				sum=sum+y;
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		
		String s="shiavm191";
		sumofdigit(s);
		digitsum(s);

	}

}
