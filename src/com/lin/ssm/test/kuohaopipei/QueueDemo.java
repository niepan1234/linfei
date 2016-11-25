
package com.lin.ssm.test.kuohaopipei;

import java.util.LinkedList;

public class QueueDemo {
	private LinkedList<Character> linkedList=new LinkedList<Character>();
	
	
	public void QueueIn(char  c){
		linkedList.addFirst(c);
	}
	
	public char QueueOut(){
		return linkedList.removeFirst();
	}
	
	public int size(){
		return linkedList.size();
	}
}
