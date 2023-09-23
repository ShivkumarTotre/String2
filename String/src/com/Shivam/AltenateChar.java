package com.Shivam;

public class AltenateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				ch[i]='#';
			}
			else {
			ch[i]=(char) (ch[i]+1);
			}
			System.out.print(ch[i]);
		}

	}

}
