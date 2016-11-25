package com.lin.ssm.test.Swing;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RuntimeDemo {
	public static void main(String[] args) {
		//Runtime r=Runtime.getRuntime();
		Frame f=new Frame();
		f.setSize(400, 300);
		f.setTitle("�ҵĴ���");
		final TextField tf=new TextField(30);
		Button b=new Button("Ǭ����Ų��");
		final TextArea ta=new TextArea(10,10);
		f.add(tf);
		f.add(b);
		f.add(ta);
		//b.setLabel("�ύ");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionevent) {
				String str=tf.getText().trim();
				if(str!=null&&!"".equals(str)){
					ta.append(str);
					ta.append("\r\n");
					tf.setText("");
					//��ȡ���
					tf.requestFocus();
				}
					
			}
		});
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
