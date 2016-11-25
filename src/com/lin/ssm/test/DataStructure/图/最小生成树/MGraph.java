package com.lin.ssm.test.DataStructure.ͼ.��С������;

import java.util.Scanner;

public class MGraph {
	public static final int maxvex=100;  	//��󶥵���
	public static final  int  Inf=65535; 	// �����
	String vexs[]=new String[maxvex]; 	//���㼯��
	public int arcs[][]=new int[maxvex][maxvex];  // Ȩֵ�б�
	//private static boolean[] hasVisit; 		//��¼�Ƿ���ʹ�
	public int numVertexes,numEdges;       //ͼ�е�ǰ�Ķ������ͱ���
	
	public void CreateGraph(MGraph G){
		//System.out.println("���붥�����ͱ�����");
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
			//System.out.println("�����(vi,vj)���±�i,�±�j��Ȩw:");
			int m=sc.nextInt();
			int n=sc.nextInt();
			int w=sc.nextInt();
			G.arcs[m][n]=w;
			//���������ͼ��Գ�
			G.arcs[n][m]=w;
		}
		sc.close();
	}
	
}
