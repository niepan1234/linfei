package com.lin.ssm.test.DataStructure.链表;

public class CircularChainNode {
	private MyNode head;
	private int  size;
	private int modCount;
	
	public int getSize(){
		return size;
	}
	
	public MyNode getFirstNode(){
		return head;
	}
	public void addNode(MyNode node){
		if(!containsNode(node.getValue())){
			if(head==null){   //如果头结点为空
				head=node;
				head.next=head;
				size++;
				modCount++;
			}else{
				MyNode m=head;
				while(m.next!=head)
					m=m.next;
				node.next=head;
				head=node;
				m.next=head;
				size++;
				modCount++;
			}
		}
	}
	
	public boolean containsNode(int value){
		if(size!=0){
			for(MyNode f=head;f.next!=head;f=f.next){
				if(f.getValue()==value)
					return true;
			}
		}
		return false;
	}
	
	public void printALl(){
		for(MyNode n=head;n.next!=head;n=n.next){
			System.out.print(n.getValue());
			if(n.next!=null)
				System.out.print("--->");
		}
		System.out.println();
	}
	
	public void insert(MyNode node,int k){
		if(k>=0&&k<=size){
			if(k==0&&size==0)  head=node;
			else if(k==0&&size>0) { node.next=head.next; head=node;}
			else {
				MyNode n=head;
				for(int i=1;i<k;i++){
					n=n.next;
				}
				node.next=n.next;
				n.next=node;
			}
		}else{
			System.out.println("插入失败,k不合法");
		}
	}
	
	public void deleteNode(int index){
		if(index>=0&&index<=size){
			if(index==0&&size==1) { head=null; size=0; modCount=0;}
			else if(index==0) { head=head.next; size--; modCount--;}
			else {
				MyNode n=head;
				for(int i=1;i<index;i++){
					n=n.next;
				}
				n.next=n.next.next;
				size--; modCount--;
			}
		}
	}
}
