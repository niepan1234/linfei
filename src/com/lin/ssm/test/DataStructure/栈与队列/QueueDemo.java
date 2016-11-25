package com.lin.ssm.test.DataStructure.’ª”Î∂”¡–;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		q.remove();
		q.remove();
		q.remove();
		System.out.println(q);
	}
}
