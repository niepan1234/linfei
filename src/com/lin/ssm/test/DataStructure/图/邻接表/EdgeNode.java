package com.lin.ssm.test.DataStructure.图.邻接表;

// 存储指针节点
public class EdgeNode {
	private int adjvex;
	//private int weight;  //带权值的时候添加
	private EdgeNode next;
	public int getAdjvex() {
		return adjvex;
	}
	public void setAdjvex(int adjvex) {
		this.adjvex = adjvex;
	}
	public EdgeNode getNext() {
		return next;
	}
	public void setNext(EdgeNode next) {
		this.next = next;
	}
}


