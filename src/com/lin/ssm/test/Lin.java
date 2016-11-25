package com.lin.ssm.test;

public class Lin {
	public static void main(String[] args) {
		fun3();
	}
	
	public static void fun1(){
		int[] n=new int[]{1,3,2,4,5,6,7,-11,12,-2};
		int sum=0;
		int max=-1;
		int min=999;
		int maxIndex=-1;
		int minIndex=-1;
		for (int i = 0; i < n.length; i++) {
			if(n[i]>max){ max=n[i]; maxIndex=i;}
			if(n[i]<min) { min=n[i]; minIndex=i;}
			sum+=n[i];
		}
		System.out.println("max="+max+" min="+min+" maxIndex="+maxIndex+" minIndex="+minIndex+" sum="+sum);
	}
	
	public static void fun2(){
		String name="My name is Networkcrazy";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.split(" ")[0]);
		System.out.println(name.indexOf("crazy"));
	}
	
	public static void fun3(){
		char[] str=new char[]{'A','B','C','D'};
		for (char c : str) {
			if(((c!='A'?1:0)+(c=='C'?1:0)+(c=='D'?1:0)+(c!='D'?1:0))==3)
				System.out.println(c);
		}
	}
}
