package com.lin.ssm.test.DataStructure.≈≈–Ú;

public class InsertSortDemo {
	
	public static void InsertSort(SqList l){
		int i,j;
		for(i=2;i<l.r.length;i++){
			if(l.r[i]<l.r[i-1]){
				l.r[0]=l.r[i];  //…Ë÷√…⁄±¯
				for(j=i-1;l.r[j]>l.r[0];j--)
					l.r[j+1]=l.r[j];
				l.r[j+1]=l.r[0];
			}
		}
		
	}
	
	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{0,3,2,7,4,5,6};
		InsertSort(l);
		System.out.println(l);
	}
}
