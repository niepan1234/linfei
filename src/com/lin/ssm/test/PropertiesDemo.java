package com.lin.ssm.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException, IOException {
		File file=new File("1.txt");
		if(!file.exists())  file.createNewFile();
		Properties properties=new Properties();
		Reader r=new FileReader("1.txt");
		properties.load(r);
		r.close();
		int count=Integer.valueOf((String)properties.get("count"));
		if(count>=5)
			System.out.println("�����ѽ������븶�����棡");
		else{
			System.out.println("����Ϸ");
			properties.setProperty("count", ++count+"");
			properties.store(new FileWriter("1.txt"), null);
		}
		/*Set<String> set=properties.stringPropertyNames();
		for (String str : set) {
			if(str.equals("age")){
				properties.setProperty(str, "20");
				break;
			}
		}
		Writer w=new FileWriter("1.txt");
		properties.store(w, "����");
		w.close();*/
		/*Writer writer=new FileWriter("1.txt");
		Set<Object> set=properties.keySet();
		if(set.size()==0){
			properties.setProperty("admin", "admin");
			properties.store(writer, "�û��ʺ�");
		}
		writer.close();
		System.out.println("��ʼ���ɹ�");*/
		
	}
}
