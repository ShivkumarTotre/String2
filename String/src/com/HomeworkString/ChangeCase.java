package com.HomeworkString;

public class ChangeCase {
	
	public static void toggle(String s1)
	{
		char ch[] = {'A','E','I','O','U'};
		char ch2[] = {'a','e','i','o','u'};
		
		char ch1[] = s1.toCharArray();
		
		for(int i = 0; i < ch1.length; i++)
		{
			for(int j = 0; j < ch.length; j++)
			{
				if(ch1[i] == ch[j])
				{
					ch1[i] = (char)(ch1[i]+32);
				}
				else if(ch1[i] == ch2[j])
				{
					ch1[i] = (char)(ch1[i]-32);
				}
			}
		}
		System.out.println(ch1);

	}

	public static void main(String[] args) {

		String s = "Onion";
		
		toggle(s);

	}

}
