package com.lin.ssm.test.DataStructure.Í¼.×î¶ÌÂ·¾¶;

public class FloydDemo {
	
	static void shortest_floyd(int[][] n){
		int length=n.length;
		int D[][]=new int[length][length];
		int P[][]=new int[length][length];
		D=n;
		for (int i = 0; i <length; i++) {
			for (int j = 0; j <length; j++) {
				P[j][i]=i;
			}
		}
		for(int v0=0;v0<length;v0++)
			for (int i = 0; i <length; i++) {
					for(int j=0;j<length;j++){
						if(D[i][v0]+D[v0][j]<D[i][j]){
							D[i][j]=D[i][v0]+D[v0][j];
							P[i][j]=P[i][v0];
						}
				}
			}
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(D[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(P[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		   int[][] W = { 
	    		    {  0,    1,     5,      1024,   1024,  1024 , 1024,  1024, 1024 },
	    		    {  1,    0,     3,      7,       5,    1024,  1024 , 1024, 1024},
	    		    {  5,    3,     0,      1024,    1,    7,     1024 , 1024, 1024}, 
	    		    { 1024,  7,     1024,   0,       2,    1024,  3,     1024, 1024 },
	    		    { 1024,  5,     1,      2,       0,    3, 	  6,	 9,	   1024	}, 
	    		    { 1024,  1024,  7,      1024,    3,    0, 	  1024 , 5,	   1024	} ,
	    		    { 1024,  1024,  1024,   3,       6,    1024,  0,     2,    7 },
	    		    { 1024,  1024,  1024,   1024,    9,    5,     2,     0,    4 },
	    		    { 1024,  1024,  1024,   1024,    1024, 1024,  7,     4,    0 },
		   };
		   shortest_floyd(W);
	}
}
