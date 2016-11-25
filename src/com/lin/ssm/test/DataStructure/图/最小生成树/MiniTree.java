package com.lin.ssm.test.DataStructure.ͼ.��С������;

import java.util.TreeSet;

public class MiniTree {
	
	/**
	 * 
	 * @param graph  ͼ
	 * @param start  ��ʼ�ڵ�
	 * @param n     ͼ�еĽڵ���
	 */
	public static void Prim(MGraph g){
		int min,j,k;
		int adjvex[]=new int[100];
		int lowcost[]=new int[100];
		lowcost[0]=0;   //��ʼ����һ��ȨֵΪ0����v0����������
		adjvex[0]=0;    // ��ʼ����һ�������±�Ϊ0
		for (int i = 1; i < g.numVertexes; i++) {
			lowcost[i]=g.arcs[0][i];
			adjvex[i]=0;
		}
		for (int i = 1; i < g.numVertexes; i++) {
			min=g.maxvex;
			j=1; 
			k=0;  //�����Сֵ���±�
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
	 * kruskal�㷨������С������
	 * @param g
	 */
	public static void Kruskal(MGraph g){
		int i,n,m;
		Edge edges[]=new Edge[100];  //����߼�
		TreeSet<Edge> tree=new TreeSet<Edge>();
		int parent[]=new int[100];  //����һ�������жϱ�����Ƿ��γɻ�·
		//���ڽӾ���Gת��Ϊ�߼�����edges����Ȩ��С��������
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
		// ѭ��ÿһ����
		for (int j = 0; j <g.numEdges; j++) {
			n=find(parent,edges[j].begin);
			m=find(parent, edges[j].end);
			if(n!=m)
			{
				parent[n]=m;  // ���� �ߵĽ�β��������±�Ϊ����parent�У���ʾ�˶����Ѿ���������������
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
