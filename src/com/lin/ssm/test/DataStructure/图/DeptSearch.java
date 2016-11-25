package com.lin.ssm.test.DataStructure.ͼ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DeptSearch {
	
	/**
	 * ��ȱ����ķ�ʽ   ��һ���ڵ�һֱ��������ȥ��ֱ��û�нڵ�
	 * @param cur  ��ǰ��Ԫ��
	 * @param visited  ���ʹ���Ԫ�ؼ���
	 */
	public static void deptFirstSearch(NodeT cur,List<NodeT> visited){
		if(visited.contains(cur)) return;
		visited.add(cur);
		System.out.print(cur.word+",");
		for (int i = 0; i < cur.outgoing.size(); i++) {
			deptFirstSearch(cur.outgoing.get(i).end,visited);
		}
	}
	
	public static void widthSearch(NodeT start){
		// ��¼���з��ʹ���Ԫ��
		Set<NodeT> visited=new HashSet<NodeT>();
		// �ö��д����������Ҫ����Ԫ��
		Queue<NodeT> q=new LinkedList<NodeT>();
		// �ѵ�ǰ��Ԫ�ؼ������β
		q.offer(start);
		while(!q.isEmpty()){
			NodeT cur=q.poll();
			if(!visited.contains(cur)){
				visited.add(cur);
				System.out.print(cur.word+",");
				for (int i = 0; i < cur.outgoing.size(); i++) {
					q.offer(cur.outgoing.get(i).end);
				}
			}
		}
	}
	public static void main(String[] args) {
		 	NodeT a=new NodeT("a");  
	        NodeT b=new NodeT("b");  
	        NodeT c=new NodeT("c");  
	        NodeT d=new NodeT("d");  
	        NodeT e=new NodeT("e");  
	        NodeT f=new NodeT("f");  
	        NodeT g=new NodeT("g");  
	        NodeT h=new NodeT("h");  
	        ArcT ab=new ArcT(a,b);  
	        ArcT ac=new ArcT(a,c);  
	        ArcT ad=new ArcT(a,d);  
	        ArcT ah=new ArcT(a,h);  
	        ArcT bc=new ArcT(b,c);  
	        ArcT de=new ArcT(d,e);  
	        ArcT ef=new ArcT(e,f);  
	        ArcT eg=new ArcT(e,g);  
	        ArcT hg=new ArcT(h,g);  
	  
	        //�������ǵĹ�ϵ  
	        a.outgoing.add(ab);  
	        a.outgoing.add(ac);  
	        a.outgoing.add(ad);  
	        a.outgoing.add(ah);  
	        b.outgoing.add(bc);  
	        d.outgoing.add(de);  
	        e.outgoing.add(ef);  
	        e.outgoing.add(eg);  
	        h.outgoing.add(hg);  
	  
	       /* System.out.println("��ȱ������£�");  
	        List<NodeT> visited=new ArrayList<NodeT>();
	        deptFirstSearch(a, visited);
	        System.out.println();
	        System.out.println("��ȱ������£�");*/  
	        widthSearch(a);
	}
}

class NodeT
{
	List<ArcT> outgoing;
	String word;  //��������ĸ
	public NodeT(String word){
		this.word=word;
		outgoing=new ArrayList<ArcT>();
	}
}
/**
 * ����ͼ��Ĺ�ϵ
 * @author linfei
 *
 */
class ArcT
{
	NodeT start,end;  //��ʼ�㣬������
	public ArcT(NodeT start,NodeT end){
		this.start=start;
		this.end=end;
	}
}