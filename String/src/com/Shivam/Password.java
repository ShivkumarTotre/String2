package com.Shivam;

import java.util.Scanner;

public class Password {
	
	public static void checkpasseord(String uname, String pass,String username,String password) {
		char ch[]= pass.toCharArray();
		
		
		int count=0;
		int capletter=0;
		int spechar=0;
		for (int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9' ){
				count++;
			}
			else if( ch[i]>='A' && ch[i]<='Z') {
				capletter++;
			}
			else if(ch[i]=='@'|| ch[i]=='#') {
				spechar++;
			}
	
		}
		
	
		if(ch.length>=8) {
			for(int i=0;i<ch.length;i++) {
				if(spechar==0) {
					System.out.println("special character must be present");
					
					break;
				}
				else if(count==0){
						System.out.println("password must contain one digit");
						
						break;
				}
				else if(ch[i]==' ') {
					System.out.println("spaces not allowed");
					
					break;
				}else if(capletter==0) {
					System.out.println("password must have one uppercase letter");
					
					break;
				}
				else {
					if(uname.equals(username) && pass.equals(password)) {
						System.out.println("login sucessfully");
						break;
					}
					else{
						System.out.println("invalid username or password");
						break;
					}
				}
			}
			
		}
		else {
			System.out.println("password must be 8 char long");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="shivam191";
		String password="Shivam@123";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the username");
		String uname=sc.next();
		System.out.println("enter the password");
		String pass=sc.next();
		checkpasseord(uname,pass,username,password);
		sc.close();

	}

}
