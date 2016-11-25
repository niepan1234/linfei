package com.lin.ssm.test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import redis.clients.jedis.Jedis;


public class Test {
	public static void main(String[] args) throws InterruptedException {
		/*Jedis jedis=new Jedis("localhost");
		jedis.set("name", "林飞");
		jedis.expire("name", 10);
		while(true){
			if(jedis.get("name")==null){
				System.out.println("键值对被清除");
				break;
			}else{
				System.out.println(jedis.get("name"));
			}
			Thread.sleep(1000);
		}*/
		/*int[] arr=new int[3];
		int[] a=arr;
		a[0]=1;
		System.out.println(arr[0]);*/
		Test t=new Test();
		System.out.println(t.getClass().getName());
		TreeSet<Student> c=new TreeSet(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num1=s1.getAge()-s2.getAge();
				int num2=num1==0?s1.getName().compareTo(s2.getName()):num1;
				return num2;
			}
		});
		c.add(new Student("zhangsan",11));
		c.add(new Student("zhangsan",12));
		c.add(new Student("lisi",21));
		Iterator<Student> it=c.iterator();
		for (Student student : c) {
			System.out.println(student);
		}
		
	}
}
