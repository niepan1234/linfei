package com.lin.ssm.test;

import java.util.Scanner;

public class ����java {
	
	/**
	 * ���� x, k �������� x + y = x | y �ĵ� k С�������� y �� | �Ƕ����ƵĻ�(or)���㣬���� 3 | 5 = 7�� ���統 x=5��k=1ʱ���� 2����Ϊ5+1=6 ������ 5|1=5���� 5+2=7 ���� 5 | 2 = 7��

	��������:
	ÿ���������������һ�����ݣ�ÿ������Ϊ���������� x , k�� ���� 0 < x , k �� 2,000,000,000��
	
	�������:
	���һ����y��

	��������:
	5 1

	�������:
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
