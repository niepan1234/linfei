package com.lin.ssm.test.DataStructure.ͼ.�ڽӱ�;

import java.util.Scanner;

public class GraphAdjList {
	VertexNode[] adjList;
	int numVertexes,numEdges;  //ͼ�е�ǰ�������ͱ���
	
	
	
	

	public GraphAdjList() {
		super();
		this.adjList=new VertexNode[100];
		for (VertexNode vertexNode : adjList) {
			vertexNode=new VertexNode();
			//System.out.println(vertexNode);
		}
		System.out.println("��ʼ�����");
	}

	public void CreateALGraph(GraphAdjList G){
		int i,j,k;
		EdgeNode e;
		Scanner sc=new Scanner(System.in);
		System.out.println("�����붥�����ͱ���");
		G.numVertexes=sc.nextInt();
		G.numEdges=sc.nextInt();
		for (int l = 0; l <G.numVertexes ; l++) {
			String s=sc.next();
			G.adjList[l]=new VertexNode();
			G.adjList[l].data=s;
		}
		for (int l = 0; l < G.numEdges; l++) {
			System.out.println("��������˵ĵ�");
			int start=sc.nextInt();
			int end=sc.nextInt();
			EdgeNode en=new EdgeNode();
			en.setAdjvex(end);
			en.setNext(G.adjList[start].firstNode);
			G.adjList[start].firstNode=en;
		}
	}
	
	public static int getAdjNum(GraphAdjList G,int i){
		int num=0;
		EdgeNode en=G.adjList[i].firstNode;
		while(en!=null){
			en=en.getNext();
			num++;
		}
		return num;
	}
	
	public static void main(String[] args) {
		GraphAdjList ga=new GraphAdjList();
		new GraphAdjList().CreateALGraph(ga);
		System.out.println(getAdjNum(ga,0));
		
	}
}
