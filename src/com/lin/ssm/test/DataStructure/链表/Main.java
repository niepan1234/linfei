package com.lin.ssm.test.DataStructure.Á´±í;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pinyin[]=new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		String num=sc.next();
		String daan=String.valueOf(sum(num));
		for(int i=0;i<daan.length();i++){
			System.out.print(pinyin[Integer.valueOf(daan.charAt(i)+"")]);
			if(i!=(daan.length()-1))
				System.out.print(" ");
		}
	}
	
	public static int sum(String num){
		int sum=0;
		char c[]=num.toCharArray();
		for (char d : c) {
			sum+=Integer.valueOf(d+"");
		}
		return sum;
	}
}
