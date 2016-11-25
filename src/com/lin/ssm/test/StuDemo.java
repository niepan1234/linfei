package com.lin.ssm.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StuDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Student s=new Student("ÕÅÈý", 12);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("2.txt"));
		oos.writeObject(s);
		oos.close();*/
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("2.txt"));
		Student s1=(Student)ois.readObject();
		System.out.println(s1+s1.getAddress());
		ois.close();
		
	}
}
