package com.lin.ssm.test.DataStructure.¶Ñ;

public class Heap {
	private static final int maxSize=1001;
	private static final int minSize=-10001;
	private int[] H=new int[maxSize];
	private int size;
	
	public void create(){
		size=0;
		H[0]=minSize;  //ÉèÖÃ¸ÚÉÚ
	}
	
	public void insert(int x){
		int i;
		for(i=++size;H[i/2]>x;i/=2)
			H[i]=H[i/2];
		H[i]=x;
	}
	
	public int[] getH(){
		return H;
	}
}
