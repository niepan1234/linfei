package com.lin.ssm.test.DataStructure.图.邻接矩阵;

import java.util.ArrayList;

class Weight{
	int row; 	//起点
	int col;	//终点
	int weight; //权值
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
	 * @param e  边数
	 * @throws Exception
	 */
	public static void createAdjGraphic(MyAdjGraphic g,Object[] vertices,int n,Weight[] weight,int e) throws Exception{
		// 初始化节点
		for (int i = 0; i < n; i++) {
			g.insertVertice(vertices[i]);
		}
		//初始化所有的边
		for (int i = 0; i < e; i++) {
			g.insertEdges(weight[i].row, weight[i].col, weight[i].weight);
		}
		
	}
	public static void DFS(MyAdjGraphic g,int index){
		g.DFSTraverse(g);
	}
}
public class MyAdjGraphic {
	static final int maxWeight=-1;  // 权值
	ArrayList<Object> v=new ArrayList<Object>(); //存放节点的集合
	int[][] edges; //邻接矩阵的二维数组
	int numOfEdges; //边的数量
	
	
	
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
	 * 邻接矩阵初始化
	 * @param n   维数
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
	 * 获取某条边的权值
	 * @param v1
	 * @param v2
	 * @return
	 * @throws Exception
	 */
	public int getWeightOfEdges(int v1,int v2)throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1或v2越界");
		}
		return this.edges[v1][v2];
	}
	
	/**
	 * 插入节点
	 * @param obj
	 */
	public void insertVertice(Object obj){
		this.v.add(obj);
	}
	
	/**
	 * 插入带权值的边
	 * @param v1
	 * @param v2
	 * @param weight
	 * @throws Exception
	 */
	public void insertEdges(int v1,int v2,int weight)throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1或v2越界");
		}
		this.edges[v1][v2]=weight;
		this.numOfEdges++;
	}
	
	/**
	 * 删除边
	 * @param v1
	 * @param v2
	 * @throws Exception
	 */
	public void deleteEdges(int v1,int v2) throws Exception
	{
		if(v1<0||v1>=v.size()||v2<0||v2>=v.size()){
			throw new Exception("v1或v2越界");
		}
		if(v1==v2||this.edges[v1][v2]==maxWeight)
		{
			throw new  Exception("边不存在");
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
