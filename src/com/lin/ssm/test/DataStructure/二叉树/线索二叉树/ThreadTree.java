package com.lin.ssm.test.DataStructure.二叉树.线索二叉树;

public class ThreadTree {
	private Node root;
	private int size;
	private Node pre=null; //线索化的时候保存前驱
	
	public ThreadTree(){
		this.root=null;
		this.size=0;
		this.pre=null;
	}
	
	public ThreadTree(int[] data)  
    {  
        this.pre = null;  
        this.size = data.length;  
        this.root = createTree(data, 1);   // 创建二叉树  
    }

	private Node createTree(int[] data, int index) {
		 /*  1
		   2   3
		 4  5  6  7
	  8 9 10  */
		if(index>data.length)  return null;
		Node node=new Node(data[index-1]);
		Node left=createTree(data, index*2);
		Node right=createTree(data, index*2+1);
		node.setLeft(left);
		node.setRight(right);
		return node; 
	} 
	
	/**
	 * 先序遍历
	 * @param root
	 */
	public void preList(Node root){
		if(root!=null){
			System.out.print(root.getData()+",");
			preList(root.getLeft());
			preList(root.getRight());
		}
	}
	
	public void inList(Node root){
		if(root!=null){
			inList(root.getLeft());
			System.out.print(root.getData()+",");
			inList(root.getRight());
		}
	}
	
	public void  proList(Node root){
		if(root!=null){
			proList(root.getLeft());
			proList(root.getRight());
			System.out.print(root.getData()+",");
		}
	}
	
	public void inThreading(Node root){
		if(root!=null){
			inThreading(root.getLeft());
			if(root.getLeft()==null){
				root.setLeftIsThread(true);
				root.setLeft(pre);
			}
			if(pre!=null&&pre.getRight()==null){
				pre.setRight(root);
				pre.setRightThread(true);
			}
			pre=root;
			inThreading(root.getRight());
		}
	}
	/**
	 * 中序遍历线索二叉树
	 * @return
	 */
	public  void inrecurseInList(Node root){
		if(root!=null){
			while(root!=null&&!root.isLeftIsThread()){
				root=root.getLeft();
			}
			do{
				System.out.print(root.getData()+",");
				if(root.isRightThread())
				{
					root=root.getRight();
				}else{
					root=root.getRight();
					while(root!=null&&!root.isLeftIsThread()){
						root=root.getLeft();
					}
				}
			}while(root!=null);
		}
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ThreadTree threadTree=new ThreadTree(data);
	/*	threadTree.preList(threadTree.getRoot());
		System.out.println();
		threadTree.inList(threadTree.getRoot());
		System.out.println();
		threadTree.proList(threadTree.getRoot());
		System.out.println();*/
		threadTree.inThreading(threadTree.getRoot());
		threadTree.inrecurseInList(threadTree.getRoot());
	}
}
