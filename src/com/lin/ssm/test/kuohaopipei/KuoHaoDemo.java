package com.lin.ssm.test.kuohaopipei;



public class KuoHaoDemo {
	
	public static void main(String[] args) {
		
		QueueDemo queue=new QueueDemo();
		String str="(((520+480)*38/10)/2*((520+480)*38/10)/2))";
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(c=='('||c==')')
				queue.QueueIn(c);
		}
		
		
		StackDemo stack=new StackDemo();
		int size=queue.size();
		for(int i=0;i<size;i++){
			char c=queue.QueueOut();
			char c2=c=='('?')':'(';
			if(stack.size()==0||c2!=stack.getStackTop())
				stack.StackIn(c);
			else{
				stack.StackOut();
			}
		}
		if(stack.size()==0)
			System.out.println("¸Ã×Ö·û´®À¨ºÅÆ¥Åä");
		else
			System.out.println("¸Ã×Ö·û´®À¨ºÅ²»Æ¥Åä");
	}
}
