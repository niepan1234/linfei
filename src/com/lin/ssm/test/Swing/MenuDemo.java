package com.lin.ssm.test.Swing;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo {
	public static void main(String[] args) {
		Frame f=new Frame("һ���˵�");
		f.setBounds(400, 200, 400, 300);
		MenuBar mb=new MenuBar();
		Menu m=new Menu("�ļ�");
		//Menu m1=new Menu("���Ϊ");
		MenuItem mi=new MenuItem("�˳�ϵͳ");
		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		m.add(mi);
		mb.add(m);
		f.setMenuBar(mb);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
