package com.Shivam;

public class Palindrome {
	
	public static void checkpalindrome(String s) {
		String rev="";
			for (int j=s.length()-1;j>=0;j--) {
				rev= rev+s.charAt(j);
			}
			if(rev.equals(s)) {
				System.out.println("palindrome");
				
			}else {
				System.out.println("not pallindrome");
			}
		
	}
	
	public static void countfreq(String s) {
		char ch[]=s.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+" :"+count);
		}
		
	}
	
	public static void duplicatechar(String s) {
		char ch[]=s.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>1) {
			System.out.println(ch[i]+" :"+count);
			}
		}
		
	}
	public static void uniquechar(String s) {
		char ch[]=s.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count==1) {
			System.out.println(ch[i]+" :"+count);
			}
		}
	}
	public static void replacevowel(String s) {
		String s1=s.toLowerCase();
		char ch[]= s1.toCharArray();
		char vow[]= {'a','e','i','o','u'};
		for (int i=0;i<ch.length;i++) {
			for (int j=0;j<vow.length;j++) {
				if(ch[i]==vow[j]) {
					for( char chr=33;chr<=47;chr++) {
						
						ch[i]=chr;
					}	
				}
			}
			System.out.print(ch[i]);	
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kihuhk";
		checkpalindrome(str);
		countfreq(str);
		duplicatechar(str);
		uniquechar(str);
		replacevowel(str);

	}

}
