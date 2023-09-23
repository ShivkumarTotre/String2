package com.demo;

public class StringScore {
	
	public static int strScore(String str1[], String s2, int len)
	{
		int score = 0, index = 0;
		
		for(int i = 0; i < len; i++)
		{
			if(str1[i] == s2)
			{
				for(int j = 0; j < s2.length(); j++)
				{
					score += s2.charAt(j) - 'a' + 1;
				}
				
				index = i+1;
				
				break;
			}
		}
		
		score = score * index;
		
		return score;
	}

	public static void main(String[] args) {
		
		String str[] = {"Shashank","Sahil","Sanjit","abhinav","Mohit"};
				
		String s1 = "abhinav";
		
		int iLen = str.length;
		
		int score = strScore(str, s1, iLen);
		
		System.out.println(score);
	}

}
