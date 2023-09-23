package com.demo;

public class SentenceWord {
	
	public static void display(String s3, String s4)
	{
		char ch[] = s3.toCharArray();
		char ch2[] = s4.toCharArray();
		
		int iNo = ch2.length;
		
		int iCnt = 0;
		int iCnt2 = 0;
		int ii = 0;
		
		for(int i = 0; i < ch2.length; i++)
		{
			for(int j = 0; j < ch.length; j++)
			{
				if(ch2[i] == ch[j] && j != ii)
				{
					iCnt++;
					ii = j;
				}
			}
			if(iCnt >= 1)
			{
				iCnt2++;
			}
		}
		if(iCnt2 == iNo)
		{
			System.out.println("Yes Can be Formed");
		}
		else
		{
			System.out.println("No");
		}
	}

	public static void main(String[] args) {

		String s = "THE SKY IS LIMIT";	
		
		String s1 = "SIT";
		
		display(s, s1);
	}

}
