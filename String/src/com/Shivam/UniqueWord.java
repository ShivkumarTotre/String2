package com.Shivam;

public class UniqueWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my country and i love my country";
		
		uniquewords(s);

	}
	private static void uniquewords(String s) {
		String s1=s.toLowerCase();
		String s2[]=s1.split(" ");
		
		for (int i=0;i<s2.length;i++) {
			int count=1;
			boolean isvisited=false;
			for (int j=i-1;j>=0;j--) {
				if(s2[i].equals(s2[j])) {
					isvisited=true;
					break;
				}
				
			}
			if(isvisited==false) {
				for(int k=i+1;k<s2.length;k++) {
					if(s2[i].equals(s2[k])) {
						count++;
					}
				}
			}
			if(count==1) {
				System.out.print(s2[i]+" ");
			}
		}
		
	}

}
