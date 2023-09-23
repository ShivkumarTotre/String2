package com.MString;

import java.util.*;

public class BiggestProductSeries {
	
	public static void onextel(String s1)
	{
		int x = 0;
		int y = 0;
		int k = 0;
		int iMax = 0;
		int arr[] = new int[5];
		
		for(int i = 0; i <= s1.length()/2; i++)
		{	
			x = Character.getNumericValue(s1.charAt(i));
			
			for(int j = i+1; j < i+3; j++)
			{	
				y = Character.getNumericValue(s1.charAt(j));
				
				x = x*y;
				arr[k] = x;
			}
			k++;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < k; i++)
		{	
			iMax = arr[0];
			
			if(iMax < arr[i])
			{
				iMax = arr[i];
			}
		}
		
		System.out.println("Biggest Series of Product from String : "+iMax);
	}

	public static void main(String[] args) {

		String s = "63915";
		
		onextel(s);

	}

//	public static void findMaxSeries(String num,int span)
//	{
//		Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter number");
//    	String num=sc.next();
//    	System.out.println("Enter span");
//		int span=sc.nextInt();
//		findMaxSeries(num, span);
	
//		String sereies1="";
//		String sereies2="";
//		String sereies3="";
	
//		for(int i = 0; i < span; i++)
//		{
//			sereies1=sereies1+num.charAt(i);
//		}
//		for(int i = 1; i < span+1; i++)
//		{
//			sereies2=sereies2+num.charAt(i);
//		}
//		for(int i=2;i<span+2;i++)
//		{
//			sereies3=sereies3+num.charAt(i);
//		}
//		
//		System.out.println((sereies1));
//		System.out.println((sereies2));
//		System.out.println((sereies3));
//		int s1Mul=1;
//		int s2Mul=1;
//		int s3Mul=1;
//		 for(int i=0;i<span;i++)
//		 {
//			 s1Mul=s1Mul*Character.getNumericValue(sereies1.charAt(i));
//			 s2Mul=s2Mul*Character.getNumericValue(sereies2.charAt(i));
//			 s3Mul=s3Mul*Character.getNumericValue(sereies3.charAt(i));
//		 }
	
//		 int largestSeries=0;
	
//		 if(s1Mul> s2Mul&&s1Mul>s3Mul)
//		 {
//			 largestSeries=s1Mul;
//		 }
//		 else if(s2Mul> s1Mul&&s2Mul>s3Mul)
//		 {
//			 largestSeries=s2Mul;
//		 }
//		 else
//		 {
//			 largestSeries=s3Mul;
//		 }
//		 System.out.println("largest series of the product of number "+num+" is "+largestSeries);
//	}
//	   public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter number");
//	    String num=sc.next();
//	    System.out.println("Enter span");
//		int span=sc.nextInt();
//		findMaxSeries(num, span);
//	}
}
