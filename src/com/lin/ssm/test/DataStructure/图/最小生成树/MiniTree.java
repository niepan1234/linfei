package com.lin.ssm.test.DataStructure.图.最小生成树;

import java.util.TreeSet;

public class MiniTree {
	
	/**
	 * 
	 * @param graph  图
	 * @param start  开始节点
	 * @param n     图中的节点数
	 */
	public static void Prim(MGraph g){
		int min,j,k;
		int adjvex[]=new int[100];
		int lowcost[]=new int[100];
		lowcost[0]=0;   //初始化第一个权值为0，即v0加入生成树
		adjvex[0]=0;    // 初始化第一个顶点下标为0
		for (int i = 1; i < g.numVertexes; i++) {
			lowcost[i]=g.arcs[0][i];
			adjvex[i]=0;
		}
		for (int i = 1; i < g.numVertexes; i++) {
			min=g.maxvex;
			j=1; 
			k=0;  //存放最小值的下标
			while(j<g.numVertexes){
				if(lowcost[j]!=0&&lowcost[j]<min){
					min=lowcost[j];
					k=j;
				}
				j++;
			}
			System.out.println(adjvex[k]+":"+k);
			lowcost[k]=0;
			for (int l = 0; l < g.numVertexes; l++) {
				if(lowcost[l]!=0&&g.arcs[k][l]<lowcost[l])
				{
					lowcost[l]=g.arcs[k][l];
					adjvex[l]=k;
				}
			}
		}
	}
	
	/**
	 * kruskal算法生成最小生成树
	 * @param g
	 */
	public static void Kruskal(MGraph g){
		int i,n,m;
		Edge edges[]=new Edge[100];  //定义边集
		TreeSet<Edge> tree=new TreeSet<Edge>();
		int parent[]=new int[100];  //定义一数组来判断边与边是否形成环路
		//将邻接矩阵G转化为边集数组edges并按权从小到大排序
		for (int j = 0; j < g.numVertexes; j++) {
			for (int j2 = j+1; j2 < g.numVertexes; j2++) {
				tree.add(new Edge(j, j2, g.arcs[j][j2]));
			}
		}
		for (int j = 0; j < tree.size(); j++) {
			edges[j]=tree.pollFirst();
		}
		for (int j = 0; j < g.numVertexes; j++) {
			parent[j]=0;
		}
		// 循环每一条边
		for (int j = 0; j <g.numEdges; j++) {
			n=find(parent,edges[j].begin);
			m=find(parent, edges[j].end);
			if(n!=m)
			{
				parent[n]=m;  // 将此 边的结尾顶点放入下标为起点的parent中，表示此顶点已经在生成树集合中
				System.out.println(edges[j].begin+"--"+edges[j].end);
			}
		}
		
	}
	
	static int find(int[] parent,int f){
		while(parent[f]>0)
			f=parent[f];
		return f;
	}
	
	public static void main(String[] args) {
		MGraph g=new MGraph();
		g.CreateGraph(g);
		Kruskal(g);
	}
}
