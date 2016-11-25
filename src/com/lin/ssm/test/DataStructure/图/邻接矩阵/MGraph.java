package com.lin.ssm.test.DataStructure.ͼ.�ڽӾ���;

import java.util.Scanner;

public class MGraph {
	private static final int maxvex=100;  	//��󶥵���
	private static final  int  Inf=65535; 	// �����
	private String vexs[]=new String[maxvex]; 	//���㼯��
	private static  int arcs[][]=new int[maxvex][maxvex];  // Ȩֵ�б�
	//private static boolean[] hasVisit; 		//��¼�Ƿ���ʹ�
	private int numVertexes,numEdges;       //ͼ�е�ǰ�Ķ������ͱ���
	
	public void CreateGraph(MGraph G){
		System.out.println("���붥�����ͱ�����");
		Scanner sc=new Scanner(System.in);
		numVertexes=sc.nextInt();
		numEdges=sc.nextInt();
		// ���붥����Ϣ
		for (int i = 0; i <numVertexes; i++) {
			vexs[i]=sc.next();
		}
		// ��ʼ���ڽӾ���
		for (int i = 0; i < numVertexes; i++) {
			for (int j = 0; j < numVertexes; j++) {
				arcs[i][j]=Inf;
			}
		}
		for (int i = 0; i < numEdges; i++) {
			System.out.println("�����(vi,vj)���±�i,�±�j��Ȩw:");
			int m=sc.nextInt();
			int n=sc.nextInt();
			int w=sc.nextInt();
			G.arcs[m][n]=w;
			//���������ͼ��Գ�
			G.arcs[n][m]=w;
		}
	}
	
}
