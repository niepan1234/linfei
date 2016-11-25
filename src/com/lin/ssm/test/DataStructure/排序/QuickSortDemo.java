package com.lin.ssm.test.DataStructure.ÅÅĞò;



public class QuickSortDemo {
	
	public static int QuickSort(SqList l,int start,int end){
		int i,j,x;
		i=start;
		j=end;
		x=l.r[start];
		while(i<j){
			while(i<j&&l.r[j]>=x)
				j--;
			if(i<j){
				l.r[i]=l.r[j];
				i++;
			}
			while(i<j&&l.r[i]<x)
				i++;
			if(i<j){
				l.r[j]=l.r[i];
				j--;
			}
		}
		l.r[i]=x;
		return i;
	}
	
	public static void Sort(SqList l,int start,int end){
		if(start<end){
			int i=QuickSort(l,start,end);
			Sort(l,start,i-1);
			Sort(l,i+1,end);
		}
	}
	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{0,2,3,6,5,7,9,8};
		Sort(l,0,l.r.length-1);
		System.out.println(l);
	}
}
