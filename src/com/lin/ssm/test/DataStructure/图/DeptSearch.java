package com.lin.ssm.test.DataStructure.图;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DeptSearch {
	
	/**
	 * 深度遍历的方式   按一个节点一直深入找下去，直到没有节点
	 * @param cur  当前的元素
	 * @param visited  访问过的元素集合
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
		// 记录所有访问过的元素
		Set<NodeT> visited=new HashSet<NodeT>();
		// 用队列存放所有依次要访问元素
		Queue<NodeT> q=new LinkedList<NodeT>();
		// 把当前的元素加入队列尾
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
	  
	        //建立它们的关系  
	        a.outgoing.add(ab);  
	        a.outgoing.add(ac);  
	        a.outgoing.add(ad);  
	        a.outgoing.add(ah);  
	        b.outgoing.add(bc);  
	        d.outgoing.add(de);  
	        e.outgoing.add(ef);  
	        e.outgoing.add(eg);  
	        h.outgoing.add(hg);  
	  
	       /* System.out.println("深度遍历如下：");  
	        List<NodeT> visited=new ArrayList<NodeT>();
	        deptFirstSearch(a, visited);
	        System.out.println();
	        System.out.println("广度遍历如下：");*/  
	        widthSearch(a);
	}
}

class NodeT
{
	List<ArcT> outgoing;
	String word;  //点代表的字母
	public NodeT(String word){
		this.word=word;
		outgoing=new ArrayList<ArcT>();
	}
}
/**
 * 单个图点的关系
 * @author linfei
 *
 */
class ArcT
{
	NodeT start,end;  //开始点，结束点
	public ArcT(NodeT start,NodeT end){
		this.start=start;
		this.end=end;
	}
}