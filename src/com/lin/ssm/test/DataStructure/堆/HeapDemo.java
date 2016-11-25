package com.lin.ssm.test.DataStructure.¶Ñ;

import java.util.Scanner;

public class HeapDemo {
	public static void main(String[] args) {
		Heap heap=new Heap();
		Scanner sc=new Scanner(System.in);
		heap.create();
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++){
			heap.insert(sc.nextInt());
		}
		
		for(int j=0;j<n;j++){
			int z=sc.nextInt();
			System.out.print(heap.getH()[z]+" ");
			while(z>1){
				System.out.print(heap.getH()[z/2]+" ");
				z/=2;
			}	
		}
		sc.close();
	}
}
