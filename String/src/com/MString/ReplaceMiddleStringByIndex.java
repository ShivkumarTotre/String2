package com.MString;

public class ReplaceMiddleStringByIndex {

	public static void replaceString(String s1[])
	{
		String rev = "";
		
		rev = rev + s1[0];
		
		rev = rev + " ";
		
		for(int i = s1.length-2; i > 0; i--)
		{
			rev = rev + s1[i];
			rev = rev + " ";
		}
			//System.out.println(rev);
		
		rev = rev + s1[s1.length-1];
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		
		String s = "India is Asian Country";
		
		String str[] = s.split(" ");
		//System.out.println(Arrays.toString(str));

		replaceString(str);

	}

}
