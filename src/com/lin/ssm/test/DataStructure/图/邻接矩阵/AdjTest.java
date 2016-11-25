package com.lin.ssm.test.DataStructure.Í¼.ÁÚ½Ó¾ØÕó;

public class AdjTest {
	public static void main(String[] args) {
		MyAdjGraphic g=new MyAdjGraphic(5);
		Object[] vertices=new Object[]{'A','B','C','D'};
		Weight[] w=new Weight[]{new Weight(1, 0, 1),new Weight(2, 0, 1),new Weight(2, 1, 1),new Weight(1, 2, 1),new Weight(0, 3, 1)};
		try {
			Weight.createAdjGraphic(g,vertices,4,w,2);
			Weight.DFS(g, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
