package com.Albert.JavaWillSpielen;
import javax.swing.*;

import com.Albert.util.ShowInFrame;



public class SimpleButton extends JPanel{

	JButton b1 = new JButton("+++");
	JButton b2 = new JButton("---");
	JButton b3 = new JButton("0");
	
	JLabel l = new JLabel("000");
	
	
	
	
	
	
	
	SimpleButton(){
		add(b1);
		add(b2);
		add(b3);
		add(l);
		
	}
	
	public static void main(String [] args)
	{
     ShowInFrame.show(new SimpleButton());
	}
	
}
