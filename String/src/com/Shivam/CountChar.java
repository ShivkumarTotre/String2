package com.Shivam;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaaabbbccdabcd";
		
		char ch[] = a.toCharArray();
		
		for(int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == '\0') 
			{
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1; j < ch.length; j++) 
			{
				if(ch[i] == ch[j]) 
				{
					count++;
					ch[j] = '\0';
				}
			}
			if(count > 0) 
			{
				System.out.print(ch[i]);
				System.out.print(count);
			}
		}

	}

}
