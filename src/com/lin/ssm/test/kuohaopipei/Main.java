package com.lin.ssm.test.kuohaopipei;

import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=Integer.valueOf(sc.next());
		String c=sc.next();
		int i=1;
		int j=1;
		while(true){
			if(number<i) { 
				i-=j*2;
				j-=2;
				break;
				}
			j=j+2;
			i=i+j*2;
		}
		int kong=0;
		for(int m=j;m>=1;m=m-2){
			for(int z=1;z<=kong;z++)
				System.out.print(" ");
			for(int n=1;n<=m;n++){
				System.out.print(c);
			}
			System.out.println();
			++kong;
		}
		kong--;
		for(int m=3;m<=j;m=m+2){
			for(int z=1;z<kong;z++)
				System.out.print(" ");
			for(int n=1;n<=m;n++){
				System.out.print(c);
			}
			System.out.println();
			kong--;
		}
		System.out.print(number-i);
	}
}
