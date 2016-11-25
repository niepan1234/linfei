package com.lin.ssm.test;

import java.util.Scanner;

public class 美团java {
	
	/**
	 * 给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。 | 是二进制的或(or)运算，例如 3 | 5 = 7。 比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。

	输入描述:
	每组测试用例仅包含一组数据，每组数据为两个正整数 x , k。 满足 0 < x , k ≤ 2,000,000,000。
	
	输出描述:
	输出一个数y。

	输入例子:
	5 1

	输出例子:
	2
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int k=sc.nextInt();
		int result=1;
		int count=0;
		while(count!=k){
			if((x+result)==(x|result))
				count++;
			else result++;
		}
		System.out.println(result);
	}
}
