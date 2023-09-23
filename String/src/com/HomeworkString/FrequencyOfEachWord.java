package com.HomeworkString;

public class FrequencyOfEachWord {
	
	public static void countFrequency(String s1)
	{
		String str[] = s1.split(" ");
		int iCnt = 0;
		
		for(int i = 0; i < str.length; i++)
		{
			iCnt = 1;
			
			for(int j = i+1; j < str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]) && str[i] != "")
				{
					iCnt++;
					str[j] = "";
				}
			}
			if(str[i] != "")
			{
				System.out.println(str[i]+" : "+iCnt);
			}
		}
	}

	public static void main(String[] args) {

		String s = "java is Easy and Java is Complex";
		
		System.out.println("String is : "+s);
		
		countFrequency(s);
	}

}
