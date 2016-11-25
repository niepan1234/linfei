package com.lin.ssm.test.DataStructure.¶þ²æÊ÷.ÏßË÷¶þ²æÊ÷;

public class Node {
	private int data;
	private Node left;
	private boolean leftIsThread;
	private Node right;
	private boolean rightThread;
	
	public Node(int data){
		this.data=data;
		this.left=null;
		this.leftIsThread=false;
		this.rightThread=false;
		this.right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public boolean isLeftIsThread() {
		return leftIsThread;
	}

	public void setLeftIsThread(boolean leftIsThread) {
		this.leftIsThread = leftIsThread;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public boolean isRightThread() {
		return rightThread;
	}

	public void setRightThread(boolean rightThread) {
		this.rightThread = rightThread;
	}
	
	
}
