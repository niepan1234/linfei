package com.lin.ssm.test.DataStructure.ͼ;

public class LGraph {
	
	
	// �ö����±��ʾ���㣬Ϊ����
	GNode CreateGraph(int vertexNum){
		int v,w;
		GNode gnode=new GNode();
		gnode.setNe(0);
		gnode.setNv(vertexNum);
		return gnode;
	}
}
