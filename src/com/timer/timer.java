package com.timer;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;







public class timer extends Thread {

		
		JLabel timerLabel = null;
	   
	    
	    int k=350;
	    
	    public timer(int level)
	    {
	    	JFrame j = new JFrame();
	        j.setTitle("Timer Test");
	        Container c = j.getContentPane();
	       // c.setLayout(new FlowLayout());
	        timerLabel = new JLabel("0");
	        timerLabel.setFont(new Font("Gothic",Font.ITALIC,30));
	     
	        c.add(timerLabel);
	        
	        j.setUndecorated(true);
	        j.setSize(80,50);
	        j.setVisible(true);
	       
	        
	        //toolkit(���� ��ġ ����)
	        Toolkit tk = Toolkit.getDefaultToolkit();
	        Dimension screenSize = tk.getScreenSize();
	        
	        j.setLocation(screenSize.width/2 +500, screenSize.height/2 - (450-level) );// ������ �۾����� ���������� �̵� , ��������Ŀ���� ���οö�
	        //j.setVisible(true);
	        j.setAlwaysOnTop(true);      
	      
	    }
	    
	    
	    public void run() {
	    	
	    	 while(true)
	         {
	    		
	             timerLabel.setText(""+k);
	            
	             try {
	                 Thread.sleep(1000);
	             } catch (InterruptedException e) {
	                 e.printStackTrace();
	             }
	             k--; 
	         }
	    }
		
		
	}


