package com.lin.ssm.test.DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Lian();
	}
	
	/**
	 * L1-006. 连续因子
	 */
	public static void Lian(){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		List<Integer> list=new LinkedList<Integer>();
		int primeNumber = 2;// 定义最小的质数  
		while(num!=0){
			if(num%primeNumber==0){
				list.add(primeNumber);
				num/=primeNumber;
			    primeNumber=2;
			}else{
				primeNumber++;
			}
			if(num==primeNumber){
				list.add(primeNumber);
				break;
			}
		}
		System.out.println(list);
	}
	/**
	 * L1-005. 考试座位号
	 * @author niepan
	 *
	 */
	class Student{
		String number;
		int shijihao;
		int shangjihao;
		public Student(String number, int shijihao, int shangjihao) {
			super();
			this.number = number;
			this.shijihao = shijihao;
			this.shangjihao = shangjihao;
		}
		
	}
	
	public static void KaoShi(){
		Scanner sc=new Scanner(System.in);
		int cishu=sc.nextInt();
		Student[] ss=new Student[1000];
		for (int i = 0; i < cishu; i++) {
			String str=sc.next();
			int shijiNum=sc.nextInt();
			int shangjiNum=sc.nextInt();
			ss[i]=new Main().new Student(str, shijiNum, shangjiNum);
		}
		
		int chaxun=sc.nextInt();
		for (int i = 0; i < chaxun; i++) {
			int m=sc.nextInt();
			for (int j = 0; j < cishu; j++) {
				if(ss[j].shijihao==m)
					System.out.println(ss[j].number+" "+ss[j].shangjihao);
			}
		}
	}
	
	public static void Wendu(){
		Scanner sc=new Scanner(System.in);
		int F=sc.nextInt();
		int C=(int) ((F-32)*(5f/9f));
		System.out.println("Celsius = "+C);
	}
	
	public static void TongJi(){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		TreeSet<Character> set=new TreeSet<Character>();
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for (int i=0;i<str.length();i++) {
			Character string=str.charAt(i);
			set.add(string);
			if(map.get(string)==null)
				map.put(string, 1);
			else{
				int count=map.get(string)+1;
				map.put(string,count);
			}
		}
		
		for (Character string : set) {
			System.out.println(string+":"+map.get(string));
		}
		sc.close();
		
	}
}
