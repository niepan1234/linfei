package com.lin.ssm.test.DataStructure.Õü¾È007;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
				sb.append(c);
			}
			if(c>='0'&&c<='9'){
				int num=c-'0';
				int count=i+1;
				while(count<str.length()&&str.charAt(count)>='0'&&str.charAt(count)<='9'){
					num=num*10+str.charAt(i+1)-'0';
					count++;
				}
				for(int m=0;m<num;m++)
					System.out.print(sb.toString());
				sb.setLength(0);
			}
				
		}
		
	}
}
