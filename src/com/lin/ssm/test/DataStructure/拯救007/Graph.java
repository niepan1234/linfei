package com.lin.ssm.test.DataStructure.拯救007;

public class Graph {
	private int G[][];
	private int nv; // 顶点数
	private int ne; // 边数
	private int data[][];  //存储顶点的数据
	
	public int[][] getG() {
		return G;
	}
	public void setG(int[][] g) {
		G = g;
	}
	public int getNv() {
		return nv;
	}
	public void setNv(int nv) {
		this.nv = nv;
	}
	public int getNe() {
		return ne;
	}
	public void setNe(int ne) {
		this.ne = ne;
	}
	public int[][] getData() {
		return data;
	}
	public void setData(int[][] data) {
		this.data = data;
	}
	
	
}
