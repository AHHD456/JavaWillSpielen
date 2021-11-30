package com.Antonio.util;

import javax.swing.JComponent;
import javax.swing.JFrame;

import com.Antonio.JavaWillSpielen.PaintablePanel;

public class ShowInFrame {
	public static void show (String title, PaintablePanel paintablePanel) {
		JFrame f = new JFrame(title);
		f.add(paintablePanel);
		f.pack();
		f.setVisible(true);
		
	}
	
	public static void show (JComponent c) {
		show("", (PaintablePanel) c);
	}
}
