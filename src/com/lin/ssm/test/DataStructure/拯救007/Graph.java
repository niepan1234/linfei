package com.lin.ssm.test.DataStructure.����007;

public class Graph {
	private int G[][];
	private int nv; // ������
	private int ne; // ����
	private int data[][];  //�洢���������
	
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
