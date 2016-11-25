package com.lin.ssm.test.Swing;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PatternDemo {
    public static void main(String[] args) {
		Frame f=new Frame("不能输入非法字符");
		f.setBounds(400, 200, 400, 300);
		Label l=new Label("不能输入非数字");
		TextField t1=new TextField(30);
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent keyevent) {
				char c=keyevent.getKeyChar();
				if(!(c>='0'&&c<='9'))
					keyevent.consume();
					
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
		f.add(t1);
		f.add(l);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
