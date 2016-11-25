package com.lin.ssm.test.DataStructure.ͼ.�ڽӾ���;

import java.util.ArrayList;

class Weight{
	int row; 	//���
	int col;	//�յ�
	int weight; //Ȩֵ
	Weight(int row,int col,int weight)
	{
		this.row=row;
		this.col=col;
		this.weight=weight;
	}
	/**
	 * 
	 * @param g
	 * @param vertices
	 * @param n
	 * @param weight
	 * @param e  ����
	 * @throws Exception
	 */
	public static void createAdjGraphic(MyAdjGraphic g,Object[] vertices,int n,Weight[] weight,int e) throws Exception{
		// ��ʼ���ڵ�
		for (int i = 0; i < n; i++) {
			g.insertVertice(vertices[i]);
		}
		//��ʼ�����еı�
		for (int i = 0; i < e; i++) {
			g.insertEdges(weight[i].row, weight[i].col, weight[i].weight);
		}
		
	}
	public static void DFS(MyAdjGraphic g,int index){
		g.DFSTraverse(g);
	}
}
public class MyAdjGraphic {
	static final int maxWeight=-1;  // Ȩֵ
	ArrayList<Object> v=new ArrayList<Object>(); //��Žڵ�ļ���
	int[][] edges; //�ڽӾ���Ķ�ά����
	int numOfEdges; //�ߵ�����
	
	
	
	public Object getValueOfVertice(int index) {
		return this.v.get(index);
	}



	public int[][] getEdges() {
		return edges;
	}



	public int getNumOfEdges() {
		return numOfEdges;
	}



	/**
	 * �ڽӾ����ʼ��
	 * @param n   ά��
	 */
	public MyAdjGraphic(int n){
		edges=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j)
					edges[i][j]=0;
				else
					edges[i][j]=maxWeight;
			}
		}
		numOfEdges=0;
	}
	
	/**
	 * ��ȡĳ���ߵ�Ȩֵ
	 * @param v1
	 * @param v2
	 * @return
	 * @throws Exception
	 */
	public int getWeightOfEdges(int v1,int v2)throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1��v2Խ��");
		}
		return this.edges[v1][v2];
	}
	
	/**
	 * ����ڵ�
	 * @param obj
	 */
	public void insertVertice(Object obj){
		this.v.add(obj);
	}
	
	/**
	 * �����Ȩֵ�ı�
	 * @param v1
	 * @param v2
	 * @param weight
	 * @throws Exception
	 */
	public void insertEdges(int v1,int v2,int weight)throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1��v2Խ��");
		}
		this.edges[v1][v2]=weight;
		this.numOfEdges++;
	}
	
	/**
	 * ɾ����
	 * @param v1
	 * @param v2
	 * @throws Exception
	 */
	public void deleteEdges(int v1,int v2) throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1��v2Խ��");
		}
		if(v1==v2||this.edges[v1][v2]==maxWeight)
		{
			throw new  Exception("�߲�����");
		}
	}
	
	public void print(){
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < edges[i].length; j++) {
				System.out.print(edges[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean visited[] =new boolean[100];
	public void DFS(MyAdjGraphic g,int i){
		int j;
		visited[i]=true;
		System.out.print(g.v.get(i)+"->");
		for (j= 0; j < g.v.size(); j++) {
			if(g.edges[i][j]==-1&&!visited[j])
				DFS(g,j);
		}
	}
	
	public void DFSTraverse(MyAdjGraphic g){
		for (int i = 0; i < g.v.size(); i++) {
			visited[i]=false;
		}
		for (int i = 0; i < g.v.size(); i++) {
			if(!visited[i])
				DFS(g,i);
		}
	}
}
