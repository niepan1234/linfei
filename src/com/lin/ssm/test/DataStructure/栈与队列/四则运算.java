package com.lin.ssm.test.DataStructure.栈与队列;

import java.util.LinkedList;

public class 四则运算 {
	public static void main(String[] args) {
		String str="9+(3-1)*3+8/2";
		String newStr=toSuffixExpression(str);
		LinkedList<Integer> list=new LinkedList<Integer>();
		int result=-1;
		for (int i = 0; i < newStr.length(); i++) {
			char c=newStr.charAt(i);
			if(c>='0'&&c<='9')
				list.push(c-48);
			else{
				int b=list.pop();
				int a=list.pop();
				switch(c){
					case '+' : result=a+b; break;
					case '-' : result=a-b; break;
					case '*' : result=a*b; break;
					case '/' : result=a/b; break;
				}
				list.push(result);
			}
		}
		System.out.println(result);
	}
	
	public static boolean isProid(String str1,String str2){
		if("(".equals(str1))
			return false;
		if("*".equals(str1)||"/".equals(str1)){
			return true;
		}else if("+".equals(str1)||"-".equals(str1)){
			if("+".equals(str2)||"-".equals(str2)){
				return true;
			}
		}
		return false;
	}
	
	public static String toSuffixExpression(String str){
		LinkedList<String> list=new LinkedList<String>();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='0'&&c<='9')
				sb.append(c);
			else if(list.size()==0||c=='(')
				list.push(c+"");
			else {
				if(c==')'){
					while(!list.peek().equals("(")){
						sb.append(list.pop());
					}
					list.pop();
				}
				else if(isProid(list.peek(),c+"")){
					while(isProid(list.peek(),c+"")){
						sb.append(list.pop());
					}
					list.push(c+"");
				}else {
					list.push(c+"");
				}
			}
		}
		while(list.size()!=0){
			sb.append(list.pop());
		}
		return sb.toString();
	}
}
