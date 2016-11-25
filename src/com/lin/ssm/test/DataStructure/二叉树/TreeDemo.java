package com.lin.ssm.test.DataStructure.¶þ²æÊ÷;

public class TreeDemo {
	public static void main(String[] args) {
		 TreeNode node1=new TreeNode(1, "A");
		 TreeNode node2=new TreeNode(2, "B");
		 TreeNode node3=new TreeNode(3, "C");
		 TreeNode node4=new TreeNode(4, "D");
		 TreeNode node5=new TreeNode(5, "E");
		 TreeNode node6=new TreeNode(6, "F");
		BinaryTree bt=new BinaryTree();
		bt.createBinTree(node1,node2,node3,node4,node5,node6);
		//System.out.println("the height of BinTree is :"+bt.getTreeHeight(bt.getRoot()));
		//System.out.println(bt.getTreeSize(bt.getRoot()));
		//TreeNode p=bt.getParent(bt.getRoot(), node6);
		//System.out.println(p.getKey()+"---------------"+p.getData());
		bt.preOrder(bt.getRoot());
		System.out.println("------------");
		bt.inOrder(bt.getRoot());
		System.out.println("------------");
		bt.proOrder(bt.getRoot());
	}
}
