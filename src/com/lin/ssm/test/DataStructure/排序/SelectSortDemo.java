package com.lin.ssm.test.DataStructure.≈≈–Ú;

public class SelectSortDemo {
	
	public static void SelectSort(SqList l){
		int i,j,min;
		for (i = 0; i < l.r.length; i++) {
			min=i;
			for (j = i+1; j < l.r.length; j++)
				if(l.r[j]<l.r[min])
					min=j;
			if(min!=i)
				SqList.swap(l, i, min);
		}
	}
	
	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{1,2,3,4,5,6};
		SelectSort(l);
		System.out.println(l);
	}
}
