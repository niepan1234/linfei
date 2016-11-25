package com.lin.ssm.test.DataStructure.Õü¾È007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ğı×ªÊı×é {
	public static void main(String[] args) {
		int[] i=new int[]{3,4,5,6,7,8,1,2};
		int n=new Scanner(System.in).nextInt();
		int length=i.length;
		if(i[0]<i[length-1])
			System.out.println(Arrays.binarySearch(i, n));
		else{
			int bandary=finBandary(i);
			if(i[bandary]>=n)
				System.out.println(Arrays.binarySearch(getFirstArray(i,bandary).get(0), n));
			else 
				System.out.println(bandary+1+Arrays.binarySearch(getFirstArray(i,bandary).get(1),n));
		}
	}
	
	public static int finBandary(int[] n){
		int start=0;
		int end=n.length-1;
		while(true){
			if(n[end/2]>=n[start])
				start=(start+end)/2;
			if(n[(start+end)/2]<=n[end])
				end=(start+end)/2;
			if(n[start]>n[end]&&(end-start==1)){
				break;
			}
		}
		return start==0?-1:start;
	}
	
	public static List<Integer[]> getFirstArray(int[] n,int bandary){
		List<Integer[]> list=new ArrayList<Integer[]>();
		int size=bandary+1;
		Integer newArray[]=new Integer[size];
		Integer newArray2[]=new Integer[n.length-bandary-1];
		for(int i=0;i<=bandary;i++)
			newArray[i]=n[i];
		for(int i=0,j=(bandary+1);j<n.length;i++,j++)
			newArray2[i]=n[j];
		list.add(newArray);
		list.add(newArray2);
		return list;
	}
	
}
