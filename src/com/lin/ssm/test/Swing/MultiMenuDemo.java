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
import java.io.IOException;

import javax.swing.JOptionPane;

public class MultiMenuDemo {
	public static void main(String[] args) {
		final Frame f=new Frame("һ���˵�");
		f.setBounds(400, 200, 400, 300);
		MenuBar mb=new MenuBar();
		//Menu m=new Menu("�ļ�");
		//Menu m1=new Menu("���Ϊ");
		Menu m1=new Menu("�ļ�");
		Menu mi=new Menu("save");
		MenuItem mi2=new MenuItem("save as");
		MenuItem tuichu=new MenuItem("�˳�");
		tuichu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionevent) {
				JOptionPane.showMessageDialog(f, "����������");
				//System.exit(0);
				
			}
		});
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r=Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		m1.add(tuichu);
		mi.add(mi2);
		m1.add(mi);
		mb.add(m1);
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
