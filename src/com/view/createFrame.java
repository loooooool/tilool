package com.view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//import com.frame.ThreadFrame;
///import com.frame.location;
//import com.view.EventHandler;
//import com.timer.location;
import com.timer.timer;


class location{
	static int locationValue = 0;
}



public class createFrame {

	
	public createFrame() {
		
		showFrameView();
		
	}
	
	public void showFrameView() {
		Image image;
		
		Frame f = new Frame("Login");
		
		JButton b1 = new JButton(new ImageIcon("c:\\7.jpg"));
		JButton b2 = new JButton(new ImageIcon("c:\\7.jpg"));
		JButton b3 = new JButton(new ImageIcon("c:\\7.jpg"));
		JButton b4 = new JButton(new ImageIcon("c:\\7.jpg"));
		JButton b5 = new JButton(new ImageIcon("c:\\7.jpg"));
		
		f.setLayout(new GridLayout(1,5));
		
		b1.setContentAreaFilled(false); b2.setContentAreaFilled(false);// JButton 영역 채우기 않함
		b3.setContentAreaFilled(false); b4.setContentAreaFilled(false); b5.setContentAreaFilled(false);
		
		b1.setBorderPainted(false); b2.setBorderPainted(false); //외곽선을 없애준다.
		b3.setBorderPainted(false); b4.setBorderPainted(false); b5.setBorderPainted(false);
		
		b1.setFocusPainted(false);b2.setFocusPainted(false);//선택되었을때 생기는 테두리 사용안함
		b3.setFocusPainted(false);b4.setFocusPainted(false);b5.setFocusPainted(false);
		
		b1.setOpaque(false); b2.setOpaque(false); // 투명하게
		b3.setOpaque(false); b4.setOpaque(false); b5.setOpaque(false);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		
		b1.addActionListener(new EventHandler());
		b2.addActionListener(new EventHandler());
		b3.addActionListener(new EventHandler());
		b4.addActionListener(new EventHandler());
		b5.addActionListener(new EventHandler());
		
		
		f.setUndecorated(true);
		f.setSize(300,50);
		f.setVisible(true);
		f.setAlwaysOnTop(true);
	}
	
	
	class EventHandler implements ActionListener{
		
		location lo = new location();
		
		public void actionPerformed(ActionEvent e) {
			//new ThreadFrame();
			//System.out.println();
			timer t1 = new timer(lo.locationValue);
			lo.locationValue+=40;
			t1.start();
		}
	}
	
	
}
