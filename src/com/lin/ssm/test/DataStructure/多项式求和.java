package com.lin.ssm.test.DataStructure;

public class 多项式求和 {
	public static void main(String[] args) {
		int n=9;
		int[] arr=new int[]{1,1,1,1,2,2,2,2,2,2};
		int x=100;
		long start=System.currentTimeMillis();
		//System.out.println(getMultiData(x, arr, n));
		for(int i=0;i<10000;i++){
			getMultiData2(x, arr, n);
		}
		long end=System.currentTimeMillis();
		System.out.println("执行时间为:"+(end-start)+" ms");
	}
	
	public static int getMultiData(int x,int[] arr,int n){
		int result=arr[n];
		for(int i=n;i>0;i--){
			result=(result)*x+arr[i-1];
		}
		return result;
	}
	
	public static int getMultiData2(int x,int[] arr,int n){
		int result=0;
		for(int i=0;i<n;i++){
			result+=arr[i]*Math.pow(x, i);
		}
		return result;
	}
	
}
