package com.lin.ssm.test.DataStructure.Á´±í;

public class MyNode {
	public MyNode next;
	private int value;
	public MyNode getNext() {
		return next;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public MyNode(int value) {
		super();
		this.value = value;
	}
	public MyNode() {
		super();
	}
	
}
