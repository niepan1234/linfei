package com.lin.ssm.test.DataStructure;

import java.util.LinkedList;

public class ջ��СԪ�� {
	public static void main(String[] args) {
		LinkedList<Integer> A=new LinkedList<Integer>();
		LinkedList<Integer> B=new LinkedList<Integer>();
		int min=999;
		int[] i=new int[]{10,12,7,14,9};
		for(int m=0;m<i.length;m++){
			if(i[m]<min){
				B.push(m);
				min=i[m];
			}
			A.push(i[m]);
		}
		System.out.println("��СԪ����"+A.get(B.pop()));
	}
}
