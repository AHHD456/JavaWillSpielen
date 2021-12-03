package com.Antonio.JavaWillSpielen;
import javax.swing.*;
import com.Antonio.util.ShowInFrame;



public class SimpleButton extends JPanel{

	JButton b = new JButton("push this button");
	JLabel l = new JLabel("000");
	
	
	
	
	
	
	
	SimpleButton(){
		add(b);
		add(l);
		
	}
	
	public static void main(String [] args)
	{
     ShowInFrame.show(new SimpleButton());
	}
	
}
