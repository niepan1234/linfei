package com.lin.ssm.test.DataStructure.≈≈–Ú;

public class ShellSortDemo {
	
	public static void ShellSort(SqList l){
		int i,j;
		int increment=l.r.length;
		do{
			increment=increment/3+1;   /*‘ˆ¡ø–Ú¡–*/
			for(i=increment+1;i<l.r.length;i++)
			{
				if(l.r[i]<l.r[i-increment]){
					l.r[0]=l.r[i];
					for(j=i-increment;j>0&&l.r[0]<l.r[j];j-=increment)
						l.r[j+increment]=l.r[j];
					l.r[j+increment]=l.r[0];
				}
				
			}
			
		}while(increment>1);
	}
	
	public static void main(String[] args) {
		SqList l=new SqList();
		l.r=new int[]{0,2,3,6,5,7,9,8};
		ShellSort(l);
		System.out.println(l);
	}
}
