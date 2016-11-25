package com.lin.ssm.test.DataStructure;

import java.util.Arrays;

public class FindMissNumber {
	public static void main(String[] args) {
		int a[]=new int[]{1,1,2,2,3,4,4,5,5,6};
		System.out.println(Arrays.toString(getMissTwoNum(a)));
		/*int index="12424343132".lastIndexOf("1");
		System.out.println(index);*/
		/*System.out.println(9>>2);*/
	}
	
	public static int getMissNum(int[] arr){
		int result=0;
		for (int i : arr) {
			result^=i;
		}
		return result;
	}
	
	public static int[] getMissTwoNum(int[] arr){
		int a=0;
		int b=0;
		String result=Integer.toBinaryString(getMissNum(arr));
		int lastNum=result.length()-result.lastIndexOf("1")-1;
		for (int i : arr) {
			a=(i<<lastNum)%2==0?a^i:a;
			b=(i<<lastNum)%2==1?b^i:b;
		}
		return new int[]{a,b};
	}
}
