package com.Shivam;

public class StringDigitsCount {
	public static void digitCount(String s) {
		int digits = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                digits++;
        }
        System.out.println("Total number of Digits = "+ digits);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "java is no 1 progarmming language";
		 
		 digitCount(str);
	     
	}

}
