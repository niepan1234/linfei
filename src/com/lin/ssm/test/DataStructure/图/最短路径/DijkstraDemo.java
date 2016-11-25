package com.lin.ssm.test.DataStructure.ͼ.���·��;


public class DijkstraDemo {
	static int Pathmatirx[]=new int[100];  //���ڴ洢���·���±������
	static int ShortPathTable[]=new int[100];  //���ڴ洢���������·����Ȩֵ��
	
	
	
	static void ShortestPath_Dijkstra(int[][] n,int v0){
		int length=n.length;
		boolean isLable[]=new boolean[length];
		int indexs[]=new int[length];
		int indexsCopy[]=new int[length];
		indexs=n[v0];
		indexsCopy=n[v0];
		isLable[0]=true;
		while(!isLable[5]){
			int index=-1; //��ʱ�±�
			int min=1024;
			for(int i=0;i<length;i++){
				if(!isLable[i]&&indexs[i]<min){
					min=indexs[i];
					index=i;
				}
			}
			isLable[index]=true;
			indexsCopy=n[index];
			for (int i = 0; i < length; i++) {
				if(!isLable[i]&&(indexsCopy[i]+min<indexs[i]))
						indexs[i]=indexsCopy[i]+min;
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(indexs[i]+" ");
		}
	}
	public static void main(String[] args) {
	     int[][] W = { 
	    		    {  0,   1,   4,  1024,  1024,  1024 },
	    		    {  1,   0,   2,   7,    5,  1024},
	    		    {  4,   2,   0,  1024,    1,  1024 }, 
	    		    { 1024,  7,  1024,   0,    3,    2 },
	    		    { 1024,  5,    1,   3,   0,    6 }, 
	    		    { 1024, 1024,  1024,   2,   6,    0 } };
	     ShortestPath_Dijkstra(W,0);
	}
}
