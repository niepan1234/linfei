package com.lin.ssm.test.DataStructure.二叉树;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
	private TreeNode root=null;
	
	public void createBinTree(TreeNode node1, TreeNode node2,TreeNode node3,TreeNode node4,TreeNode node5,TreeNode node6){
		 root=node1;
		 node1.setLeftChild(node2);
		 node1.setRightChild(node3);
		 node2.setLeftChild(node4);
		 node2.setRightChild(node5);
		 node3.setLeftChild(node6);
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public int getTreeHeight(TreeNode treeNode){
		if(treeNode==null)
			return 0;
		else{
			int i=getTreeHeight(treeNode.getLeftChild());
			int j=getTreeHeight(treeNode.getRightChild());
			return i>j?i+1:j+1;
		}
	}
	
	
	public int getTreeSize(TreeNode treeNode){
		if(treeNode==null)
			return 0;
		else
			return 1+getTreeSize(treeNode.getLeftChild())+getTreeSize(treeNode.getRightChild());
	}
	
	/**
	 * 返回父节点
	 */
	public TreeNode getParent(TreeNode root,TreeNode treeNode){
		if(root==null||treeNode==root)
			return null;
		else{
			if(root.getLeftChild()==treeNode||root.getRightChild()==treeNode)
				return root;
			else{
				TreeNode t;
				if((t=getParent(root.getLeftChild(),treeNode))!=null)
					return t;
				else
					return getParent(root.getRightChild(),treeNode);
			}
		}
		
	}
	
	/**
	 * 返回左孩子
	 * @param treeNode
	 * @return
	 */
	public TreeNode getLeftChild(TreeNode treeNode){
		return treeNode==null?null:treeNode.getLeftChild();
	}
	
	/**
	 * 返回右孩子
	 * @param treeNode
	 * @return
	 */
	public TreeNode getRightChild(TreeNode treeNode){
		return treeNode==null?null:treeNode.getRightChild();
	}
	
	public void destory(TreeNode treeNode){
		if(treeNode!=null){
			destory(treeNode.getLeftChild());
			destory(treeNode.getRightChild());
			treeNode=null;
		}
	}
	
	
	public void visit(TreeNode treeNode){
		treeNode.isVisted=true;
		System.out.println(treeNode.getKey()+"-----------"+treeNode.getData());
	}
	
	
	public void preOrder(TreeNode treeNode){
		if(treeNode!=null){
			visit(treeNode);
			preOrder(treeNode.getLeftChild());
			preOrder(treeNode.getRightChild());
		}
	}
	
	public void inOrder(TreeNode treeNode){
		if(treeNode!=null){
			preOrder(treeNode.getLeftChild());
			visit(treeNode);
			preOrder(treeNode.getRightChild());
		}
	}
	
	public void proOrder(TreeNode treeNode){
		if(treeNode!=null){
			preOrder(treeNode.getLeftChild());
			preOrder(treeNode.getRightChild());
			visit(treeNode);
		}
	}
	
	//  非递归实现
	public void preOrder2(TreeNode treeNode){
		LinkedList<TreeNode> list=new LinkedList<TreeNode>();
		
	}
}
