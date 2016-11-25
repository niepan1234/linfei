package com.lin.ssm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SafeDemo {
	public static void main(String[] args) {
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		
	}
}
