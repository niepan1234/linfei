package com.lin.ssm.test.DataStructure.排序;

public class BubbleSortDemo {
	
	public static void BubbleSort0(SqList l){
		int i,j;
		for (i = 0; i < l.r.length; i++) {
			for(j=i+1;j<l.r.length;j++)
				if(l.r[i]>l.r[j])
				SqList.swap(l, i, j);
		}
	}
	
	//改进1
	public static void BubbleSort1(SqList l){
		int i,j;
		for (i = 0; i < l.r.length; i++) {
			for(j=l.r.length-1;j>i;j--)
				if(l.r[j]<l.r[j-1])
				SqList.swap(l, j, j-1);
		}
	}
	
	// 优化版   加入flag
	public static void BubbleSort2(SqList l){
		int i,j;
		boolean flag=true;
		for (i = 0; i < l.r.length&&flag; i++) {
			flag=false;
			for(j=l.r.length-1;j>i;j--)
				if(l.r[j]<l.r[j-1]){
					SqList.swap(l, j, j-1);
					flag=true;
				}
		}
	}
	
	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{1,3,2,4,6,5};
		BubbleSort2(l);
		System.out.println(l);
	}
}
