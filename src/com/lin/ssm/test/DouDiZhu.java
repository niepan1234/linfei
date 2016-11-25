package com.lin.ssm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DouDiZhu {
	public static void main(String[] args) {
		String[] huaSe={"♣","♢","♤","♡"};
		String[] shuZi={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		ArrayList<Integer> list=new ArrayList<Integer>();
		Map<Integer,String> map=new HashMap<Integer, String>();
		int count=0;
		for(String str2:shuZi)
			for(String str1:huaSe){
				map.put(count, str1.concat(str2));
				list.add(count);
				count++;
			}
		map.put(count, "大王");
		list.add(count);
		count++;
		map.put(count, "小王");
		list.add(count);
		// 洗牌
		Collections.shuffle(list);
		TreeSet<Integer>  zhangsan=new TreeSet<Integer>();
		TreeSet<Integer>  lisi=new TreeSet<Integer>();
		TreeSet<Integer>  wangwu=new TreeSet<Integer>();
		TreeSet<Integer>  dipai=new TreeSet<Integer>();
		for(int i=0;i<list.size();i++)
			if(i>=list.size()-3)
				dipai.add(list.get(i));
			else if(i%3==0)
				zhangsan.add(list.get(i));
			else if(i%3==1)
				lisi.add(list.get(i));
			else if(i%3==2)
				wangwu.add(list.get(i));
		kanPai("张三",zhangsan,map);
		kanPai("李四",lisi,map);
		kanPai("王五",wangwu,map);
		kanPai("底牌",dipai,map);
		
	}
	public static void kanPai(String name,TreeSet<Integer> set,Map<Integer,String> map){
		System.out.print(name+"的牌是：");
		for (Integer integer : set) {
			System.out.print(map.get(integer)+",");
		}
		System.out.println();
		
	}
}
