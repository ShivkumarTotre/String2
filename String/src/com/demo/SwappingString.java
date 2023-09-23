package com.demo;

public class SwappingString {
	
	// This logic is different with taking third variable
	public static void display(String s, String t)
	{
		char ch1[] = new char[t.length()];
		char ch2[] = new char[s.length()];
						
		s = s+t;
		t = t+s;
		
		char ch3[] = s.toCharArray();
		char ch4[] = t.toCharArray();
				
		for(int i = 0, j = 0; i < ch3.length && j < ch1.length; i++)
		{
			if(i < ch2.length)
			{
				ch3[i] = '\0';
			}
			
			if(i >= ch2.length)
			{
				ch1[j] = ch3[i];
				j++;
			}
		}
		System.out.print("Updated X is : ");
		System.out.print(ch1);
		System.out.println();
		
		for(int i = 0, j = 0; i < ch4.length && j < ch2.length; i++)
		{
			if(i < ch1.length)
			{
				ch4[i] = '\0';
			}
			
			if(i >= ch1.length)
			{
				ch2[j] = ch4[i];
				j++;
			}
		}
		System.out.print("Updated Y is : ");
		System.out.print(ch2);
	}

	public static void main(String[] args) {

		String x = "Saturday";
		String y = "Sunday";
		
//		display(x, y);
		
		x = x+y;
		x = y+x;
		
		
//		This logic is for Without using Third Variable
		
		//System.out.println(x);							//x = SaturdaySunday
		//System.out.println(x.length()-y.length());		//14-6=8
		
		y = x.substring(0,x.length()-y.length());		//x.substring(0,8) i.e Saturday
		
		System.out.println(y);
		
		x = x.substring(y.length());
		// x = (SaturdaySunday) --> x.substring(8) i.e so 8 chya pudhche store honar i.e Sunday
		
		System.out.println("After Swapping : \n"+"x = "+x+"\ny = "+y);
		
	}

}
