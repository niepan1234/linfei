package com.lin.ssm.test;

import java.io.IOException;
import java.io.Reader;

public class MyWriter {
	private Reader r;
	
	public MyWriter(Reader r) {
		super();
		this.r = r;
	}

	public String readLine() throws IOException{
		StringBuilder sb=new StringBuilder();
		int b=0;
		while((b=r.read())!=-1){
			if(b=='\r')
				continue;
			if(b=='\n')
				return sb.toString();
			sb.append((char)b);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	
	public void close() throws IOException{
		this.r.close();
	}
}
