package com.lin.ssm.test.DataStructure.串;

public class StringDemo {
	public static void main(String[] args) {
		String str1="abcabcabd";
		String str2="abcabd";
		System.out.println(indexof(str1,str2));
	}
	
	/**
	 * 
	 * @param str1  主串
	 * @param str2  子串
	 * @return
	 */
	public static int indexof(String str1,String str2){
		int m=0;  //当前主串下标
		int n=0;  //当期子串下标
		int i[]=getNext(str2);
		while(m<str1.length()&&n<str2.length()){
			if(n==0||str1.charAt(m)==str2.charAt(n)){
				m++; n++; 
			}
			else { n=i[n]; }
		}
		if(n>=str2.length())
			return m-str2.length();
		else
			return 0;
	}
	
	public static int[] getNext(String str2){
		int[] n=new int[str2.length()+1];
		int i,j;
		i=1;  //子串下标
		j=0;
		n[1]=0;
		while(i<str2.length()){
			if(j==0||str2.charAt(i)==str2.charAt(j)){
				i++; j++;
				n[i]=j;
			}else{
				j=n[j];
			}
		}
		return n;
	}
}
