package com.HomeworkString;

public class MostCommonWord {
	
	public static void countRepeated(String s1)
	{
		int iMax = 0;
		int iCnt = 0;
		String var = "";
		
		String str[] = s1.split(" ");
		
		for(int i = 0; i < str.length; i++)
		{
			iCnt = 0;
			for(int j = i+1; j < str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					iCnt++;
				}
			}
			if(iCnt > iMax)
			{
				iMax = iCnt;
				var = str[i];
			}
		}
		
		System.out.println("Most Repeated Word is : "+var);
	}

	public static void main(String[] args) {

		String s = "Java is Most Used Java is Simple";
		
		countRepeated(s);
	}

}
