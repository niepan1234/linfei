package com.lin.ssm.test.DataStructure.����;

import java.util.Arrays;

public class SqList {
	int r[]=new int[101];  //r[0]�����ڱ�����ʱ����
	int length;				 //��¼˳���ĳ���
	
	public static void swap(SqList l,int i,int j)
	{
		l.r[i]=l.r[i]^l.r[j];
		l.r[j]=l.r[i]^l.r[j];
		l.r[i]=l.r[i]^l.r[j];
	}
	
	
	@Override
	public String toString() {
		return "SqList [r=" + Arrays.toString(r) + ", length=" + r.length + "]";
	}
	

	public SqList() {
		super();
		this.length=r.length;
	}


	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{1,2,3,4,5,6};
		swap(l,2,4);
		System.out.println(l);
	}
}
