package com.HomeworkString;

public class SameWordDelete {
	
	public static void character(String sc, String sp)
	{
		char ch[] = sc.toCharArray();
		char ch2[] = sp.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			for(int j = 0; j <ch2.length; j++)
			{
				if(ch[i] == ch2[j])
				{
					ch[i] = '\0';
				}
			}
		}
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] != '\0')
			{
				System.out.print(ch[i]);
			}
		}
	}
	
	public static void string(String sc, String sp)
	{
		if(sc.contains(sp))
		{
			sc = sc.replaceAll(sp, "");
		}
		
		System.out.println(sc);
	}

	public static void main(String[] args) {

		String s = "Country";
		String s1 = "try";
		
		//character(s, s1);
		string(s, s1);
	}

}
