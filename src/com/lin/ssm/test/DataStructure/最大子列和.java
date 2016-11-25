package com.lin.ssm.test.DataStructure;

public class 最大子列和 {
	public static void main(String[] args) {
		int arr[]=new int[]{1,-1,2,3,4,-2};
		System.out.println(maxZiListSum(arr));
	}
	
	public static int maxListSum(int[] arr){
		int result=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int m=i;m<=j;m++){
					sum+=arr[m];
				}
				if(sum>result)
					result=sum;
			}
		}
		return result;
	}
	
	public static int maxZiListSum(int[] arr){
		int maxSum=0;
		int thisSum=0;
		for(int i=0;i<arr.length;i++){
			thisSum+=arr[i];
			if(thisSum<0)  thisSum=0;
			if(thisSum>maxSum)  maxSum=thisSum;
		}
		return maxSum;
	}
}
