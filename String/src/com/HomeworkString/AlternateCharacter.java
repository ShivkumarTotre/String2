package com.HomeworkString;

public class AlternateCharacter {
	
	public static void display(String s2)
	{
		char ch[] = s2.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == ' ')
			{
				ch[i] = '#';
			}
			else
			{
				ch[i] = (char) (ch[i]+1);
			}
		}
		
		System.out.println(ch);
	}

	public static void main(String[] args) {

		String s = "Hello World";
		
		display(s);
	}

}
