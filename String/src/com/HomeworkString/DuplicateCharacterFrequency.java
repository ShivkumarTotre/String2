package com.HomeworkString;

public class DuplicateCharacterFrequency {
	
	public static void countFrequency(String s1)
	{
		int iCnt = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			iCnt = 0;
			
			for(int j = i+1; j < s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					iCnt++;
				}
			}
			if(iCnt >= 1)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}

	public static void main(String[] args) {

		String s = "concatenate";
		
		countFrequency(s);
	}

}
