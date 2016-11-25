package com.lin.ssm.test.kuohaopipei;

import java.util.LinkedList;

public class StackDemo {
	private LinkedList<Character> linkedList=new LinkedList<Character>();
	
	public void StackIn(char  c){
		linkedList.addLast(c);;
	}
	
	public char StackOut(){
		return linkedList.removeLast();
	}
	
	public int size(){
		return linkedList.size();
	}
	
	public char getStackTop(){
		return linkedList.getLast();
	}
}