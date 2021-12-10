package com.Albert.JavaWillSpielen;

import java.awt.event.*;
import javax.swing.*;

public class CounterButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	JLabel l;
	int i = 0;
	CounterButtonListener(JLabel l)
	{
		this.l=l;
	}
	public void actionPerformed1(ActionEvent e) {
		 i=i++;
		 l.setText(""+i);
	}
	
	
	
}
