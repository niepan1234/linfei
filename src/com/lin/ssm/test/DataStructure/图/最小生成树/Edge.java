package com.lin.ssm.test.DataStructure.图.最小生成树;

public class Edge implements Comparable<Edge>{
	int begin;
	int end;
	int weight;
	@Override
	public int compareTo(Edge o) {
		return this.weight>o.weight?1:-1;
	}
	public Edge(int begin, int end, int weight) {
		super();
		this.begin = begin;
		this.end = end;
		this.weight = weight;
	}
	
	
}
