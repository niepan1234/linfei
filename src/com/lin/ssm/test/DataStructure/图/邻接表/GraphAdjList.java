package com.lin.ssm.test.DataStructure.图.邻接表;

import java.util.Scanner;

public class GraphAdjList {
	VertexNode[] adjList;
	int numVertexes,numEdges;  //图中当前顶点数和边数
	
	
	
	

	public GraphAdjList() {
		super();
		this.adjList=new VertexNode[100];
		for (VertexNode vertexNode : adjList) {
			vertexNode=new VertexNode();
			//System.out.println(vertexNode);
		}
		System.out.println("初始化完毕");
	}

	public void CreateALGraph(GraphAdjList G){
		int i,j,k;
		EdgeNode e;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		G.numVertexes=sc.nextInt();
		G.numEdges=sc.nextInt();
		for (int l = 0; l <G.numVertexes ; l++) {
			String s=sc.next();
			G.adjList[l]=new VertexNode();
			G.adjList[l].data=s;
		}
		for (int l = 0; l < G.numEdges; l++) {
			System.out.println("输入边两端的点");
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
