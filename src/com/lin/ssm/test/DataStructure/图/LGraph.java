package com.lin.ssm.test.DataStructure.图;

public class LGraph {
	
	
	// 用顶点下标表示顶点，为整型
	GNode CreateGraph(int vertexNum){
		int v,w;
		GNode gnode=new GNode();
		gnode.setNe(0);
		gnode.setNv(vertexNum);
		return gnode;
	}
}
