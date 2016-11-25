package com.lin.ssm.test.ThreadPool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String  str="sadasdeqwddasd";
		char[] c=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for (char d : c) {
			Integer i=map.get(d);
			if(i==null)
				map.put(d, 1);
			else
				map.put(d, ++i);
		}
		Set<Character> set=map.keySet();
		for (Character character : set) {
			System.out.print(character+":"+map.get(character)+",");
		}
	}
}
