package com.Albert.JavaWillSpielen;

 import java.awt.Graphics;

import javax.swing.JPanel;

import com.Albert.util.ShowInFrame;



public class PaintableImage extends JPanel implements Paintable {

	MyImage mi;
	
	public PaintableImage(MyImage mi) {this.mi=mi;}
	 public PaintableImage(String name) {this.mi=new MyImage(name);}
	
	 public void paintTo(java.awt.Graphics g) {
		  g.drawImage(mi.get(),0,0,this); 
}
	 
	 public static void main(String [] args) {
		 PaintableImage pi = new PaintableImage("test.png");
		 System.out.println(pi.mi.get() .getHeight(pi));
		 ShowInFrame.show(new PaintablePanel(pi));





}}



