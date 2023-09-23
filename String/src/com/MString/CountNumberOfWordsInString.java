package com.MString;

public class CountNumberOfWordsInString {
	
	public static void countWords(String b)
	{
		System.out.println(b.isEmpty());
		
		System.out.println(b.split("\\s").length);
		//System.out.println(b);
		
		//b = b.trim();
		System.out.println(b.split("\\s+").length);
		//System.out.println(b);

	}
	
	public static void countWordss(String b)
	{
		String trimmedLine = b.trim();
		int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;
		//int count = trimmedLine.split("\\s+").length;
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {

		String s = "I Love  Java Programming";
		
		String s1 = " This	is  not   properly formatted		line";
		
		String s3 = "";
		
		//countWords(s);
		//countWords(s1);
		countWordss(s3);//countWordss(s3);
	}
}

// This is For countWords method not for countWordss()
// 2 Tab la 1 consider karti & starting la 1 space asel tar tila pn consider karti & 2 space astil tar 1
// 3 astil tar 2
// shevatchi space consider karat nahi

// This is For countWordss method
// jar line-22 run keli tr output 1 yeil. Mhanjech ("") yat count 1 consider karte 