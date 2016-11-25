package com.lin.ssm.test.Swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mouse {
	public static void main(String[] args) {
		final Frame f=new Frame();
		f.setSize(400, 300);
		f.setTitle("�ҵĴ���");
		final Color c=f.getBackground();
		Button b1=new Button("��ɫ");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent mouseevent) {
				f.setBackground(Color.green);
			}
			@Override
			public void mouseExited(MouseEvent mouseevent) {
				f.setBackground(Color.white);
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
