package com.lin.ssm.test.DataStructure.图.最小生成树;

import java.util.Scanner;

public class MGraph {
	public static final int maxvex=100;  	//最大顶点数
	public static final  int  Inf=65535; 	// 无穷大
	String vexs[]=new String[maxvex]; 	//顶点集合
	public int arcs[][]=new int[maxvex][maxvex];  // 权值列表
	//private static boolean[] hasVisit; 		//记录是否访问过
	public int numVertexes,numEdges;       //图中当前的顶点数和边数
	
	public void CreateGraph(MGraph G){
		//System.out.println("输入顶点数和边数：");
		Scanner sc=new Scanner(System.in);
		numVertexes=sc.nextInt();
		numEdges=sc.nextInt();
		// 输入顶点信息
		for (int i = 0; i <numVertexes; i++) {
			vexs[i]=sc.next();
		}
		// 初始化邻接矩阵
		for (int i = 0; i < numVertexes; i++) {
			for (int j = 0; j < numVertexes; j++) {
				arcs[i][j]=Inf;
			}
		}
		for (int i = 0; i < numEdges; i++) {
			//System.out.println("输入边(vi,vj)的下标i,下标j和权w:");
			int m=sc.nextInt();
			int n=sc.nextInt();
			int w=sc.nextInt();
			G.arcs[m][n]=w;
			//如果是无向图则对称
			G.arcs[n][m]=w;
		}
		sc.close();
	}
	
}
