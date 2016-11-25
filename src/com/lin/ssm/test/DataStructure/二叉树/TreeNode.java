package com.lin.ssm.test.DataStructure.¶þ²æÊ÷;

public class TreeNode {
	private int key=0;
	private String data=null;
	public boolean isVisted=false;
	private TreeNode leftChild=null;
	private TreeNode rightChild=null;
	public TreeNode(){}
	public TreeNode(int key, String data) {
		super();
		this.key = key;
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public boolean isVisted() {
		return isVisted;
	}
	public void setVisted(boolean isVisted) {
		this.isVisted = isVisted;
	}
	public int getKey() {
		return key;
	}
	public String getData() {
		return data;
	};
	
	
}
